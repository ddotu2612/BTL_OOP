package sinhCau;


import cacKieuDuLieu.ChiSoIndex;
import cacKieuDuLieu.NhaDauTuNuocNgoai;
import mauCau.MauCauNhaDauTuNuocNgoai;
import soSanhDuLieuNDTNN.*;

import java.util.ArrayList;
import java.util.Collections;

public class SinhCauNhaDauTuNuocNgoai extends AbstractSinhCau{
    private ArrayList<NhaDauTuNuocNgoai> dataList = new ArrayList<>();
    public static ArrayList<String> cau = new ArrayList<>();
    private String san;
    private String ngay;
    private long tongKhoiLuongMua;
    private long tongKhoiLuongBan;


    public void setTongKhoiLuongMuaBan() {
        int i = 0;
        for(i = 0; i<this.dataList.size();i++) {
            this.tongKhoiLuongMua += dataList.get(i).getKhoiLuongMua();
            this.tongKhoiLuongBan += dataList.get(i).getKhoiLuongBan();
        }
    }

    public long getTongKhoiLuongMua() {
        return tongKhoiLuongMua;
    }

    public void setTongKhoiLuongMua(long tongKhoiLuongMua) {
        this.tongKhoiLuongMua = tongKhoiLuongMua;
    }

    public long getTongKhoiLuongBan() {
        return tongKhoiLuongBan;
    }

    public void setTongKhoiLuongBan(long tongKhoiLuongBan) {
        this.tongKhoiLuongBan = tongKhoiLuongBan;
    }

    public String getSanGiaoDich() {
        return san;
    }
    public void setSanGiaoDich(String san) {
        this.san = san;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = "23/10/2020";
    }

    public String chenDuLieu (String cau, NhaDauTuNuocNgoai data) {
        cau = cau.replace("|maCK|",data.getMa());
        cau = cau.replace("|khoiLuongMua|",String.valueOf(data.getKhoiLuongMua()));
        cau = cau.replace("|giaTriMua|",String.valueOf(data.getGiaTriMua()));
        cau = cau.replace("|khoiLuongBan|",String.valueOf(data.getKhoiLuongBan()));
        cau = cau.replace("|giaTriBan|",String.valueOf(data.getGiaTriBan()));
        cau = cau.replace("|khoiLuongRong|",String.valueOf(data.getKhoiLuongRong()));
        cau = cau.replace("|giaTriGiaoDichRong|",String.valueOf(data.getGiaTriGiaoDichRong()));
        cau = cau.replace("|san|",this.san);
        return cau;
    }
//    public String sinhCauTongKhoiLuongMuaVao (NhaDauTuNuocNgoai data ){
//        String cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTongKhoiLuongMuaVao());
//        return cau;
//    }
//    public String sinhCauTongKhoiLuongBanRa(NhaDauTuNuocNgoai data ){
//        String cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTongKhoiLuongBanRa());
//        return cau;
//  }
    public String sinhCauCoPhieuCoKhoiLuongMuaNhieuNhat() {
        String cau;
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getCoPhieuCoKhoiLuongMuaNhieuNhat());
        Collections.sort(this.dataList,new SoSanhKhoiLuongMua());
        Collections.reverse(this.dataList);
        return cau;
    }
    public String sinhCauCoPhieuCoKhoiLuongBanNhieuNhat() {
        String cau;
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getCoPhieuCoKhoiLuongBanNhieuNhat());
        Collections.sort(this.dataList,new SoSanhKhoiLuongBan());
        Collections.reverse(this.dataList);
        return cau;
    }
    public String sinhCauCoPhieuMuaRongNhieuNhat() {
        String cau;
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getCoPhieuMuaRongNhieuNhat());
        Collections.sort(this.dataList,new SoSanhKhoiLuongRong());
        Collections.reverse(this.dataList);
        return cau;
    }
    public String sinhCauCoPhieuCoGiaTriMuaCaoNhat() {
        String cau;
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getCoPhieuCoGiaTriMuaCaoNhat());
        Collections.sort(this.dataList,new SoSanhGiaTriMua());
        Collections.reverse(this.dataList);
        return cau;
    }
    public String sinhCauCoPhieuCoGiaTriBanCaoNhat() {
        String cau;
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getCoPhieuCoGiaTriBanCaoNhat());
        Collections.sort(this.dataList,new SoSanhGiaTriBan());
        Collections.reverse(this.dataList);
        return cau;
    }
    public String sinhCauCoPhieuCoGiaTriGiaoDichRongCaoNhat() {
        String cau;
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getCoPhieuCoGiaTriGiaoDichRongCaoNhat());
        Collections.sort(this.dataList,new SoSanhGiaTriGiaoDichRong());
        Collections.reverse(this.dataList);
        return cau;
    }



    @Override
    public ArrayList<String> sinhDoanVan() {
        cau.add("Tin về nhà đầu tư nước ngoài trên sàn "+this.san+" trong ngày "+ this.ngay+" :");
        cau.add(this.sinhCauCoPhieuCoKhoiLuongMuaNhieuNhat());
        cau.add(this.sinhCauCoPhieuCoKhoiLuongBanNhieuNhat());
        cau.add(this.sinhCauCoPhieuMuaRongNhieuNhat());
        cau.add(this.sinhCauCoPhieuCoGiaTriMuaCaoNhat());
        cau.add(this.sinhCauCoPhieuCoGiaTriMuaCaoNhat());
        cau.add(this.sinhCauCoPhieuCoGiaTriGiaoDichRongCaoNhat());

        return cau;
    }

    @Override
    public void setDataList(ArrayList<ChiSoIndex> chuyenCSVSangIndexList) {
    }
}
