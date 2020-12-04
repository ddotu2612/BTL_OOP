package sosanh;

import cackieudulieu.BienDongChungKhoan;

import java.util.Comparator;

public class SoSanhThayDoiGia implements Comparator<BienDongChungKhoan> {
    @Override
    public int compare(BienDongChungKhoan o1, BienDongChungKhoan o2) {
        if (o1.getGiaSoVoiThangTruoc() == o2.getGiaSoVoiThangTruoc()) return 0;
        else if(o1.getGiaSoVoiThangTruoc() > o2.getGiaSoVoiThangTruoc()) return -1;
        else return 1;
    }
}
