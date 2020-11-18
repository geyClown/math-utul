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
        
        System.out.println("chuc cuoi tuan vui ve");
    }
    
}
// minh muon ket luan ham ngon, minh phai test het cac truong hop xai ham
//ap thiet ke cac test case , tinh huong de sau do munhf verifi
//gua gia trij tra vef cua ham actual co khop voi exoected cai minh du doan
//ham chay phai tra ve
//va neu actual == expected moi truong hop, thi ket luan ham ngon
// cach nay nhuoc diem la nhin bang mat so sanh ket qua cua tung case, cach nay on nhung tim an sai sot


//cach nang cao
//cung nhin bang mat, nhung chi mau xanh va do cho moi test case
//co nghia: neu ban xai ham voi 100 tham so thif chay 100 tinh huong khac nhau
//ban chi can duy nhat 2 mau xanh do
//xanh, code on cho moi tinh huong
//do, moi case mau xanh nhung co 1 cai do thif coi nhu toan bo do, chi can it nhat 1 cai khong khop mau do la di tong code, de dam bao ham phai chinh xac cho moi tinh huong
//muon lam dc dieu nay can su phu giup cua cac thu vien ben ngoai JDK goi la UNIT TEST FRAMEWORK

// cac bo unit test biu tueng : Junit, TestNG, nUnit, xUnit,PHPUnit ...
//voi moi muc tieu test ham co ngon khong nhung chi co dung 2 mau, ko cae chi tiet cac tinh huong chay ham