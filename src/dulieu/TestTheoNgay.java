package dulieu;

import laydulieu.DuLieuTheoNgay;
import sinhcau.SinhCauTheoNgay;

public class TestTheoNgay {

    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        SinhCauTheoNgay sinhCauTheoNgay = new SinhCauTheoNgay();
        sinhCauTheoNgay.setDatalist(new DuLieuTheoNgay().chuyenCSVSangIndexList(dir + "//src//duLieu//bienDongTheoNgayData.csv"));
        for (String i : sinhCauTheoNgay.sinhDoanVan()) {
            System.out.println(i);
        }

    }
}
