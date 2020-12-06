package cackieudulieu;

import javafx.beans.property.DoubleProperty;

public class BienDongChungKhoan{
    private String ma;
    private double vonHoa; // don vi ty dong
    private double gia; // Don vi ty dong
    private double khoiLuong; // don vi co phieu
    private double giaSoVoiThangTruoc; // don vi %
    private double kLuongSoVoiTB1Thang;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public double getVonHoa() {
        return vonHoa;
    }

    public void setVonHoa(String vonHoa){
        this.vonHoa = Double.parseDouble(vonHoa);
    }

    public double getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = Double.parseDouble(gia);
    }

    public double getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(String khoiLuong) {
        this.khoiLuong = Double.parseDouble(khoiLuong);
    }

    public double getGiaSoVoiThangTruoc() {
        return giaSoVoiThangTruoc;
    }

    public void setGiaSoVoiThangTruoc(String giaSoVoiThangTruoc) {
        for (int i = 0; i < giaSoVoiThangTruoc.length(); i++) {
            if (giaSoVoiThangTruoc.charAt(i) == ' ') {
                this.giaSoVoiThangTruoc = Double.parseDouble(giaSoVoiThangTruoc.substring(0, i));
                break;
            }
        }
    }

    public double getkLuongSoVoiTB1Thang() {
        return kLuongSoVoiTB1Thang;
    }

    public void setkLuongSoVoiTB1Thang(String kLuongSoVoiTB1Thang) {
        if (kLuongSoVoiTB1Thang.equals("-"))
            this.kLuongSoVoiTB1Thang = 0.0;
        this.kLuongSoVoiTB1Thang = Double.parseDouble(kLuongSoVoiTB1Thang);
    }
}