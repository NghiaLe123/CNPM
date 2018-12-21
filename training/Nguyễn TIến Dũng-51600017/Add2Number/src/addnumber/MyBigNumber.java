package addnumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Tác giả:  Nguyễn Tiến Dũng.
 * DesCription.
 * Class MyBigNumber là lớp để Cộng 2 số lớn bằng 2 chuỗi.
 * Hàm sum là hàm để thực hiện phép cộng 2 chuỗi số.
 */

public class MyBigNumber {
    
    private IReceiver ireceiver;

    public MyBigNumber(final IReceiver ireceiver) {
        this.ireceiver = ireceiver;
    }

    /** 
     * Để thực hiện phép cộng 2 số, ta cần truyền 2 tham số là 2 chuỗi vào hàm sum.
     * Trong đó : 2 chuỗi chỉ được chứa các kí tự số từ '0' đến '9'.
     * <br/>
     * 
     * @param s1 chuỗi số thứ nhất.
     * @param s2 chuỗi số thứ hai.
     */
    public String sum(final String s1, final String s2) {
        //Lấy độ dài của 2 chuỗi 
        //Khai báo 

        String finalResult = "";
        String step = "";// Chuỗi step sẽ làm tham số cho hàm send của interface
        String conver = "";        
        Pattern p = Pattern.compile("\\D");
        Matcher m1 = p.matcher(s1);
        Matcher m2 = p.matcher(s2);
        int errorPos; // Vị trí của lỗi
        int length1 = s1.length();// Độ dài của chuỗi s1
        int length2 = s2.length();// Độ dài của chuỗi s2
        final int maxLen = (length1 > length2) ? length1 : length2; // Xác định độ dài lớn nhất của 2 chuỗi
        int index1; // chỉ số của kí tự đang xét của chuỗi 1
        int index2; // chỉ số của kí tự đang xét của chuỗi 2
        char c1;    // kí tự tại vị trí index1 của chuỗi s1
        char c2;    // kí tự tại vị trí index2 của chuỗi s2
        int d1;   // kí số của c1
        int d2;   // kí số của c2
        int t;  // tổng tạm của d1 và d2;
        int k;   // tổng tạm không có số nhớ
        int remember = 0;    // nhớ nếu t lớn hơn hoặc bằng 10
        int remember1 = 0; // biến tạm
        final String pattern = "\\d+"; // Chuỗi đại diện cho kí tự số từ [0-9]
        final boolean flag1;// biến để lưu dữ kết quả xét chuỗi s1 
        final boolean flag2;// biến để lưu dữ kết quả xét chuỗi s2
         
        // Kiểm tra số âm
        if (s1.charAt(0) == '-') {
                this.ireceiver.send("Vui lòng không chứ số âm trong s1 : " + s1);
                throw new NumberFormatException("Vui lòng không chứ số âm trong s1 : " + s1);
        } 
        
        if (s2.charAt(0) == '-') {
                this.ireceiver.send("Vui lòng không chứ số âm trong s2 : " + s2);
                throw new NumberFormatException("Vui lòng không chứ số âm trong s2" + s2);
        }
        
        // Kiểm tra kí tự đặc biệt hoặc chữ
        if (m1.find()) {
            errorPos = m1.start() + 1;
                this.ireceiver.send("Vui lòng không chứ kí tự đặc biệt hoặc chữ trong s1 : " + s1);
                throw new NumberFormatException(errorPos+"");   
        }
        
        if (m2.find()) {
            errorPos = m2.start() + 1;
                this.ireceiver.send("Vui lòng không chứ kí tự đặc biệt hoặc chữ trong s2 : " + s2);
                throw new NumberFormatException(errorPos+"");
        }
        
        //// Lặp maxLen lần
        for (int i = 0; i < maxLen; i++) {
            index1 = length1 - i - 1;//lấy ra vị trí index1 phía bên phải của chuỗi 1
            index2 = length2 - i - 1;//lấy ra vị trí index2 phía bên phải của chuỗi 2

            c1 = (index1 >= 0) ? s1.charAt(index1) : '0'; 
            c2 = (index2 >= 0) ? s2.charAt(index2) : '0';

            d1 = c1 - '0';//Số tại vị trí index1
            d2 = c2 - '0';//Số tại vị trí index2

            remember1 = remember;
            t = d1 + d2 + remember;//Tổng tạm bằng số tại vị trí index1 + số tại vị trí index2 + số nhớ remember

            // Lấy hàng đơn vị của t ghép vào phía trước kết quả
            finalResult = (t % 10) + finalResult;
            remember = t / 10; // số nhớ

            if (i == 0) {
                conver = "Bước " + i + " : lấy " + d1 + " cộng " + d2 + " được " + (d1 + d2)
                    + " , " + " ghi " + (t % 10) + " , " + " nhớ " + remember + ", kết quả : " + finalResult + "\n";
            } else if (i == (maxLen - 1) && t >= 10) {
                 conver = "Bước " + i + " : lấy " + d1 + " cộng " + d2 + " cộng " + remember1 
                    + " được " + t + " , " + "ghi " + t + " , " + "nhớ " + remember + ", kết quả : 1" + finalResult + "\n";
            } else {
                conver = "Bước " + i + " : lấy " + d1 + " cộng " + d2 + " cộng " + remember1 
                    + " được " + t + " , " + "ghi " + (t % 10) + " , " + "nhớ " + remember + ", kết quả : " + finalResult + "\n";
            }
            step = step + conver;
        }
        
        // Kết thúc vòng lặp, nếu biến nhớ remember có giá trị thì
        // ghép thêm remember vào phía trước kết quả
        if (remember > 0) {
            finalResult = remember + finalResult;
        }
        step = "\n" + s1 + " + " + s2 + " = " + finalResult + "\n" + "Process implementation : \n" + step;
        this.ireceiver.send(step);
        
        return finalResult;
    }
}
