/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author FPT_2-4
 */
public abstract class ChuyenXe {
    String maSoChuyen;
    String hoTenTaiXe;
    String soXe;

    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
    }
   public abstract double doanhThu();
   
   public void  xuat()
   {
       System.out.println("Ma So Chuyen: " + maSoChuyen +"\n"
               + "Ho Ten Tai Xe: " + hoTenTaiXe + "\n"
               + "So Xe: " + soXe + "\n");
   }
}
