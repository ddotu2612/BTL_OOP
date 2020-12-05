package sosanh.theongay;

import cackieudulieu.TheoNgay;

import java.util.Comparator;

public class SoSanhKhoiLuongGiaoDich implements Comparator <TheoNgay> {

    public int compare(TheoNgay o1, TheoNgay o2){

        return (Double.compare(o1.getKlgdKhopLenh(), o2.getKlgdKhopLenh()));

    }


}

