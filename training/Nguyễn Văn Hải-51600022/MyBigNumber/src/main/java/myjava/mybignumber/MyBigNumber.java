package myjava.mybignumber;

    /**
     * Author: Nguyễn Văn Hải
     * Description: 
     * Đây là class dùng để cộng 2 chuỗi số
     * Hàm sum là hàm dùng để thực hiện phép cộng 2 chuỗi số
     * */

public class MyBigNumber {

    private IReceiver ireceiver;
    
    public MyBigNumber(final IReceiver ireceiver){
        this.ireceiver = ireceiver;
    }
    
    /**
     * Để thực hiện phép cộng 2 chuỗi số, ta phải truyền vào 2 tham số cho hàm sum
     * Và 2 chuỗi số này chỉ chứa các kí tự số [0-9]
     * 
     * @param str1 chuỗi số 1
     * @param str2 chuỗi số 2
     * */
    
    public String sum(final String str1, final String str2) {
    	//Khai báo biến
    	
    	String results = ""; //Biến dùng để lưu kết quả cuối cùng của 2 chuỗi số
    	String step = ""; //biến dùng để làm tham số cho hàm send trong của interface
    	String msg = ""; //biến dùng để chứa đoạn text hướng dẫn các bước cộng
    	int len1 = str1.length(); //biến chứa độ dài chuỗi str1
    	int len2 = str2.length(); //biến chứa độ dài chuỗi srt2
    	final int maxLen = (len1 > len2) ? len1 : len2; //lấy độ dài lớn nhất của 1 trong 2 chuỗi số str1 và str2
    	int index1; //xác định vị trí của kí tự đang xét của chuỗi str1
    	int index2; //xác định vị trí của kí tự đang xét của chuỗi str2
    	char c1; //kí tự tại vị trí đang xét index1 của chuỗi str1
    	char c2; //kí tự tại vị trí đang xét index2 của chuỗi str2
    	int temp1; //kí số của c1
    	int temp2; //kí số của c2
    	int total; //tổng tạm
    	int totalNoMem; //tổng tạm không có nhớ
    	int remem = 0; //biến nhớ
    	final String pattern = "\\d+"; //chuỗi số đại diện cho kí tự số [0-9]
    	final boolean flag1; //biến để lưu trữ kết quả xét chuỗi str1
    	final boolean flag2; //biến để lưu trữ kết quả xét chuỗi str2
    	
    	//Kiểm tra 2 chuỗi số str1 và str2 có chứa kí tự là chữ cái hay không
    	for(int i = 0; i < len1; i++) {
    		if(Character.isLetter(str1.charAt(i))) {
    			this.ireceiver.send("Vị trí " + (i + 1) + " trong chuỗi " + str1 + " không phải là số.");
    			
    			return "error";
    		}
    	}
    	
    	for(int i = 0; i < len2; i++) {
    		if(Character.isLetter(str2.charAt(i))) {
    			this.ireceiver.send("Vị trí " + (i + 1) + " trong chuỗi " + str2 + " không phải là số");
    			
    			return "error";
    		}
    	}
    	
    	//Kiểm tra số có phải là số âm hay không
    	if(str1.charAt(0) == '-') {
    		this.ireceiver.send("Chưa hỗ trợ số âm " + str1);
    		
    		return "error";
    	}
    	
    	if(str2.charAt(0) == '-') {
    		this.ireceiver.send("Chưa hỗ trợ số âm " + str2);
    		
    		return "error";
    	}
    	
    	//Kiểm tra kí tự có phải là kí tự đặc biệt hay không
    	flag1 = str1.matches(pattern);
    	flag2 = str2.matches(pattern);
    	
    	if(!flag1) {
    		this.ireceiver.send("Trong chuỗi số " + str1 + " có chứa kí tự đặc biệt");
    		
    		return "error";
    	}
    	
    	if(!flag2) {
    		this.ireceiver.send("Trong chuỗi số " + str2 + " có chứa kí tự đặc biệt");
    		
    		return "error";
    	}
    	
    	//Chạy vòng lập để cộng từng số trong 2 chuỗi số
    	for(int i = 0; i < maxLen; i++) {
    		index1 = len1 - i - 1; //lấy ra vị trí index1 phía bên phải của chuỗi str1
    		index2 = len2 - i - 1; //lấy ra vị trí index2 phía bên phải của chuỗi str2
    		
    		c1 = (index1 >= 0) ? str1.charAt(index1) : '0';
    		c2 = (index2 >= 0) ? str2.charAt(index2) : '0';
    		
    		temp1 = c1 - '0'; //Số tại vị trí index1
    		temp2 = c2 - '0'; //Số tại vị trí index2
    		
    		total = temp1 + temp2 + remem; //Tổng tạm của 2 số tại vị trí index1 + số tại vị trí index2 + số nhớ
    		totalNoMem = temp1 + temp2;
    		
    		//Lấy số ở hàng đơn vị của total ghép vào phía trước kết quả
    		results = (total % 10) + results;
    		remem = total / 10; //số nhớ
    		
    		if(i == 0) {
    			msg = "Step " + i + " : " + temp1 + " + " + temp2 + " = " + totalNoMem
    					+ " , " + " Remember " + remem + " , " + " Result " + results + "\n";
    		}else {
    			msg = "Step " + i + " : " + temp1 + " + " + temp2 + " + " + remem + " = "
    					+ total + " , " + " Remember " + remem + " , " + "Result " + results + "\n";
    		}
    		step = step + msg;
    	}
    	
    	//Kết thúc vòng lặp
    	//Nếu biến nhớ remember có giá trị thì ghép thêm remem vào phía trước kết quả
    	if(remem > 0) {
    		results = remem + results;
    	}
    	step = "\n" + str1 + " + " + str2 + " = " + results + "\n" + " Process implementation: \n" + step;
    	this.ireceiver.send(step);
    	
    	return results;
    }

}
