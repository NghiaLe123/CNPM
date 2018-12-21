/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addnumber;

import addnumber.MyBigNumber;
/**
 *
 * @author Nguyen Tien Dung
 */
public class Sum implements IReceiver {
    
    public static void main(String[] args) {

        Sum main = new Sum();
        MyBigNumber mybignumber = new MyBigNumber(main);
        String result = mybignumber.sum("123","456");
        System.out.print("Final Result: " + result + "\n");
    }
    
    public void send(String msg) {
        System.out.println(msg); 
    }
}
