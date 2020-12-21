package sosanh.theongay;

import cackieudulieu.ChungKhoanTheoNgay;

import java.util.Comparator;

public class SoSanhKhoiLuongGiaoDich implements Comparator <ChungKhoanTheoNgay> {

    public int compare(ChungKhoanTheoNgay o1, ChungKhoanTheoNgay o2){

        return (Double.compare(o1.getKlgdKhopLenh(), o2.getKlgdKhopLenh()));

    }


}

