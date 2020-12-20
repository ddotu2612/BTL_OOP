package sinhcau;

import cackieudulieu.TheoNgay;
import maucau.MauCauTheoNgay;
import sosanh.theongay.SoSanhDiemChotPhien;
import sosanh.theongay.SoSanhDiemMoPhien;
import sosanh.theongay.SoSanhKhoiLuongGiaoDich;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// lỗi
public class SinhCauTheoNgay extends AbstractSinhCau {
    public static List<String> doan = new ArrayList<>();
    private String san;

    public String getSan() {
        return san;
    }

    public void setSan(String san) {
        this.san = san;
    }

    public SinhCauTheoNgay() {
    }
    public  List<TheoNgay>  datalist = new ArrayList<>();

    public void setDatalist(List<TheoNgay> datalist) {
        this.datalist = datalist;
    }
    // Thay the cac key word va du lieu trong cau bang cac thuoc tinh cua data
    public String chenDuLieu(String cau, TheoNgay data) {
        cau = cau.replace("|maCk|", data.getMaCk());
        cau = cau.replace("|giaMoCua|", Double.toString(data.getGiaMoCua()) + " đồng");
        cau = cau.replace("|giaDongCua|", Double.toString(data.getGiaDongCua()) + " đồng");
        cau = cau.replace("|giaCaoNhat|", Double.toString(data.getGiaCaoNhat()) + " đồng");
        cau = cau.replace("|giaThapNhat|", Double.toString(data.getGiaThapNhat()) + " đồng");
        cau = cau.replace("|gtgdKhopLenh|", (data.getGtgdKhopLenh()) +" đồng");
        cau = cau.replace("|gtgdThoaThuan|", (data.getGtgdThoaThuan())+" đồng");
        cau = cau.replace("|thaydoi|",Double.toString(Math.abs(data.getThaydoi())));
        cau = cau.replace("|klgd|", Long.toString(data.getKlgdKhopLenh()/1000000000));
        return cau;
    }

    public String chenListDuLieu(String cau, List <TheoNgay> datalist) {
        cau = cau.replace("|maCk0|", datalist.get(0).getMaCk());
        cau = cau.replace("|maCk1|", datalist.get(1).getMaCk());
        cau = cau.replace("|maCk2|", datalist.get(2).getMaCk());
        cau = cau.replace("|maCk3|", datalist.get(3).getMaCk());
        cau = cau.replace("|maCk4|", datalist.get(4).getMaCk());
        cau = cau.replace("|giaMoCua0|", Double.toString(datalist.get(0).getGiaMoCua()) + " đồng");
        cau = cau.replace("|giaDongCua0|", Double.toString(datalist.get(0).getGiaDongCua()) + " đồng");
        cau=cau.replace("|klgd0|",datalist.get(0).getKlgdKhopLenh()/1000000000+ " đồng");
        return cau;
    }
    //Sinh cau theo 1 ma
    public String soVoiDauPhien(TheoNgay data) {
        if (data.getThaydoi() > 0) return  chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getTangSoVoiBanDau()),data);
        else if (data.getThaydoi() == 0) return  chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getBangSoVoiBanDau()),data);
        else return  chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiamSoVoiBanDau()),data);
    }
    public String giaDauNgay(TheoNgay data) {
        return chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaDauNgay()), data);
    }
    public String giaCuoiNgay(TheoNgay data) {
        return chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaCuoiNgay()), data);
    }
    public String giaCaoNhat(TheoNgay data) {
        return chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaCaoNhat()), data);
    }
    public String giaThapNhat(TheoNgay data) {
        return chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaThapNhat()), data);
    }
    public String khoiLuongGiaodichKhopLenh(TheoNgay data) {
        return chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getKhoiLuongGiaoDichKhopLenh()), data);
    }
    public String giaTriGiaoDichThoaThuan(TheoNgay data){
        return chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaTriGiaoDichThoaThuan()),data);
    }
    public String giaTriGiaoDichKhopLenh(TheoNgay data){
        return chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaTriGiaoDichKhopLenh()),data);
    }

    //Sinh cau theo nhieu ma
    public String giaCaoThapDauPhien(List<TheoNgay> datalist) {
        String cau1, cau2;
        Collections.sort(datalist, new SoSanhDiemMoPhien());
        cau1 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaThapDauNgay()), datalist);
        Collections.reverse(datalist);
        cau2 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaCaoDauNgay()), datalist);
        return cau1 + "\n" + cau2;
    }

    public String giaCaoThapChotPhien(List<TheoNgay> datalist) {
        String cau1,cau2;
        datalist.sort(new SoSanhDiemChotPhien());
        cau1 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaThapCuoiNgay()), datalist);
        Collections.reverse(datalist);
        cau2 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaCaoCuoiNgay()), datalist);
        return cau1 + "\n" + cau2;
    }

    public String sapXepKhoiLuongGiaoDich(List<TheoNgay> datalist) {
        String cau1,cau2;
        datalist.sort(new SoSanhKhoiLuongGiaoDich());
        cau1 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaoDichIt()), datalist);
        Collections.reverse(datalist);
        cau2 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaoDichNhieu()), datalist);
        return cau1 + "\n" + cau2;
    }


    public List<String> sinhDoanVan() {
        Random rd = new Random();
        int i = rd.nextInt(datalist.size());
        doan.add("Tin về sàn giao dịch " + this.getSan() +" :");
        doan.add(giaDauNgay(datalist.get(i)));
        doan.add(giaCuoiNgay(datalist.get(i)));
        doan.add(soVoiDauPhien(datalist.get(i)));
        doan.add(giaCaoNhat(datalist.get(i)));
        doan.add(giaThapNhat(datalist.get(i)));
        doan.add(giaTriGiaoDichThoaThuan(datalist.get(i)));
        doan.add(khoiLuongGiaodichKhopLenh(datalist.get(i)));
        doan.add(giaTriGiaoDichKhopLenh(datalist.get(i)));
        doan.add(giaCaoThapDauPhien(datalist));
        doan.add(giaCaoThapChotPhien(datalist));
        doan.add(sapXepKhoiLuongGiaoDich(datalist));
        return doan;
    }
}
