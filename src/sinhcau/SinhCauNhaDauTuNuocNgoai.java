package sinhcau;
import cackieudulieu.NhaDauTuNuocNgoai;
import maucau.MauCauNhaDauTuNuocNgoai;
import sosanh.nhadautunuocngoai.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SinhCauNhaDauTuNuocNgoai extends AbstractSinhCau{
    private List<NhaDauTuNuocNgoai> dataList = new ArrayList<>();
    public static List<String> cau = new ArrayList<>();

    private String san;
    private long tongKhoiLuongMua;
    private long tongKhoiLuongBan;
    private long tongGiaTriMua;
    private long tongGiaTriBan;

    public void setTongKhoiLuongMuaBan( List<NhaDauTuNuocNgoai> dataList) {
        for(int i = 0; i < dataList.size();i++) {
            this.tongKhoiLuongMua += dataList.get(i).getKhoiLuongMua();
            this.tongKhoiLuongBan += dataList.get(i).getKhoiLuongBan();
        }
    }
    public void setTongGiaTriMuaBan( List<NhaDauTuNuocNgoai> dataList) {
        for(int i = 0; i < dataList.size();i++) {
            this.tongGiaTriMua += dataList.get(i).getGiaTriMua();
            this.tongGiaTriBan += dataList.get(i).getGiaTriBan();
        }
    }

    public static List<String> getCau() {
        return cau;
    }

    public long getTongGiaTriMua() {
        return tongGiaTriMua;
    }

    public long getTongGiaTriBan() {
        return tongGiaTriBan;
    }

    public void setDataList(List<NhaDauTuNuocNgoai> dataList) {
        this.dataList = dataList;
    }

    public List<NhaDauTuNuocNgoai> getDataList() {
        return this.dataList;
    }

    public long getTongKhoiLuongMua() {
        return tongKhoiLuongMua;
    }

    public long getTongKhoiLuongBan() {
        return tongKhoiLuongBan;
    }

    public void setSanGiaoDich(String san) {
        this.san = san;
    }

    public String sinhCauTopCoPhieuDuocMuaNhieu () {
        String cau;
        Collections.sort(this.dataList,new SoSanhKhoiLuongMuaVao());
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTopCoPhieuDuocMuaNhieu());
        for(int i = 0 ; i < dataList.size(); i++) {
            cau = cau.replace("|mã "+(i+1)+"|", dataList.get(i).getMa());
            cau = cau.replace("|KL"+(i+1)+"|", String.valueOf(new NhaDauTuNuocNgoai().getQuyDoi(dataList.get(i).getKhoiLuongMua())));
        }
        return cau;
    }

    public String sinhCauTongKhoiLuongMuaVao () {
        String cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTongKhoiLuongMuaVao());
        cau = cau.replace("|tongKhoiLuongMua|", String.valueOf(new NhaDauTuNuocNgoai().getQuyDoi(this.getTongKhoiLuongMua())));
        return cau;
    }
    public String sinhCauTongKhoiLuongBanRa() {
        String cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTongKhoiLuongBanRa());
        cau = cau.replace("|tongKhoiLuongBan|", String.valueOf(new NhaDauTuNuocNgoai().getQuyDoi(this.getTongKhoiLuongBan())));
        return cau;
    }
    public String sinhCauTongGiaTriBanRa () {
        String cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTongGiaTriBanRa());
        cau = cau.replace("|tongGiaTriBan|", String.valueOf(new NhaDauTuNuocNgoai().getQuyDoi(this.getTongGiaTriBan())));
        return cau;
    }
    public String sinhCauTongGiaTriMuaVao () {
        String cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTongGiaTriMuaVao());
        cau = cau.replace("|tongGiaTriMua|", String.valueOf(new NhaDauTuNuocNgoai().getQuyDoi(this.getTongGiaTriMua())));
        return cau;
    }

    public String sinhCauCoPhieuCoKhoiLuongBanNhieuNhat() {
        String cau;
        Collections.sort(this.dataList,new SoSanhKhoiLuongBan());
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getCoPhieuCoKhoiLuongBanNhieuNhat());
        cau = cau.replace("|ma|", dataList.get(0).getMa());
        cau = cau.replace("|khoiLuongBan|", new NhaDauTuNuocNgoai().getQuyDoi(dataList.get(0).getKhoiLuongBan()));
        return cau;
    }
    public String sinhCauTopCoPhieuMuaRongNhieuNhat() {
        String cau;
        Collections.sort(this.dataList, new SoSanhKhoiLuongMuaRong());
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTopCoPhieuMuaRongNhieuNhat());
        for (int i = 0 ; i < 3; i++ ) {
            cau = cau.replace("|mã "+(i+1)+"|", dataList.get(i).getMa());
            cau = cau.replace("|KLR"+(i+1)+"|", String.valueOf(new NhaDauTuNuocNgoai().getQuyDoi(this.dataList.get(i).getKhoiLuongRong())));
        }
        return cau;
    }

    public String sinhCauCoPhieuCoGiaTriBanCaoNhat() {
        String cau;
        Collections.sort(this.dataList, new SoSanhGiaTriBan());
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTopCoPhieuCoGiaTriBanCaoNhat());
        for(int i = 0 ; i < 3 ;i++) {
            cau = cau.replace("|mã "+(i+1)+"|", dataList.get(i).getMa());
            cau = cau.replace("|GTB"+(i+1)+"|", String.valueOf(new NhaDauTuNuocNgoai().getQuyDoi(dataList.get(i).getGiaTriBan())));
        }
        return cau;
    }
    public String sinhCauCoPhieuCoGiaTriGiaoDichRongCaoNhat() {
        String cau;
        Collections.sort(this.dataList,new SoSanhGiaTriGDRong());
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getCoPhieuCoGiaTriGiaoDichRongCaoNhat());
        cau = cau.replace("|ma|",dataList.get(0).getMa());
        cau = cau.replace("|giaTriGiaoDichRong|",new NhaDauTuNuocNgoai().getQuyDoi(dataList.get(0).getGiaTriGiaoDichRong()));
        return cau;
    }

    public String sinhCauCoPhieuSoHuuCaoNhat () {
        String cau;
        Collections.sort(this.dataList,new SoSanhTyLeSoHuu());
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTopCoPhieuDuocSoHuuCaoNhat());
        for(int i = 0 ;i < 3;i++ ) {
            cau = cau.replace("|mã "+(i+1)+"|",dataList.get(i).getMa());
            cau = cau.replace("|tỷ lệ "+(i+1)+"|",String.valueOf(dataList.get(i).getDangSoHuu()));
        }
        return cau;
    }

    @Override
    public List<String> sinhDoanVan() {
        cau.add("Tin về nhà đầu tư nước ngoài trên sàn " + this.san + " :");
        cau.add(this.sinhCauTopCoPhieuDuocMuaNhieu().replace("|san|", this.san));
        cau.add(this.sinhCauTongGiaTriMuaVao().replace("|san|", this.san));
        cau.add(this.sinhCauTongGiaTriBanRa().replace("|san|", this.san));
        cau.add(this.sinhCauTongKhoiLuongMuaVao().replace("|san|", this.san));
        cau.add(this.sinhCauTongKhoiLuongBanRa().replace("|san|", this.san));
        cau.add(this.sinhCauCoPhieuCoKhoiLuongBanNhieuNhat().replace("|san|", this.san));
        cau.add(this.sinhCauTopCoPhieuMuaRongNhieuNhat().replace("|san|", this.san));
        cau.add(this.sinhCauCoPhieuCoGiaTriBanCaoNhat().replace("|san|", this.san));
        cau.add(this.sinhCauCoPhieuCoGiaTriGiaoDichRongCaoNhat().replace("|san|", this.san));
        cau.add(this.sinhCauCoPhieuSoHuuCaoNhat().replace("|san|", this.san));
        return cau;
    }
}
