/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author FPT_2-4
 */
public class MainBaiTap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SinhVienIT it = new SinhVienIT(8, 9, 8, "Tran Duc Huynh", "IT");
       SinhVienBiz kt = new SinhVienBiz(8, 8, "Nguyen Thanh Kha", "KT");
       SinhVienPoly s = new SinhVienBiz(9, 7, "Nguyen Thanh Dat", "KT");
       
        it.xuat();
        System.out.println("---------------------------");
        kt.xuat();
        System.out.println("-----------------------------");
        s.xuat();
    }
    
}
