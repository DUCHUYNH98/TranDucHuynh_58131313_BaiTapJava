/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author FPT_2-4
 */
public class MainBaiTap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyNhanVien ql = new QuanLyNhanVien();
        ql.them(new NhanVien("Huynh", 22, "Phu Yen", 300, 300));
        ql.them(new NhanVien("Kha", 22, "Nha Trang", 300, 250));
        ql.them(new NhanVien("Thao", 22, "Quang NAm", 300, 200));
        ql.them(new NhanVien("Hieu", 22, "Phu Yen", 300, 150));
        ql.them(new NhanVien("Dat", 22, "Nha Trang", 300, 100));
        System.out.println("--------------------------------");
        ql.inDS();
    }
    
}
