package myjava.mybignumber;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * by Nguyễn Trần Quốc Vương.
 * Giới thiệu.
 * Class MyBigNumber là lớp để cộng 2 số.
 * Hàm sum trong Class MyBigNumber là hàm để thực hiện phép cộng 2 chuỗi số
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
     *
     * @param s1 chuỗi số thứ nhất.
     * @param s2 chuỗi số thứ hai.
     * @return chuỗi có giá trị là tổng của hai số s1 và s2.
     */
    public String sum(final String s1,final String s2) {
        String finalkq = "";
        int len1 = s1.length(); //Đội dài của s1
        int len2 = s2.length(); //Độ dài của s2
        int maxLen = (len1 > len2) ? len1 : len2;
        String conver = ""; 
        String step = "";// Chuỗi step sẽ làm tham số cho hàm send của interface
        int v;
        long start;
        long end;
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss yyyy-MM-dd "); // tạo 1 đối tượng có định dạng thời gian HH:mm:ss yyyy-MM-dd
        Date date = new Date(); // lấy thời gian hệ thống
        String stringDate = dateFormat.format(date);//Định dạng thời gian theo trên

        int ix1; // Vị trí của chuổi s1
        int ix2; // Vị trí của chuổi s2
        char c1; // Lấy ví trí cuối của index1
        char c2; // Lấy ví trí cuối của index2
        int d1; // kí số của c1
        int d2; // kí số của c2
        int t; // tổng của d1 và d2
        int k; // tổng tạm không có số nhớ
        int sonho = 0; // nếu lớn hơn hoặc bằng 10 thì cộng vài sonho
        
        for (int i = 0; i < len1; i++) { //Kiểm tra trong chuổi s1 có chữ hay không

            if (Character.isLetter(s1.charAt(i))) {
                // Nếu s1 có chữ hoặc kí tự thì sẽ dùng NumberFormatException
                throw new NumberFormatException(" Vị Trí " + (i + 1) + " trong chuỗi " + s1
                        + " là chữ hoặc kí tự");
            }
        }
        for (int i = 0; i < len2; i++) { //Kiểm tra trong chuổi s2 có chữ hay không

            if (Character.isLetter(s2.charAt(i))) {
                // Nếu s2 có chữ hoặc kí tự thì sẽ dùng NumberFormatException
                throw new NumberFormatException(" Vị Trí " + (i + 1) + " trong chuỗi " + s2
                        + " là chữ hoặc kí tự");
            }
        }

        for (int i = 0; i < maxLen; i++) { //// Lặp maxLen lần
            ix1 = len1 - i - 1; // Cập nhật lại vị trí cũ
            ix2 = len2 - i - 1; // Cập nhật lại vị trí cũ
            c1 = (ix1 > -1) ? s1.charAt(ix1) : '0';
            c2 = (ix2 > -1) ? s2.charAt(ix2) : '0';

            d1 = c1 - '0';
            d2 = c2 - '0';
            t = d1 + d2 + sonho;
            k = d1 + d2;

            finalkq = (t % 10) + finalkq;
            sonho = t / 10;
            
            
            
            if (i == 0) {
                v = i + 1;
                conver = "Bước " + v + " : Lấy " + d1 + " + " + d2 + " = " + k 
                    + " , " + " Ghi " + finalkq + " , " + " Nhớ " + sonho + " , Thời gian thực hiện : " + stringDate + "\n";
            } else {
                v = i + 1;
                conver = " Bước " + v + " : Lấy " + d1 + " + " + d2 + " + " + sonho 
                    + " = " + t + " , " + " Ghi " + finalkq + " , " + " Nhớ " + sonho + " , Thời gian thực hiện : " + stringDate + "\n";
            }
            step = step + conver;
        }
        if (sonho > 0) {
            finalkq = sonho + finalkq; // Nếu mem còn dư thì cộng vào kết quả cuối
        }
        step = "\n" + "Phép toán : " + s1 + " + " + s2 + "\n" + "Bước thực hiện : \n" + step;
        this.ireceiver.send(step);
        
        return finalkq; // trả về kết quả cuối
    }

}
