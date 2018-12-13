package myjava.mybignumber;

public class MyBigNumber {
	public String sum(String s1, String s2) {
				String finalkq = "";

				int len1 = s1.length(); //Đội dài của s1
				int len2 = s2.length(); //Độ dài của s2
				int maxLen = (len1 > len2) ? len1 : len2;

				int ix1; // Vị trí của chuổi s1
				int ix2; // Vị trí của chuổi s2
				char c1; // Lấy ví trí cuối của index1
				char c2; // Lấy ví trí cuối của index2
				int d1; // kí số của c1
				int d2; // kí số của c2
				int t; // tổng của d1 và d2
				int sonho = 0; // nếu lớn hơn hoặc bằng 10 thì cộng vài sonho


				//// Lặp maxLen lần
				for (int i = 0; i < maxLen; i++) {
						ix1 = len1 - i - 1; // Cập nhật lại vị trí cũ
						ix2 = len2 - i - 1; // Cập nhật lại vị trí cũ
						c1 = (ix1 > -1 ) ? s1.charAt(ix1) : '0';
						c2 = (ix2 > -1) ? s2.charAt(ix2) : '0';

						d1 = c1 - '0';
						d2 = c2 - '0';
						t = d1 + d2 + sonho;

						finalkq = (t % 10) + finalkq;
						sonho = t / 10;
				}
				if (sonho > 0) {
					finalkq = sonho + finalkq; // Nếu mem còn dư thì cộng vào kết quả cuối
				}
				
				return finalkq; // trả về kết quả cuối
	}

}
