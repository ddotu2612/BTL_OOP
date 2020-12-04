package dulieu;


import laydulieu.DuLieuChiSoIndex;
import sinhcau.SinhCauChiSoIndex;

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
