package dulieu;

import laydulieu.DuLieuBDTK;
import laydulieu.DuLieuChiSoIndex;
import sinhcau.SinhCauBDTK;
import sinhcau.SinhCauChiSoIndex;

public class TestBDCK {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        SinhCauBDTK sinhCau = new SinhCauBDTK();
        sinhCau.setDatalist(new DuLieuBDTK().CSV_Extract(dir + "//src//dulieu//BienDongChungKhoan.csv"));
        for (String i : sinhCau.sinhDoanVan()) {
            System.out.println(i);
        }
    }
}
