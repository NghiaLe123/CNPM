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
        String finalResult = "";
        String msg = "";
        
        //Quét các kí tự của chuỗi s1 và s2 từ phải qua trái
        //Xác định độ dài của s1, s2 và độ dài lớn nhất của 2 chuỗi
        int len1 = s1.length();
        int len2 = s2.length();
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
        Matcher m1 = p1.matcher(s1);
        boolean b1 = m1.find();
        
        Pattern p2 = Pattern.compile("[^0-9 ]");
        Matcher m2 = p2.matcher(s2);
        final boolean b2 = m2.find();
        
        if (s1.contains("-")) {

            throw new NumberFormatException("Lỗi xuất hiện số âm: " + s1);
        }
        
        if (s2.contains("-")) {

            throw new NumberFormatException("Lỗi xuất hiện số âm: " + s2);
        }
        
        if (b1) { // kiểm tra s1 có kí tự đặc biệt không

            throw new NumberFormatException("Lỗi xuất hiện kí tự khác số: " + s1);
        }
        
        if (b2) {

            throw new NumberFormatException("Lỗi xuất hiện kí tự khác số: " + s2);
        }
        
        
        

        
        //Lặp maxLen
        for (int i = 0; i < maxLen; i++) {
            index1 = len1 - i - 1;
            index2 = len2 - i - 1;
            c1 = (index1 >= 0) ? s1.charAt(index1) : '0';
            c2 = (index2 >= 0) ? s2.charAt(index2) : '0';
            d1 = c1 - '0';
            d2 = c2 - '0';
            t = d1 + d2 + mem;
            
            //lấy hàng đơn vị của t ghép vào phía trước kết quả
            finalResult = (t % 10) + finalResult;
            mem = t / 10;
            
            msg = "Bước " + (i + 1) + ": " + c1 + " + " + c2 + " = " 
                + (t - mem) + " + " + mem + " = " + t + ". Viết " + (t % 10) + " Nhớ " + mem;
            this.ireceiver.send(msg);
        }
        
        //kết thúc vòng lặp, nếu mem có giá trị thì ghép mem vào trước kq
        if (mem > 0) {
            finalResult = mem + finalResult;
        }
        
        return finalResult;
    }
}
