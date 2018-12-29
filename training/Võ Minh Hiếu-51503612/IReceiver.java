package addnumber;

/**
 * Tác giả: Võ Minh Hiếu
 * Description.
 * IReceiver là interface cho phép in từng bước cộng 2 số
 * Hàm send cho hàm cho phép ta in ra chuỗi
 */
 
 
public interface IReceiver {

    /*
     * Để thực hiện việc in từng bước cộng 2 chuỗi số
     * thì lớp nào implements interface này thì phải hiện thực
     * hàm send của IReceiver
     * <br/>
     *
     */

    void send(String msg);

}