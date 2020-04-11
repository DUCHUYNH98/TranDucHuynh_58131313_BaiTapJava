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
public class XeNoiThanh extends ChuyenXe{
    
    int soTuyen;
    int soKm;

    public XeNoiThanh(int soTuyen, int soKm, String maSoChuyen, String hoTenTaiXe, String soXe) {
        super(maSoChuyen, hoTenTaiXe, soXe);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }
    
    @Override
    public double doanhThu() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return soTuyen * soKm * 1000;
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Tong so tuyen: " + soTuyen + "\n"
                + "Tong So Km: " + soKm + "\n"
                + "Doanh Thu: " + doanhThu()+"\n");
    }
    
    
}
