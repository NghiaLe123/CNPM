
public class MyBigNumber {
	
	/* Cộng hai số dưới dạng chuỗi.
	* Giả sử 2 chuỗi số nhập vào là đúng.
	* @s1 chuỗi số thứ nhất.
	* @s2 chuỗi số thứ hai.
	* @return chuỗi có giá trị là tổng của hai số s1 và s2.
	* Tác giả : Nguyễn Tiến Dũng.
	*/
	
	public String sum(String s1, String s2) {
		String finalResult = "";	
		String step = "";	//Các bước tiến hành cộng 2 chuỗi
		String conver = "";

		// lần lượt quét các kí tự của chuỗi s1 và s2 từ phải qua trái

		int length1 = s1.length();	// độ dài của chuỗi 1
		int length2 = s2.length(); // độ dài của chuỗi 2
		int maxLen = (length1 > length2) ? length1 : length2; // Xác định độ dài lớn nhất của 2 chuỗi

		int index1; // chỉ số của kí tự đang xét của chuỗi 1
		int index2; // chỉ số của kí tự đang xét của chuỗi 2

		char c1;    // kí tự tại vị trí index1 của chuỗi s1
		char c2;    // kí tự tại vị trí index2 của chuỗi s2
		int d1;    // kí số của c1
		int d2;    // kí số của c2
		int t;          // tổng tạm của d1 và d2;
		int k;			// tổng tạm không có số nhớ
		int remember = 0;    // nhớ nếu t lớn hơn hoặc bằng 10

		//// Lặp maxLen lần
		for(int i = 0; i < maxLen; i++) {
			index1 = length1 - i - 1;	//lấy ra vị trí index1 phía bên phải của chuỗi 1
			index2 = length2 - i - 1;	//lấy ra vị trí index2 phía bên phải của chuỗi 2

			c1 = (index1 >= 0) ? s1.charAt(index1) : '0'; 
			c2 = (index2 >= 0) ? s2.charAt(index2) : '0';

			d1 = c1 - '0';	//Số tại vị trí index1
			d2 = c2 - '0';	//Số tại vị trí index2

			t = d1 + d2 + remember; //Tổng tạm bằng số tại vị trí index1 + số tại vị trí index2 + số nhớ remember
			k = d1 + d2;
			
			// Lấy hàng đơn vị của t ghép vào phía trước kết quả
			finalResult = (t % 10) + finalResult;
			remember = t / 10; // số nhớ
			
			if(i == 0) {
				conver = "Step " + i + " : " + d1 + " + " + d2 + " = " + k + " , " + " Remember " + remember + " , " + " Result " + finalResult + "\n";
			}else{
				conver = "Step " + i + " : " + d1 + " + " + d2 + " + " + remember + " = " + t + " , " + " Remember " + remember + " , " + " Result " + finalResult + "\n";
			}
		
			step = step + conver;
		}

		// Kết thúc vòng lặp, nếu biến nhớ remember có giá trị thì
		// ghép thêm remember vào phía trước kết quả
		if(remember > 0) {
			finalResult = remember + finalResult;
		}
			step = "\n" + s1 + " + " + s2 + " = "+ finalResult + " Process implementation : \n\n" + step;
			//finalResult = step + "\n" + "Final Result : "+ finalResult;

		return finalResult;
	}
}