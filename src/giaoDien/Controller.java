package giaoDien;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import layDuLieu.DuLieuChiSoIndex;
import layDuLieu.DuLieuChiSoIndex.*;
import layDuLieu.DuLieuNDTNN;
import layDuLieu.LayDuLieuCSV;
import tinTuc.ChiSoChungKhoan;
import sinhCau.*;
import tinTuc.*;

import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    ComboBox<String> tintucComboxBox;
    @FXML
    ComboBox<String> sinhcauComboxBox;
    @FXML
    TextArea noiDung;


    ObservableList<String> tintucList = FXCollections.observableArrayList("Chỉ số chứng khoán","Cổ Đông Chứng Khoán","Cổ Phiếu Chứng Khoán","Cổ Tức Chứng Khoán","Giá Chứng Khoán","Giải Ngân Chứng Khoán","Lợi Nhuận Chứng Khoán","Nhà Đầu Tư Chứng Khoán","Phiên Chứng Khoán", "Sàn Giao Dịch Chứng Khoán","Thanh Khoản Chứng Khoán","Trái Phiếu Chứng Khoán");
    ObservableList<String> sinhcauList = FXCollections.observableArrayList("Sinh Câu Biến Động Chứng Khoán","Sinh Câu Chỉ Số Index","Sinh Câu Nhà Đầu Tư Nước Ngoài","Chứng Khoán Theo Ngày");
    SinhCauBDTK bienDongCK = new SinhCauBDTK();
    SinhCauChiSoIndex chiSoIndex = new SinhCauChiSoIndex();
    SinhCauNhaDauTuNuocNgoai nhaDauTu = new SinhCauNhaDauTuNuocNgoai();
    SinhCauTheoNgay theoNgay = new SinhCauTheoNgay();

    ChiSoChungKhoan chiSoCK = new ChiSoChungKhoan();
    CoDongChungKhoan coDongCK = new CoDongChungKhoan();
    CoPhieuChungKhoan coPhieuCK = new CoPhieuChungKhoan();
    CoTucChungKhoan coTucCK = new CoTucChungKhoan();
    GiaChungKhoan giaCK = new GiaChungKhoan();
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
            noiDung.appendText("Biến động chứng khoán:\n");

        }
        if(sinhcauComboxBox.getValue().equals("Sinh Câu Chỉ Số Index")){
            noiDung.appendText("Chỉ số Index:\n");
            chiSoIndex.setDataList(new DuLieuChiSoIndex().chuyenCSVSangIndexList("D:\\Git\\OOP\\BTL_OOP\\src\\duLieu\\vnindexData.csv","vnIndexData"));
            chiSoIndex.doanVan.clear();
            chiSoIndex.sinhDoanVan();
            inTatCa(chiSoIndex.doanVan);
        }
        if(sinhcauComboxBox.getValue().equals("Sinh Câu Nhà Đầu Tư Nước Ngoài")){
            noiDung.appendText("Nhà đầu tư nước ngoài:\n");
            nhaDauTu.setDataList(new DuLieuNDTNN().chuyenFileCSVNDTNNSangList("D:\\Git\\OOP\\BTL_OOP\\src\\duLieu\\nhaDauTuNuocNgoaiData.csv"));
            nhaDauTu.cau.clear();
            nhaDauTu.sinhDoanVan();
            inTatCa(nhaDauTu.cau);
        }
        if(sinhcauComboxBox.getValue().equals("Chứng Khoán Theo Ngày")){
            noiDung.appendText("Chứng khoán theo ngày:\n");

        }
    }

    public void tintucEvent(ActionEvent event){
        if(tintucComboxBox.getValue().equals("Chỉ Số Chứng Khoán")){
            noiDung.appendText("Chỉ số chứng khoán:\n");
            inThongTin(ChiSoChungKhoan.chiSo);
        }
        if(tintucComboxBox.getValue().equals("Cổ Đông Chứng Khoán")){
            noiDung.appendText("Cổ đông chứng khoán:\n");
            inThongTin(CoDongChungKhoan.coDong);
        }
        if(tintucComboxBox.getValue().equals("Cổ Phiếu Chứng Khoán")){
            noiDung.appendText("Cổ phiếu chứng khoán:\n");
            inThongTin(CoPhieuChungKhoan.coPhieu);
        }
        if(tintucComboxBox.getValue().equals("Cổ Tức Chứng Khoán")){
            noiDung.appendText("Cổ tức chứng khoán:\n");
            inThongTin(CoTucChungKhoan.coTuc);
        }
        if(tintucComboxBox.getValue().equals("Giá Chứng Khoán")){
            noiDung.appendText("Giá chứng khoán:\n");
            inThongTin(GiaChungKhoan.gia);
        }
        if(tintucComboxBox.getValue().equals("Giải Ngân Chứng Khoán")){
            noiDung.appendText("Giải ngân chứng khoán:\n");
            inThongTin(GiaiNganChungKhoan.giaiNgan);
        }
        if(tintucComboxBox.getValue().equals("Lợi Nhuận Chứng Khoán")){
            noiDung.appendText("Lợi nhuận chứng khoán:\n");
            inThongTin(LoiNhuanChungKhoan.loiNhuan);
        }
        if(tintucComboxBox.getValue().equals("Nhà Đầu Tư Chứng Khoán")){
            noiDung.appendText("Nhà đầu tư chứng khoán:\n");
            inThongTin(NhaDauTuChungKhoan.nhaDauTu);
        }
        if(tintucComboxBox.getValue().equals("Phiên Chứng Khoán")){
            noiDung.appendText("Phiên chứng khoán:\n");
            inThongTin(PhienChungKhoan.phien);
        }
        if(tintucComboxBox.getValue().equals("Sàn Giao Dịch Chứng Khoán")){
            noiDung.appendText("Sàn giao dịch chứng khoán:\n");
            inThongTin(SanGiaoDichChungKhoan.sanGiaoDich);
        }
        if(tintucComboxBox.getValue().equals("Thanh Khoản Chứng Khoán")){
            noiDung.appendText("Thanh khoản chứng khoán:\n");
            inThongTin(ThanhKhoanChungKhoan.thanhKhoan);
        }
        if(tintucComboxBox.getValue().equals("Trái Phiếu Chứng Khoán")){
            noiDung.appendText("Trái phiếu chứng khoán:\n");
            inThongTin(TraiPhieuChungKhoan.traiPhieu);
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tintucComboxBox.setItems(tintucList);
        sinhcauComboxBox.setItems(sinhcauList);
    }
}
