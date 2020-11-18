package duLieu;


import layDuLieu.DuLieuChiSoIndex;
import mauCau.MauCauChiSoIndex;
import sinhCau.SinhCauChiSoIndex;

public class Test {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        SinhCauChiSoIndex sinhCauChiSoIndex = new SinhCauChiSoIndex();
        sinhCauChiSoIndex.setDataList(new DuLieuChiSoIndex().chuyenCSVSangIndexList(dir + "//src//duLieu//vnindexData.csv", "VNINDEX"));
        for (String i : sinhCauChiSoIndex.sinhDoanVan()) {
            System.out.println(i);
        }
    }
}
