/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bao.utul;

/**
 *
 * @author ACER
 */
public class MathUtility {

    //lam bo thu vien fake
    //Math.PI, abs(, sqrt(), pew(a,b)
    //thu vien dung static, khi khong can luu cho rieng minh
    //con thu vien ma van can luu info rieng, thi van non-static nhu thuong
    public static final double PI = 3.1415;

    // tien ich tinh giai thua n!
    //n phai tu 0 tro len
    //am giai thua vo nghia
    // giai thua tang cuc nhanh, 21 long ko chua noi
    //bai tinh giai thua tu 0..20
    //21 tro len ko tinh
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("n must be 0 to 20");
//
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
    //ko chơi bình thuognwf chơi đệ quy
    public static long getFactorial(int n){
        //đệ quy là gọi lại mình với quy mô nhỏ hơn
        //phải có dừng vì không thì lặp vô tận
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be 0 to 20");

        }
              if (n == 0 || n == 1) {
            return 1;
        }
              return n*getFactorial(n-1);
              //di cho toi khi ve 1 thì thoi
    }
}
