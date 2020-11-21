package sosanh;

import cacKieuDuLieu.BienDongChungKhoan;

import java.util.Comparator;

public class SoSanhKLVoiTB implements Comparator<BienDongChungKhoan> {
    @Override
    public int compare(BienDongChungKhoan o1, BienDongChungKhoan o2) {
        if (o1.getkLuongSoVoiTB1Thang() == o2.getkLuongSoVoiTB1Thang()) return 0;
        else if (o1.getkLuongSoVoiTB1Thang() > o2.getkLuongSoVoiTB1Thang()) return -1;
        else return 1;
    }
}
