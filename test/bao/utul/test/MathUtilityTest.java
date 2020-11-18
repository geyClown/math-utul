/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bao.utul.test;

import static bao.utul.MathUtility.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER
 */
public class MathUtilityTest {
    
    //viet ra nhung tinh huong xai ham getFactorial{}
    //kiem tra xem actual == expected hay khong?, nhu truyen thong ben main()
    //nhung o day xin hon laf show ra mau xanh do
    //ngoai ra nos con dungf dc cho viec CI = Continous Intergation
                                       //CD = continous Delivery
                                       //CT = continous Regression Test
                                       // DebOps = Development & Operation
    // doanh nghiep hien dang xai
    //day len 1 sever trung gian - STAGING ENVIROMENT de cho nhom test
    // san sang test ki
    //sau do co the day thang len production server, may chay that o noi khach
    //moi viec se bat dau ke tu luc developer push code len github
    
    //@test tuong duong bien ham thanh public static void main()
    //trong ham nay minh se show ra mau xanh do dua tren su khop nhau cua actual va expected qua ham assertEqual()... ma thu vien cung cap
    // thay vi so sanh bang mat thi ta nho ham so giup
    @Test
    public void getFactorial_RunsWell_IfValidArgument(){
        //de choi tro khai bao ma ko can ten class thi import static
        //sau nay khoi can khai bao class, khai bao ten ma dung nhu thuong
        assertEquals(120, getFactorial(5));
        assertEquals(24, getFactorial(4));
        assertEquals(720, getFactorial(6));
        assertEquals(0, getFactorial(0));
        // test case do thi khong cho build, dam bao chat luong code
        //files -> nbproject ->build-impl.xml dong 1005 them buoc test sau compile.
        assertEquals(1, getFactorial(0));
        
        // gay tinh dum tui 5! co phai 120 ko, dung bao xanh sai bao do
    
}
}
