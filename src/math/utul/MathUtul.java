/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.utul;

import bao.utul.MathUtility;

/**
 *
 * @author ACER
 */
public class MathUtul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("math.utul.MathUtul.main()");
        long expected = 120;
        long actual = MathUtility.getFactorial(5);
        System.out.println("5! expected: " + expected);
        System.out.println("5! actual: " + actual);
        System.out.println("6! : 720 actual: " + MathUtility.getFactorial(6));
        
        System.out.println("expected: illegalArgumentException: " + MathUtility.getFactorial(-5));
    }
    
}
