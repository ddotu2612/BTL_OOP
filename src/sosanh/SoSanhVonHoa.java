package sosanh;

import cacKieuDuLieu.BienDongChungKhoan;

import java.util.Comparator;

public class SoSanhVonHoa implements Comparator<BienDongChungKhoan> {
    @Override
    public int compare(BienDongChungKhoan o1, BienDongChungKhoan o2) {
        if (o1.getVonHoa() == o2.getVonHoa()) return 0;
        else if(o1.getVonHoa() > o2.getVonHoa()) return -1;
        else return 1;
    }
}
