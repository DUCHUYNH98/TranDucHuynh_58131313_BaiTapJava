/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author FPT_2-4
 */
public class MainBaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NhanVien nv = new NhanVien("Huynh", 22, "Nha Tran", 300, 300);
        NhanVien nv1 = new NhanVien("Kha", 22, "Nha Trang", 300, 100);
        System.out.println(nv.getThongTin());
        System.out.println("----------------------------");
        System.out.println(nv1.getThongTin());
    }
    
}
