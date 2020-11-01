package duLieu;


import layDuLieu.DuLieuNDTNN;
import sinhCau.SinhCauNhaDauTuNuocNgoai;

public class TestNhaDTNN {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        SinhCauNhaDauTuNuocNgoai sinhcauNDTNN = new SinhCauNhaDauTuNuocNgoai();
        sinhcauNDTNN.setDataList(new DuLieuNDTNN().chuyenFileCSVNDTNNSangList(dir + "//src//duLieu//nhaDauTuNuocNgoaiData.csv"));
        sinhcauNDTNN.setTongKhoiLuongMuaBan(sinhcauNDTNN.getDataList());
        sinhcauNDTNN.setTongGiaTriMuaBan(sinhcauNDTNN.getDataList());
        for (var i : sinhcauNDTNN.sinhDoanVan()) {
            System.out.println(i);
        }
    }
}

