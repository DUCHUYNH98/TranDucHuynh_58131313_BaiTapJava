/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.util.ArrayList;

/**
 *
 * @author FPT_2-4
 */
public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> x = new ArrayList<>();
    
    public void them(ChuyenXe cx)
    {
        x.add(cx);
    }
    public void xuat()
    {
        for(int i = 0; i < x.size(); i++)
        {
            x.get(i).xuat();
            System.out.println("--------------------------------------");
        }
    }
    public double tongDoanhThuNoiThanh()
    {
        double r = 0;
        for(int i =0; i < x.size(); i ++)
        {
            if ((x.get(i) instanceof XeNoiThanh) == true)
            {
                r += x.get(i).doanhThu();
            }
        }
        return r;
    }
    public double tongDoanhThuNgoaiThanh()
    {
        double r = 0;
        for(int i =0; i < x.size(); i ++)
        {
            if ((x.get(i) instanceof XeNoiThanh) == false)
            {
                r += x.get(i).doanhThu();
            }
        }
        return r;
    }
    public double tongDoanhThu2Xe()
    {
        double r = 0;
        for (int i =0; i <x.size(); i++)
        {
            r += x.get(i).doanhThu();
        }
        return r;
    }
}
