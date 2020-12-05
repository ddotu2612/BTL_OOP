package sinhcau;
import cackieudulieu.NhaDauTuNuocNgoai;
import maucau.MauCauNhaDauTuNuocNgoai;
import sosanh.nhadautunuocngoai.*;

import java.util.ArrayList;
import java.util.Collections;

public class SinhCauNhaDauTuNuocNgoai extends AbstractSinhCau{
    private ArrayList<NhaDauTuNuocNgoai> dataList = new ArrayList<>();
    public static ArrayList<String> cau = new ArrayList<>();

    private String san;
    private String ngay;
    private long tongKhoiLuongMua;
    private long tongKhoiLuongBan;
    private long tongGiaTriMua;
    private long tongGiaTriBan;

    public static ArrayList<String> getCau() {
        return cau;
    }

    public static void setCau(ArrayList<String> cau) {
        SinhCauNhaDauTuNuocNgoai.cau = cau;
    }

    public long getTongGiaTriMua() {
        return tongGiaTriMua;
    }

    public long getTongGiaTriBan() {
        return tongGiaTriBan;
    }

    public void setDataList(ArrayList<NhaDauTuNuocNgoai> dataList) {
        this.dataList = dataList;
    }

    public ArrayList<NhaDauTuNuocNgoai> getDataList() {
        return this.dataList;
    }

    public long getTongKhoiLuongMua() {
        return tongKhoiLuongMua;
    }

    public long getTongKhoiLuongBan() {
        return tongKhoiLuongBan;
    }

    public String getSanGiaoDich() {
        return san;
    }
    public void setSanGiaoDich(String san) {
        this.san = san;
    }

    public void setTongKhoiLuongMuaBan( ArrayList<NhaDauTuNuocNgoai> dataList) {
        for(int i = 0; i < dataList.size();i++) {
            this.tongKhoiLuongMua += dataList.get(i).getKhoiLuongMua();
            this.tongKhoiLuongBan += dataList.get(i).getKhoiLuongBan();
        }
    }
    public void setTongGiaTriMuaBan( ArrayList<NhaDauTuNuocNgoai> dataList) {
        for(int i = 0; i < dataList.size();i++) {
            this.tongGiaTriMua += dataList.get(i).getGiaTriMua();
            this.tongGiaTriBan += dataList.get(i).getGiaTriBan();
        }
    }

    public String sinhCauTopCoPhieuDuocMuaNhieu () {
        String cau;
        Collections.sort(this.dataList,new SoSanhKhoiLuongMuaVao());
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTopCoPhieuDuocMuaNhieu());
        for(int i = 0 ; i < dataList.size(); i++) {
            cau = cau.replace("|mã "+(i+1)+"|",dataList.get(i).getMa());
            cau = cau.replace("|KL"+(i+1)+"|",String.valueOf(new NhaDauTuNuocNgoai().getKhoiLuongQuyDoi(dataList.get(i).getKhoiLuongMua())));
        }
        return cau;
    }

    public String sinhCauTongKhoiLuongMuaVao () {
        String cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTongKhoiLuongMuaVao());
        cau = cau.replace("|tongKhoiLuongMua|",String.valueOf(new NhaDauTuNuocNgoai().getKhoiLuongQuyDoi(this.getTongKhoiLuongMua())));
        return cau;
    }
    public String sinhCauTongKhoiLuongBanRa() {
        String cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTongKhoiLuongBanRa());
        cau = cau.replace("|tongKhoiLuongBan|",String.valueOf(new NhaDauTuNuocNgoai().getKhoiLuongQuyDoi(this.getTongKhoiLuongBan())));
        return cau;
    }
    public String sinhCauTongGiaTriBanRa () {
        String cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTongGiaTriBanRa());
        cau = cau.replace("|tongGiaTriBan|",String.valueOf(new NhaDauTuNuocNgoai().getGiaTriQuyDoi(this.getTongGiaTriBan())));
        return cau;
    }
    public String sinhCauTongGiaTriMuaVao () {
        String cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTongGiaTriMuaVao());
        cau = cau.replace("|tongGiaTriMua|",String.valueOf(new NhaDauTuNuocNgoai().getGiaTriQuyDoi(this.getTongGiaTriMua())));
        return cau;
    }

    public String sinhCauCoPhieuCoKhoiLuongBanNhieuNhat() {
        String cau;
        Collections.sort(this.dataList,new SoSanhKhoiLuongBan());
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getCoPhieuCoKhoiLuongBanNhieuNhat());
        cau = cau.replace("|ma|",dataList.get(0).getMa());
        cau = cau.replace("|khoiLuongBan|",new NhaDauTuNuocNgoai().getKhoiLuongQuyDoi(dataList.get(0).getKhoiLuongBan()));
        return cau;
    }
    public String sinhCauTopCoPhieuMuaRongNhieuNhat() {
        String cau;
        Collections.sort(this.dataList,new SoSanhKhoiLuongMuaRong());
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTopCoPhieuMuaRongNhieuNhat());
        for (int i = 0 ; i < dataList.size(); i++ ) {
            cau = cau.replace("|mã "+(i+1)+"|",dataList.get(i).getMa());
            cau = cau.replace("|KLR"+(i+1)+"|",String.valueOf(new NhaDauTuNuocNgoai().getKhoiLuongQuyDoi(this.dataList.get(i).getKhoiLuongRong())));
        }
        return cau;
    }

    public String sinhCauCoPhieuCoGiaTriBanCaoNhat() {
        String cau;
        Collections.sort(this.dataList,new SoSanhGiaTriBan());
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTopCoPhieuCoGiaTriBanCaoNhat());
        for(int i = 0 ; i < dataList.size() ;i++) {
            cau = cau.replace("|mã "+(i+1)+"|",dataList.get(i).getMa());
            cau = cau.replace("|GTB"+(i+1)+"|",String.valueOf(new NhaDauTuNuocNgoai().getGiaTriQuyDoi(dataList.get(i).getGiaTriBan())));
        }
        return cau;
    }
    public String sinhCauCoPhieuCoGiaTriGiaoDichRongCaoNhat() {
        String cau;
        Collections.sort(this.dataList,new SoSanhGiaTriGDRong());
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getCoPhieuCoGiaTriGiaoDichRongCaoNhat());
        cau = cau.replace("|ma|",dataList.get(0).getMa());
        cau = cau.replace("|giaTriGiaoDichRong|",new NhaDauTuNuocNgoai().getGiaTriQuyDoi(dataList.get(0).getGiaTriGiaoDichRong()));
        return cau;
    }

    public String sinhCauCoPhieuSoHuuCaoNhat () {
        String cau;
        Collections.sort(this.dataList,new SoSanhTyLeSoHuu());
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTopCoPhieuDuocSoHuuCaoNhat());
        for(int i = 0 ;i < dataList.size();i++ ) {
            cau = cau.replace("|mã "+(i+1)+"|",dataList.get(i).getMa());
            cau = cau.replace("|tỷ lệ "+(i+1)+"|",String.valueOf(dataList.get(i).getDangSoHuu()));
        }
        return cau;

    }

    @Override
    public ArrayList<String> sinhDoanVan() {
        cau.add("Tin về nhà đầu tư nước ngoài trên sàn " +this.san+ " trong ngày " + this.ngay+ " :");
        cau.add(this.sinhCauTopCoPhieuDuocMuaNhieu());
        cau.add(this.sinhCauTongGiaTriMuaVao());
        cau.add(this.sinhCauTongGiaTriBanRa());
        cau.add(this.sinhCauTongKhoiLuongMuaVao());
        cau.add(this.sinhCauTongKhoiLuongBanRa());
        cau.add(this.sinhCauCoPhieuCoKhoiLuongBanNhieuNhat());
        cau.add(this.sinhCauTopCoPhieuMuaRongNhieuNhat());
        cau.add(this.sinhCauCoPhieuCoGiaTriBanCaoNhat());
        cau.add(this.sinhCauCoPhieuCoGiaTriGiaoDichRongCaoNhat());
        cau.add(this.sinhCauCoPhieuSoHuuCaoNhat());

        return cau;
    }
}
