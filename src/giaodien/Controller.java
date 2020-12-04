package giaodien;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import laydulieu.*;
import tinTuc.ChiSoChungKhoan;
import sinhcau.*;
import tinTuc.*;
import tinTuc.LayDuLieu;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    ComboBox<String> tintucComboxBox;
    @FXML
    ComboBox<String> sinhcauComboxBox;
    @FXML
    TextArea noiDung;


    ObservableList<String> tintucList = FXCollections.observableArrayList("Chỉ Số Chứng Khoán","Cổ Đông Chứng Khoán","Cổ Phiếu Chứng Khoán","Cổ Tức Chứng Khoán","Giá Chứng Khoán","Giải Ngân Chứng Khoán","Lợi Nhuận Chứng Khoán","Nhà Đầu Tư Chứng Khoán","Phiên Chứng Khoán", "Sàn Giao Dịch Chứng Khoán","Thanh Khoản Chứng Khoán","Trái Phiếu Chứng Khoán");
    ObservableList<String> sinhcauList = FXCollections.observableArrayList("Sinh Câu Biến Động Chứng Khoán","Sinh Câu Chỉ Số Index","Sinh Câu Nhà Đầu Tư Nước Ngoài","Chứng Khoán Theo Ngày");
    SinhCauBDTK bienDongCK = new SinhCauBDTK();
    SinhCauChiSoIndex chiSoIndex = new SinhCauChiSoIndex();
    SinhCauNhaDauTuNuocNgoai nhaDauTu = new SinhCauNhaDauTuNuocNgoai();
    SinhCauTheoNgay theoNgay = new SinhCauTheoNgay();

    String [] list={"HNX","HSX","UPCOM"};
    Random rd = new Random();

    //GiaiNganChungKhoan
    public void inThongTin(List<String> p){
        Collections.shuffle(p);
        for (int i =0;(i<5);i++) {
            try {
                String s = p.get(i);
                noiDung.appendText(s + "\n");
            }
            catch(Exception ex)
            {System.out.println("Rỗng");}
        }
    }
    public void inTatCa(List<String> p){
        p.stream().forEach((s) -> {
            noiDung.appendText(s +"\n");
        });
    }
    public void sinhcauEvent(ActionEvent event){
        if(sinhcauComboxBox.getValue().equals("Sinh Câu Biến Động Chứng Khoán")){
            noiDung.appendText("BIẾN ĐỘNG CHỨNG KHOÁN:\n");
            bienDongCK.setDatalist(new DuLieuBDTK().CSV_Extract("D:\\Git\\OOP\\BTL_OOP\\src\\duLieu\\BienDongChungKhoan.csv"));
            bienDongCK.listModify();
            bienDongCK.doanvan.clear();
            bienDongCK.sinhDoanVan();
            inTatCa(bienDongCK.doanvan);
        }
        if(sinhcauComboxBox.getValue().equals("Sinh Câu Chỉ Số Index")){
            noiDung.appendText("CHỈ SỐ INDEX:\n");
            chiSoIndex.setDataList(new DuLieuChiSoIndex().chuyenCSVSangIndexList("D:\\Git\\OOP\\BTL_OOP\\src\\duLieu\\vnindexData.csv","vnIndexData"));
            chiSoIndex.doanVan.clear();
            chiSoIndex.sinhDoanVan();
            inTatCa(chiSoIndex.doanVan);
        }
        if(sinhcauComboxBox.getValue().equals("Sinh Câu Nhà Đầu Tư Nước Ngoài")){
            noiDung.appendText("NHÀ ĐẦU TƯ NƯỚC NGOÀI:\n");
            nhaDauTu.setDataList(new DuLieuNDTNN().chuyenFileCSVNDTNNSangList("D:\\Git\\OOP\\BTL_OOP\\src\\duLieu\\nhaDauTuNuocNgoaiData.csv"));
            nhaDauTu.setSanGiaoDich("HOSE");
            nhaDauTu.cau.clear();
            nhaDauTu.sinhDoanVan();
            inTatCa(nhaDauTu.cau);
        }
//        if(sinhcauComboxBox.getValue().equals("Chứng Khoán Theo Ngày")){
//            noiDung.appendText("CHỨNG KHOÁN THEO NGÀY:\n");
//            theoNgay.datalist = new DuLieuTheoNgay().chuyenCSVSangIndexList("D:\\Git\\OOP\\BTL_OOP\\src\\duLieu\\bienDongTheoNgayData.csv");
//            theoNgay.cau.clear();
//            theoNgay.sinhDoanVan();
//            inTatCa(theoNgay.cau);
//        }
    }

    public void tintucEvent(ActionEvent event) throws IOException {
        LayDuLieu data = new LayDuLieu();
        data.layCau();
        PhanLoai pl = new PhanLoai();
        for(String s: data.cauChungKhoan) {
            pl.phanLoai(s);
        }


        if(tintucComboxBox.getValue().equals("Chỉ Số Chứng Khoán")){
            noiDung.appendText("CHỈ SỐ CHỨNG KHOÁN:\n");
            inThongTin(ChiSoChungKhoan.chiSo);
        }
        if(tintucComboxBox.getValue().equals("Cổ Đông Chứng Khoán")){
            noiDung.appendText("CỔ ĐÔNG CHỨNG KHOÁN:\n");
            inThongTin(CoDongChungKhoan.coDong);
        }
        if(tintucComboxBox.getValue().equals("Cổ Phiếu Chứng Khoán")){
            noiDung.appendText("CỔ PHIẾU CHỨNG KHOÁN:\n");
            inThongTin(CoPhieuChungKhoan.coPhieu);
        }
        if(tintucComboxBox.getValue().equals("Cổ Tức Chứng Khoán")){
            noiDung.appendText("CỔ TỨC CHỨNG KHOÁN:\n");
            inThongTin(CoTucChungKhoan.coTuc);
        }
        if(tintucComboxBox.getValue().equals("Giá Chứng Khoán")){
            noiDung.appendText("GIÁ CHỨNG KHOÁN:\n");
            inThongTin(GiaChungKhoan.gia);
        }
        if(tintucComboxBox.getValue().equals("Giải Ngân Chứng Khoán")){
            noiDung.appendText("GIẢI NGÂN CHỨNG KHOÁN:\n");
            inThongTin(GiaiNganChungKhoan.giaiNgan);
        }
        if(tintucComboxBox.getValue().equals("Lợi Nhuận Chứng Khoán")){
            noiDung.appendText("LỢI NHUẬN CHỨNG KHOÁN:\n");
            inThongTin(LoiNhuanChungKhoan.loiNhuan);
        }
        if(tintucComboxBox.getValue().equals("Nhà Đầu Tư Chứng Khoán")){
            noiDung.appendText("NHÀ ĐẦU TƯ CHỨNG KHOÁN:\n");
            inThongTin(NhaDauTuChungKhoan.nhaDauTu);
        }
        if(tintucComboxBox.getValue().equals("Phiên Chứng Khoán")){
            noiDung.appendText("PHIÊN CHỨNG KHOÁN:\n");
            inThongTin(PhienChungKhoan.phien);
        }
        if(tintucComboxBox.getValue().equals("Sàn Giao Dịch Chứng Khoán")){
            noiDung.appendText("SÀN GIAO DỊCH CHỨNG KHOÁN:\n");
            inThongTin(SanGiaoDichChungKhoan.sanGiaoDich);
        }
        if(tintucComboxBox.getValue().equals("Thanh Khoản Chứng Khoán")){
            noiDung.appendText("THANH KHOẢN CHỨNG KHOÁN:\n");
            inThongTin(ThanhKhoanChungKhoan.thanhKhoan);
        }
        if(tintucComboxBox.getValue().equals("Trái Phiếu Chứng Khoán")){
            noiDung.appendText("TRÁI PHIẾU CHỨNG KHOÁN:\n");
            inThongTin(TraiPhieuChungKhoan.traiPhieu);
        }
    }

    public void quit(ActionEvent event){
        Platform.exit();
        System.exit(0);

    }

    public void refresh(ActionEvent event){
        noiDung.clear();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tintucComboxBox.setItems(tintucList);
        sinhcauComboxBox.setItems(sinhcauList);
    }
}
