package giaodien;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import laydulieu.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import tintuc.ChiSoChungKhoan;
import sinhcau.*;
import tintuc.*;

import java.io.FileWriter;
import java.net.URL;
import java.util.*;


public class Controller implements Initializable {
    @FXML
    ComboBox<String> tintucComboxBox;
    @FXML
    ComboBox<String> sinhcauComboxBox;
    @FXML
    TextArea noiDung;
    @FXML DatePicker ngay;
    @FXML ComboBox<String> san;
    ObservableList<String> list = FXCollections.observableArrayList("HOSE", "UPCOM", "VN30");

    ObservableList<String> tintucList = FXCollections.observableArrayList("Chỉ Số Chứng Khoán",
            "Cổ Đông Chứng Khoán","Cổ Phiếu Chứng Khoán","Cổ Tức Chứng Khoán","Giá Chứng Khoán",
            "Giải Ngân Chứng Khoán","Lợi Nhuận Chứng Khoán","Nhà Đầu Tư Chứng Khoán","Phiên Chứng Khoán",
            "Sàn Giao Dịch Chứng Khoán","Thanh Khoản Chứng Khoán","Trái Phiếu Chứng Khoán");
    ObservableList<String> sinhcauList = FXCollections.observableArrayList("Sinh Câu Biến Động Chứng Khoán",
            "Sinh Câu Chỉ Số Index","Sinh Câu Nhà Đầu Tư Nước Ngoài","Chứng Khoán Theo Ngày");
    SinhCauBDTK bienDongCK = new SinhCauBDTK();
    SinhCauChiSoIndex chiSoIndex = new SinhCauChiSoIndex();
    SinhCauNhaDauTuNuocNgoai nhaDauTu = new SinhCauNhaDauTuNuocNgoai();
    SinhCauTheoNgay theoNgay = new SinhCauTheoNgay();

    //GiaiNganChungKhoan
    public void inThongTin(List<String> p){
        Collections.shuffle(p);
        try {
            for (int i =0;(i<5);i++) {
                String s = p.get(i);
                noiDung.appendText(s + "\n");
            }
        }
        catch(Exception ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("LỖI");
            alert.setHeaderText(null);
            alert.setContentText("KHÔNG CÓ THÔNG TIN !");
            alert.show();
        }
    }

    public void inTatCa(List<String> p){
        p.add("\n");
        p.stream().forEach((s) -> {
            noiDung.appendText(s +"\n");
        });
    }

    public void sinhcau(){
        if(sinhcauComboxBox.getSelectionModel().isEmpty()) {
            //
        }
        else if(sinhcauComboxBox.getValue().equals("Sinh Câu Biến Động Chứng Khoán")){
            noiDung.clear();
            noiDung.appendText("===BIẾN ĐỘNG CHỨNG KHOÁN===:\n");
            String dir = System.getProperty("user.dir");
            bienDongCK.setDatalist(new DuLieuBDTK().CSV_Extract(dir + "\\src\\dulieu\\BienDongChungKhoan.csv"));
            inTatCa(bienDongCK.sinhDoanVan());
        }
        else if(sinhcauComboxBox.getValue().equals("Sinh Câu Chỉ Số Index")){
            noiDung.clear();
            noiDung.appendText("===CHỈ SỐ INDEX===:\n");
            String dir = System.getProperty("user.dir");
            chiSoIndex.setDataList(new DuLieuChiSoIndex().chuyenCSVSangIndexList(dir + "\\src\\dulieu\\vnindexData.csv", "VNINDEX"));
            inTatCa(chiSoIndex.sinhDoanVan());
        }
        else if(sinhcauComboxBox.getValue().equals("Sinh Câu Nhà Đầu Tư Nước Ngoài")){
            noiDung.clear();
            String sanCK, date;
            try {
                sanCK = san.getValue();
                date = ngay.getValue().toString();
                String[]  data = date.split("\\-");
                String ngayChon  = "" + data[2] + "/" + data[1] + "/" + data[0];
                String dir = System.getProperty("user.dir") ;
                Document doc;
                doc = Jsoup.connect("https://s.cafef.vn/TraCuuLichSu2/3/" + sanCK+"/" + ngayChon+".chn").get();
                Elements column1 = doc.select("tr > td.CodeItem>a");
                Elements body = doc.select("tr > td.Item");
                int indext = 0 ;
                StringBuilder sb = new StringBuilder();
                FileWriter fw = new FileWriter(dir + "\\src\\duLieu\\nhaDauTuNuocNgoaiData.csv");

                for ( int i =0 ; i < body.size(); i++) {
                    String s = body.get(i).text();
                    String[] str = s.split(",");
                    s = String.join(".",str);
                    if( i % 8 == 0) {
                        sb.append("\"").append(column1.get(indext++).text()).append("\",");
                        sb.append("\"").append(s).append("\",");
                    } else {
                        sb.append("\"").append(s);
                        sb.append((i % 8 != 7) ? "\"," : "\"\n");
                    }
                }
                fw.write(sb.toString());
                fw.close();
                noiDung.appendText("===NHÀ ĐẦU TƯ NƯỚC NGOÀI ngày "+ ngayChon +" ===:\n");
                nhaDauTu.setSanGiaoDich(sanCK);
                nhaDauTu.setDataList(new DuLieuNDTNN().chuyenFileCSVNDTNNSangList( dir+"\\src\\dulieu\\nhaDauTuNuocNgoaiData.csv"));
                nhaDauTu.setTongGiaTriMuaBan(nhaDauTu.getDataList());
                nhaDauTu.setTongKhoiLuongMuaBan(nhaDauTu.getDataList());
                inTatCa(nhaDauTu.sinhDoanVan());
            } catch (Exception ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("ERROR");
                alert.setHeaderText("ERROR INFORMATION");
                alert.setContentText("BẠN CHƯA CHỌN NGÀY HOẶC SÀN HOẶC KHÔNG CÓ DỮ LIỆU NGÀY BẠN CHỌN");
                alert.show();
            }
        }
        else if(sinhcauComboxBox.getValue().equals("Chứng Khoán Theo Ngày")) {
            noiDung.clear();
            String sanCK, date;
            try {
                sanCK = san.getValue();
                date = ngay.getValue().toString();
                String[]  data = date.split("\\-");
                String ngayChon  = "" + data[2] + "/" + data[1] + "/" + data[0];
                String dir = System.getProperty("user.dir");
                Document doc;
                String url = "https://s.cafef.vn/TraCuuLichSu2/1/" + sanCK +"/" + ngayChon + ".chn";
                doc = Jsoup.connect(url).get();
                FileWriter fw = new FileWriter(dir + "//src//duLieu//bienDongTheoNgayData.csv");
                Elements Item_DateItem_lsg = doc.select("tr > td.Item_DateItem_lsg > a");
                Elements Item_Price1 = doc.select("tr > td.Item_Price1");
                Elements Item_ChangePrice_lsg = doc.select("tr > td.Item_ChangePrice_lsg");
                StringBuilder sb = new StringBuilder();
                int index1 = 0;
                int index2 = 0;
                for (int i = 0; i < Item_Price1.size(); i++) {
                    if (i % 10 == 0) {
                        sb.append("\"").append(Item_DateItem_lsg.get(index1++).text()).append("\",");
                        sb.append("\"").append(Item_Price1.get(i).text()).append("\",");
                    } else if (i % 10 == 2) {
                        sb.append("\"").append(Item_ChangePrice_lsg.get(index2++).text()).append("\",");
                        sb.append("\"").append(Item_Price1.get(i).text()).append("\",");
                    } else if (i % 10 == 1) continue;
                    else {
                        sb.append("\"").append(Item_Price1.get(i).text().replace(",", "."));
                        sb.append((i % 10 != 9) ? "\"," : "\"\n");
                    }
                }
                fw.write(sb.toString());
                fw.close();
                noiDung.appendText("===CHỨNG KHOÁN THEO NGÀY " + ngayChon + "=== :\n");
                theoNgay.setSan(sanCK);
                theoNgay.datalist = new DuLieuTheoNgay().chuyenCSVSangIndexList(dir + "\\src\\dulieu\\bienDongTheoNgayData.csv");
                inTatCa(theoNgay.sinhDoanVan());
            } catch (Exception ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("ERROR");
                alert.setHeaderText("ERROR INFORMATION");
                alert.setContentText("BẠN CHƯA CHỌN NGÀY HOẶC SÀN HOẶC KHÔNG CÓ DỮ LIỆU NGÀY BẠN CHỌN");
                alert.show();
            }
        }
    }

    public void tintucEvent(ActionEvent event) {
        try {
            LayDuLieu data = new LayDuLieu();
            data.layCau();
            PhanLoai pl = new PhanLoai();
            for(String s: data.cauChungKhoan) {
                pl.phanLoai(s);
            }
            if(tintucComboxBox.getValue().equals("Chỉ Số Chứng Khoán")){
                noiDung.appendText("===CHỈ SỐ CHỨNG KHOÁN===:\n");
                inThongTin(ChiSoChungKhoan.chiSo);
            }
            if(tintucComboxBox.getValue().equals("Cổ Đông Chứng Khoán")){
                noiDung.appendText("===CỔ ĐÔNG CHỨNG KHOÁN===:\n");
                inThongTin(CoDongChungKhoan.coDong);
            }
            if(tintucComboxBox.getValue().equals("Cổ Phiếu Chứng Khoán")){
                noiDung.appendText("===CỔ PHIẾU CHỨNG KHOÁN===:\n");
                inThongTin(CoPhieuChungKhoan.coPhieu);
            }
            if(tintucComboxBox.getValue().equals("Cổ Tức Chứng Khoán")){
                noiDung.appendText("===CỔ TỨC CHỨNG KHOÁN===:\n");
                inThongTin(CoTucChungKhoan.coTuc);
            }
            if(tintucComboxBox.getValue().equals("Giá Chứng Khoán")){
                noiDung.appendText("===GIÁ CHỨNG KHOÁN===:\n");
                inThongTin(GiaChungKhoan.gia);
            }
            if(tintucComboxBox.getValue().equals("Giải Ngân Chứng Khoán")){
                noiDung.appendText("===GIẢI NGÂN CHỨNG KHOÁN===:\n");
                inThongTin(GiaiNganChungKhoan.giaiNgan);
            }
            if(tintucComboxBox.getValue().equals("Lợi Nhuận Chứng Khoán")){
                noiDung.appendText("===LỢI NHUẬN CHỨNG KHOÁN===:\n");
                inThongTin(LoiNhuanChungKhoan.loiNhuan);
            }
            if(tintucComboxBox.getValue().equals("Nhà Đầu Tư Chứng Khoán")){
                noiDung.appendText("===NHÀ ĐẦU TƯ CHỨNG KHOÁN===:\n");
                inThongTin(NhaDauTuChungKhoan.nhaDauTu);
            }
            if(tintucComboxBox.getValue().equals("Phiên Chứng Khoán")){
                noiDung.appendText("===PHIÊN CHỨNG KHOÁN===:\n");
                inThongTin(PhienChungKhoan.phien);
            }
            if(tintucComboxBox.getValue().equals("Sàn Giao Dịch Chứng Khoán")){
                noiDung.appendText("===SÀN GIAO DỊCH CHỨNG KHOÁN===:\n");
                inThongTin(SanGiaoDichChungKhoan.sanGiaoDich);
            }
            if(tintucComboxBox.getValue().equals("Thanh Khoản Chứng Khoán")){
                noiDung.appendText("===THANH KHOẢN CHỨNG KHOÁN===:\n");
                inThongTin(ThanhKhoanChungKhoan.thanhKhoan);
            }
            if(tintucComboxBox.getValue().equals("Trái Phiếu Chứng Khoán")){
                noiDung.appendText("===TRÁI PHIẾU CHỨNG KHOÁN===:\n");
                inThongTin(TraiPhieuChungKhoan.traiPhieu);
            }
        } catch (Exception ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("ERROR INFORMATION");
            alert.setContentText("KHÔNG CÓ DỮ LIỆU VỀ TIN NÀY HOẶC LỖI KẾT NỐI");
            alert.show();
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
        sinhcauComboxBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!sinhcauComboxBox.getSelectionModel().isEmpty()) {
                    sinhcau();
                }
            }
        });
        san.setItems(list);
        san.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!san.getSelectionModel().isEmpty())  sinhcau();
            }
        });
    }
}
