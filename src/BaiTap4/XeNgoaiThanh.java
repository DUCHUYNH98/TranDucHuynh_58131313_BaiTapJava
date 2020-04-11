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
public class XeNgoaiThanh extends ChuyenXe{
    int noiDen;
    int soNgay;

    public XeNgoaiThanh(int noiDen, int soNgay, String maSoChuyen, String hoTenTaiXe, String soXe) {
        super(maSoChuyen, hoTenTaiXe, soXe);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }
    
    @Override
    public double doanhThu() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return noiDen * soNgay * 1000;
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Tong Noi Den: " + noiDen + "\n"
                + "Tong So Ngay: " + soNgay +"\n"
                + "Doanh Thu: " + doanhThu() + "\n");
    }
    
    
}
