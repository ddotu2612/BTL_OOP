package sosanh;

import java.util.Comparator;
import cacKieuDuLieu.BienDongChungKhoan;

public class SoSanhKhoiLuong implements Comparator<BienDongChungKhoan> {

    @Override
    public int compare(BienDongChungKhoan o1, BienDongChungKhoan o2) {
        if (o1.getKhoiLuong() == o2.getKhoiLuong()) return 0;
        else if (o1.getKhoiLuong() > o2.getKhoiLuong()) return -1;
        else return 1;
    }
}


