package myjava.mybignumber;

/**
 * Tác giả: Lê Nguyên Hoài Nghĩa.
 * MyBigNumber là lớp để Cộng 2 số lớn bằng 2 chuỗi
 * sum là hàm để thực hiện phép cộng 2 chuỗi số
 */

public interface IReceiver {

    /**
        * In từng bước cộng 2 số.
        */
    
    public void send(String msg);
}
