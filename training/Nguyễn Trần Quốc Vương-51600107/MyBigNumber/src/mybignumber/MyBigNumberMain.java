/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybignumber;
import mybignumber.MyBigNumber;

/**
 *
 * @author User
 */
public class MyBigNumberMain implements IReceiver {
    
    public static void main(String[] args) {

        MyBigNumberMain main = new MyBigNumberMain();
        MyBigNumber s = new MyBigNumber(main);
        String result = s.sum("2A3","12233");
        System.out.print("Final Result: " + result + "\n");
    }
    

    @Override
    public void send(String msg) {
        System.out.println(msg); 
    }
    
}
