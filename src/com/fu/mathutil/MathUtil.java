/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author ASUS
 */
// Viết class để cung cấp tiện ích cho nơi khác xài
// khi ta cung cấp tiện ích cho nơi khác xài
// đó là lúc ta ko cần nhớ cái j cho riêng ta, hàm static giúp làm điều đó
public class MathUtil {

//    n! = 1.2.3.4.5.6...
//    quy ước  0! = 1! = 1
//    ko tính giai thừa số âm
//    20! là vừa khớp kiểu long , kiểu long tối đa 18 con số 0
//    21! là lố kiểu long
//    nếu đưa vào âm hay là 21! ta ko tính và ta đập vào mặt ai xài hàm này
//    1 ngoại lệ, chửi
//    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument n must be between 0 and 20");
        }
        //hàm dừng liền

        if (n == 0 || n == 1) {
            return 1;   //  dừng ngay khi n đặt biệt
        }
        //          xuống đến đây , n = 2...20
        //          chơi for hoặc đệ quy - recursion
        //          kĩ thuật nhồi con heo đất, ốc bu nhồi thịt
        //          i = 2, i = 3... i = n nhồi liên tục
        long product = 1; //tích khởi đầu
        for (int i = 2; i <= n; i++) {
            product *= i;
        }   //nhân từ 2 -> n
               
        return product;
    }
}
