package myjava.mybignumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Tác giả: Lê Nguyên Hoài Nghĩa.
 * MyBigNumber là lớp để Cộng 2 số lớn bằng 2 chuỗi
 * sum là hàm để thực hiện phép cộng 2 chuỗi số
 */
public class MyBigNumber {

    private IReceiver ireceiver;

    public MyBigNumber(final IReceiver ireceiver) {

        this.ireceiver = ireceiver;
    }
    
    /**
     * Để thực hiện phép cộng, ta cần 2 chuỗi làm tham số cho hàm sum trong đó:
     * 2 chuỗi này đều chỉ chứa các kí số từ '0' đến '9'.
     * <br/>
     */
    
    public String sum(final String s1,final String s2) {
    	int ErrPos;
        String finalResult = "";
        String msg = "";
        String str1 = s1;
        String str2 = s2;
        //Quét các kí tự của chuỗi s1 và s2 từ phải qua trái
        //Xác định độ dài của s1, s2 và độ dài lớn nhất của 2 chuỗi
        int len1 = str1.length();
        int len2 = str2.length();
        final int maxLen = (len1 > len2) ? len1 : len2;
        int index1; //số thứ tự đang xét của chuỗi s1
        int index2; //số thứ tự đang xét của chuỗi s2
        char c1; //kí tự tại vị trí index1 của chuỗi s1
        char c2;// kí tự tại vị trí index2 của chuỗi s2
        int d1; //kí tự số của c1;
        int d2; // kí tự số của c2;
        int t; //tổng tạm của d1 và d2;
        int mem = 0; //nhớ nếu t>=10

        Pattern p1 = Pattern.compile("[^0-9 ]");
        Matcher m1 = p1.matcher(str1);
        boolean b1 = m1.find();
        
        Pattern p2 = Pattern.compile("[^0-9 ]");
        Matcher m2 = p2.matcher(str2);
        final boolean b2 = m2.find();
        
   
        if (str1.contains("-")) {

        	ErrPos = 1;
            throw new ExNumberFormatException(ErrPos);
        }
        
        if (str2.contains("-")) {

            ErrPos = 1;
            throw new ExNumberFormatException(ErrPos);
        }
        
        if (b1) { // kiểm tra s1 có kí tự đặc biệt không
        
        	ErrPos = m1.start() + 1;
            throw new ExNumberFormatException(ErrPos);
        }
        
        if (b2) {

        	ErrPos = m2.start() + 1;
            throw new ExNumberFormatException(ErrPos);
        }
        
        
        if ((str1 == null) || (str1.trim().isEmpty())) {
        	
        	str1 = "0";
        }
        
        if ((str2 == null) || (str2.trim().isEmpty())) {
        	
        	str2 = "0";
        }

        
        //Lặp maxLen
        for (int i = 0; i < maxLen; i++) {
            index1 = len1 - i - 1;
            index2 = len2 - i - 1;
            c1 = (index1 >= 0) ? str1.charAt(index1) : '0';
            c2 = (index2 >= 0) ? str2.charAt(index2) : '0';
            d1 = c1 - '0';
            d2 = c2 - '0';
            t = d1 + d2 + mem;
            
            //lấy hàng đơn vị của t ghép vào phía trước kết quả
            finalResult = (t % 10) + finalResult;
            mem = t / 10;
            
            msg = "Buoc " + (i + 1) + ": " + c1 + " + " + c2 + " = " 
                + (t - mem) + " + " + mem + " = " + t + ". Viet " + (t % 10) + " Nho " + mem;
            this.ireceiver.send(msg);
        }
        
        //kết thúc vòng lặp, nếu mem có giá trị thì ghép mem vào trước kq
        if (mem > 0) {

            finalResult = mem + finalResult;
        }
        

        
        return finalResult;
    }
}
