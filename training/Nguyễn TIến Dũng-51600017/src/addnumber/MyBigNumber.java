package addnumber;

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
        final String pattern = "\\d+"; // Chuỗi đại diện cho kí tự số từ [0-9]
        final boolean flag1;// biến để lưu dữ kết quả xét chuỗi s1 
        final boolean flag2;// biến để lưu dữ kết quả xét chuỗi s2
        
        // Kiểm tra 2 chuỗi s1 và s2 có kí tự chữ hay không
        for (int i = 0; i < length1; i++) {

            if (Character.isLetter(s1.charAt(i))) {
                this.ireceiver.send("Vị trí " + (i + 1) + " trong chuỗi " + s1
                        + " không phải là số");
                
                return "error";
            }
        }
        
        for (int i = 0; i < length2; i++) {

            if (Character.isLetter(s2.charAt(i))) {
                this.ireceiver.send("Vị trí " + (i + 1) + " trong chuỗi " + s2
                        + " không phải là số");
                
                return "error";
            }
        }
        
        // Kiểm tra số âm
        if (s1.charAt(0) == '-') {
            this.ireceiver.send("Chưa hỗ trợ số âm " + s1);
            
            return "error";
        } 
        
        if (s2.charAt(0) == '-') {
            this.ireceiver.send("Chưa hỗ trợ số âm " + s2);
            
            return "error";
        }
        
        // Kiểm tra kí tự đặc biệt
        flag1 = s1.matches(pattern);
        flag2 = s2.matches(pattern);
        if (!flag1) {
            this.ireceiver.send("Trong chuỗi số " + s1 + " có chưa kí tự đặc biệt");
            
            return "error";
        }
        
        if (!flag2) {
            this.ireceiver.send("Trong chuỗi số " + s2 + " có chưa kí tự đặc biệt");
            
            return "error";
        }
        
        //// Lặp maxLen lần
        for (int i = 0; i < maxLen; i++) {
            index1 = length1 - i - 1;//lấy ra vị trí index1 phía bên phải của chuỗi 1
            index2 = length2 - i - 1;//lấy ra vị trí index2 phía bên phải của chuỗi 2

            c1 = (index1 >= 0) ? s1.charAt(index1) : '0'; 
            c2 = (index2 >= 0) ? s2.charAt(index2) : '0';

            d1 = c1 - '0';//Số tại vị trí index1
            d2 = c2 - '0';//Số tại vị trí index2

            t = d1 + d2 + remember;//Tổng tạm bằng số tại vị trí index1 + số tại vị trí index2 + số nhớ remember
            k = d1 + d2;

            // Lấy hàng đơn vị của t ghép vào phía trước kết quả
            finalResult = (t % 10) + finalResult;
            remember = t / 10; // số nhớ

            if (i == 0) {
                conver = "Step " + i + " : " + d1 + " + " + d2 + " = " + k 
                    + " , " + " Remember " + remember + " , " + " Result " + finalResult + "\n";
            } else {
                conver = "Step " + i + " : " + d1 + " + " + d2 + " + " + remember 
                    + " = " + t + " , " + " Remember " + remember + " , " + " Result " + finalResult + "\n";
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