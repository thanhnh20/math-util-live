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
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long result = MathUtil.getFactorial(5);

        System.out.println("5! = 120; actual: " + result);
        
        System.out.println("0! = 1; actual: " + MathUtil.getFactorial(0));
        // kĩ thuật kiểm thử phần mềm: ước lượng giá trị trả về của hàm là gì
        // expected value: 5! = 120;
        // hàm viết khi chạy thực tế là mấy - actual
        // expected == actual -> hàm ngon
    }

}