package dulieu;


import laydulieu.DuLieuNDTNN;
import sinhcau.SinhCauNhaDauTuNuocNgoai;

public class TestNhaDTNN {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        SinhCauNhaDauTuNuocNgoai sinhcauNDTNN = new SinhCauNhaDauTuNuocNgoai();
        sinhcauNDTNN.setDataList(new DuLieuNDTNN().chuyenFileCSVNDTNNSangList(dir + "//src//duLieu//nhadautunuocngoai//NDTNN_04_12_20.csv"));
        sinhcauNDTNN.setTongKhoiLuongMuaBan(sinhcauNDTNN.getDataList());
        sinhcauNDTNN.setTongGiaTriMuaBan(sinhcauNDTNN.getDataList());
        for (String i : sinhcauNDTNN.sinhDoanVan()) {
            System.out.println(i);
        }
    }
}

