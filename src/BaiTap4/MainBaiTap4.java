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
public class MainBaiTap4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuanLyChuyenXe ql = new QuanLyChuyenXe();
        //gan doi tuong cho cac chuyen xe
        XeNgoaiThanh nt1 = new XeNgoaiThanh(10, 30, "0001", "Tran Han", "12356");
        XeNgoaiThanh nt2 = new XeNgoaiThanh(20, 50, "0002", "Nguyen Thanh Kha", "12367");
        XeNgoaiThanh nt3 = new XeNgoaiThanh(30, 70, "0003", "Nguyen Van Thanh", "012378");
        XeNoiThanh t1 = new XeNoiThanh(10, 1000, "0004", "Tran Duc Huynh", "12395");
        XeNoiThanh t2 = new XeNoiThanh(5, 300, "0005", "Nguyen Thanh Dat", "12385");
        XeNoiThanh t3 = new XeNoiThanh(6, 500, "0006", "Nguyen Hieu", "12375");
        // them cac chuyen xe vao danh sach
        ql.them(nt1);
        ql.them(nt2);
        ql.them(nt3);
        ql.them(t1);
        ql.them(t2);
        ql.them(t3);
        // in thong tin tung chuyen xe ra
        System.out.println("In thong tin tung chuyen xe: \n");
        ql.xuat();
        //tong doanh thu xe ngoai thanh
        System.out.println("Tong doanh thu xe ngoai thanh: ");
        System.out.println(ql.tongDoanhThuNgoaiThanh());
        //tong doanh thu xe noi thanh
        System.out.println("Tong doanh thu xe noi thanh: ");
        System.out.println(ql.tongDoanhThuNoiThanh());
        //tong doanh thu 2 xe
        System.out.println("Tong doanh thu 2 xe: ");
        System.out.println(ql.tongDoanhThu2Xe());
    }
    
}
