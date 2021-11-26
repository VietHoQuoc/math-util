/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Windows 10
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        if (n == 0 || n == 1)
            return 1;
        long product = 1;
        for (int i = 2; i <= n; i++) 
            product *= i;
        return product;
    }
    
    // Hi
    
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(200);
        System.out.println(result);
        
        
    }
    
}
