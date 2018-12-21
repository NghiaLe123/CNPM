package mybignumber;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Tác giả:  Nguyễn Trần Quốc Vương.
 * DesCription.
 * Class MyBigNumber là lớp để Cộng 2 số lớn bằng 2 chuỗi.
 * Hàm sum là hàm để thực hiện phép cộng 2 chuỗi số.
 */
public class MyBigNumber {
private IReceiver ireceiver;

    public MyBigNumber(final IReceiver ireceiver) {
        this.ireceiver = ireceiver;
    }

    MyBigNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        Pattern p = Pattern.compile("\\D"); // Chuỗi đại diện cho kí tự số từ [0-9]
        final Matcher m1 = p.matcher(s1);
        final Matcher m2 = p.matcher(s2);
        int errorPos; // Vị trí của lỗi
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
        int sonho1 = 0; // biến nhớ tạm
        
        final String pattern = "\\d+"; // Chuỗi đại diện cho kí tự số từ [0-9]
        final boolean flag1;// Lưu dữ kết quả xét chuỗi s1 
        final boolean flag2;// Lưu dữ kết quả xét chuỗi s2
        
        if (s1.contains("-")) {
            this.ireceiver.send(" Co chua so am trong so thu nhat ");
            throw new NumberFormatException(" Vui long khong chua so am trong " + s1);
        }
        if (s2.contains("-")) {
            this.ireceiver.send(" Co chua so am trong so thu hai ");
            throw new NumberFormatException(" Vui long khong chua so am trong " + s2);
        }
        
        flag1 = s1.matches(pattern);
        flag2 = s2.matches(pattern);
        
        // Kiểm tra kí tự đặc biệt hoặc chữ
        if (m1.find()) {
            errorPos = m1.start() + 1;
            this.ireceiver.send(" Vui long khong chua ki tu dac biet hoac chu trong s1 : " + s1);
            throw new NumberFormatException(errorPos + "");   
        }
        
        if (m2.find()) {
            errorPos = m2.start() + 1;
            this.ireceiver.send(" Vui long khong chua ki tu dac biet hoac chu trong s2 : " + s2);
            throw new NumberFormatException(errorPos + "");
        }

        for (int i = 0; i < maxLen; i++) { //// Lặp maxLen lần
            ix1 = len1 - i - 1; // Cập nhật lại vị trí cũ
            ix2 = len2 - i - 1; // Cập nhật lại vị trí cũ
            c1 = (ix1 > -1) ? s1.charAt(ix1) : '0';
            c2 = (ix2 > -1) ? s2.charAt(ix2) : '0';

            d1 = c1 - '0';
            d2 = c2 - '0';
            sonho1 = sonho;
            t = d1 + d2 + sonho;
            k = d1 + d2;

            finalkq = (t % 10) + finalkq;
            sonho = t / 10;
            
            
            
            if (i == 0) {
                v = i + 1;
                conver = " Buoc " + v + " : Lay " + d1 + " Cong " + d2 + " Duoc " + k 
                    + " , " + " Ghi " + (t % 10) + " , " + " Nho " + sonho + ", Ket qua : " + finalkq + "\n";
            } else if (i == (maxLen - 1) && t >= 10) {
                v = i + 1;
                 conver = "Buoc " + v + " : Lay " + d1 + " Cong " + d2 + " cộng " + sonho1 
                    + " Duoc " + t + " , " + " Ghi " + t + " , " + " Nho " + sonho + ", Ket qua : 1" + finalkq + "\n";
            } else {
                v = i + 1;
                conver = " Buoc " + v + " : Lay " + d1 + " Cong " + d2 + " Cong " + sonho1 
                    + " Duoc " + t + " , " + "Ghi " + (t % 10) + " , " + " Nho " + sonho + ", Ket qua : " + finalkq + "\n";
            }
            step = step + conver;
        }
        if (sonho > 0) {
            finalkq = sonho + finalkq; // Nếu mem còn dư thì cộng vào kết quả cuối
        }
        step = "\n" + "Phép toán : " + s1 + " + " + s2 + "\n" + "Buoc thuc hien : \n" + step;
        this.ireceiver.send(step);
        
        return finalkq; // trả về kết quả cuối
    }

    /**
     * @param args the command line arguments
     */
    
}
