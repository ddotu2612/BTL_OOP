package sosanh;

import cackieudulieu.BienDongChungKhoan;

import java.util.Comparator;

public class SoSanhGia implements Comparator<BienDongChungKhoan> {
    @Override
    public int compare(BienDongChungKhoan o1, BienDongChungKhoan o2) {
        if (o1.getGia() == o2.getGia()) return 0;
        else if (o1.getGia() > o2.getGia()) return -1;
        else return 1;
    }
}
