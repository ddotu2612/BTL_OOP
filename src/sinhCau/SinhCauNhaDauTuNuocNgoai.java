package sinhCau;
import cacKieuDuLieu.NhaDauTuNuocNgoai;
import mauCau.MauCauNhaDauTuNuocNgoai;
import java.util.ArrayList;

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

    public void setTongGiaTriMua(long tongGiaTriMua) {
        this.tongGiaTriMua = tongGiaTriMua;
    }

    public long getTongGiaTriBan() {
        return tongGiaTriBan;
    }

    public void setTongGiaTriBan(long tongGiaTriBan) {
        this.tongGiaTriBan = tongGiaTriBan;
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

    public void setTongKhoiLuongMuaBan( ArrayList<NhaDauTuNuocNgoai> dataList) {
        int i = 0;
        for(i = 0; i< dataList.size();i++) {
            this.tongKhoiLuongMua += dataList.get(i).getKhoiLuongMua();
            this.tongKhoiLuongBan += dataList.get(i).getKhoiLuongBan();
        }
    }
    public void setTongGiaTriMuaBan( ArrayList<NhaDauTuNuocNgoai> dataList) {
        int i = 0;
        for(i = 0; i< dataList.size();i++) {
            this.tongGiaTriMua += dataList.get(i).getGiaTriMua();
            this.tongGiaTriBan += dataList.get(i).getGiaTriBan();
        }
    }

    public String chenDuLieu (String cau, NhaDauTuNuocNgoai data) {
        cau = cau.replace("|MaCK|",data.getMa());
        cau = cau.replace("|khoiLuongMua|",String.valueOf(data.getKhoiLuongQuyDoi(data.getKhoiLuongMua())));
        cau = cau.replace("|giaTriMua|",String.valueOf(data.getGiaTriQuyDoi(data.getGiaTriMua())));
        cau = cau.replace("|khoiLuongBan|",String.valueOf(data.getKhoiLuongQuyDoi(data.getKhoiLuongBan())));
        cau = cau.replace("|giaTriBan|",String.valueOf(data.getGiaTriQuyDoi(data.getGiaTriBan())));
        cau = cau.replace("|khoiLuongRong|",String.valueOf(data.getKhoiLuongQuyDoi(data.getKhoiLuongRong())));
        cau = cau.replace("|giaTriGiaoDichRong|",String.valueOf(data.getGiaTriQuyDoi(data.getGiaTriGiaoDichRong())));
        cau = cau.replace("|dangSoHuu|",String.valueOf(data.getDangSoHuu()));
        return cau;
    }

    public String sinhCauTongKhoiLuongMuaVao ( ){
        String cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTongKhoiLuongMuaVao());
        cau = cau.replace("|tongKhoiLuongMua|",String.valueOf(new NhaDauTuNuocNgoai().getKhoiLuongQuyDoi(this.getTongKhoiLuongMua())));
        return cau;
    }
    public String sinhCauTongKhoiLuongBanRa( ){
        String cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTongKhoiLuongBanRa());
        cau = cau.replace("|tongKhoiLuongBan|",String.valueOf(new NhaDauTuNuocNgoai().getKhoiLuongQuyDoi(this.getTongKhoiLuongMua())));
        return cau;
    }
    public String sinhCauTongGiaTriBanRa ( ){
        String cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTongGiaTriBanRa());
        cau = cau.replace("|tongGiaTriBan|",String.valueOf(new NhaDauTuNuocNgoai().getGiaTriQuyDoi(this.getTongGiaTriBan())));
        return cau;
    }
    public String sinhCauTongGiaTriMuaVao ( ){
        String cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTongGiaTriMuaVao());
        cau = cau.replace("|tongGiaTriMua|",String.valueOf(new NhaDauTuNuocNgoai().getGiaTriQuyDoi(this.getTongGiaTriMua())));
        return cau;
    }
    public String sinhCauCoPhieuCoKhoiLuongMuaNhieuNhat( ) {
        String cau;
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getCoPhieuCoKhoiLuongMuaNhieuNhat());

        //tìm max
        NhaDauTuNuocNgoai max_KL = dataList.get(0);
        for (int i = 1 ; i < dataList.size(); i++ ) {
            if (max_KL.getKhoiLuongMua() < dataList.get(i).getKhoiLuongMua()) {
                max_KL = dataList.get(i);
            }
        }
        cau = chenDuLieu(cau,max_KL);
        return cau;
    }
    public String sinhCauCoPhieuCoKhoiLuongBanNhieuNhat( ) {
        String cau;
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getCoPhieuCoKhoiLuongBanNhieuNhat());
        NhaDauTuNuocNgoai max_KL = dataList.get(0);
        for (int i = 1 ; i < dataList.size(); i++ ) {
            if (max_KL.getKhoiLuongBan() < dataList.get(i).getKhoiLuongBan()) {
                max_KL = dataList.get(i);
            }
        }
        cau = chenDuLieu(cau,max_KL);
        return cau;
    }
    public String sinhCauCoPhieuMuaRongNhieuNhat( ) {
        String cau;
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getCoPhieuMuaRongNhieuNhat());
        NhaDauTuNuocNgoai max_KL = dataList.get(0);
        for (int i = 1 ; i < dataList.size(); i++ ) {
            if (max_KL.getKhoiLuongRong() < dataList.get(i).getKhoiLuongRong()) {
                max_KL = dataList.get(i);
            }
        }
        cau = chenDuLieu(cau,max_KL);
        return cau;
    }
    public String sinhCauCoPhieuCoGiaTriMuaCaoNhat( ) {
        String cau;
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getCoPhieuCoGiaTriMuaCaoNhat());
        NhaDauTuNuocNgoai max_GT = dataList.get(0);
        for (int i = 1 ; i < dataList.size(); i++ ) {
            if (max_GT.getGiaTriMua() < dataList.get(i).getGiaTriMua()) {
                max_GT = dataList.get(i);
            }
        }
        cau = chenDuLieu(cau,max_GT);
        return cau;
    }
    public String sinhCauCoPhieuCoGiaTriBanCaoNhat( ) {
        String cau;
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getCoPhieuCoGiaTriBanCaoNhat());
        NhaDauTuNuocNgoai max_GT = dataList.get(0);
        for (int i = 1 ; i < dataList.size(); i++ ) {
            if (max_GT.getGiaTriBan() < dataList.get(i).getGiaTriBan()) {
                max_GT = dataList.get(i);
            }
        }
        cau = chenDuLieu(cau,max_GT);
        return cau;
    }
    public String sinhCauCoPhieuCoGiaTriGiaoDichRongCaoNhat() {
        String cau;
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getCoPhieuCoGiaTriGiaoDichRongCaoNhat());
        NhaDauTuNuocNgoai max_KL = dataList.get(0);
        for (int i = 1 ; i < dataList.size(); i++ ) {
            if (max_KL.getGiaTriGiaoDichRong() < dataList.get(i).getGiaTriGiaoDichRong()) {
                max_KL = dataList.get(i);
            }
        }
        cau = chenDuLieu(cau,max_KL);
        return cau;
    }
    public String sinhCauCoPhieuCoGiaTriBanThapNhat() {
        String cau;
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getCoPhieuCoGiaTriBanThapNhat());
        NhaDauTuNuocNgoai minGT_GT = dataList.get(0);
        for (int i = 1 ; i < dataList.size(); i++ ) {
            if (minGT_GT.getGiaTriBan() > dataList.get(i).getGiaTriBan()) {
                minGT_GT = dataList.get(i);
            }
        }
        cau = chenDuLieu(cau,minGT_GT);
        return cau;

    }
    public String sinhCauCoPhieuSoHuuCaoNhat () {
        String cau;
        cau = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getCoPhieuDuocSoHuuCaoNhat());
        NhaDauTuNuocNgoai maxSoHuu = dataList.get(0);
        for(int i = 1 ; i < dataList.size();i++) {
            if (maxSoHuu.getDangSoHuu() < dataList.get(i).getDangSoHuu()) {
                maxSoHuu = dataList.get(i);
            }
        }
        cau = chenDuLieu(cau,maxSoHuu);
        return cau;

    }

    @Override
    public ArrayList<String> sinhDoanVan() {
        cau.add("Tin về nhà đầu tư nước ngoài trên sàn "+this.san+" trong ngày "+ this.ngay+" :");
        cau.add(this.sinhCauTongGiaTriMuaVao());
        cau.add(this.sinhCauTongGiaTriBanRa());
        cau.add(this.sinhCauTongKhoiLuongMuaVao());
        cau.add(this.sinhCauTongKhoiLuongBanRa());
        cau.add(this.sinhCauCoPhieuCoKhoiLuongMuaNhieuNhat());
        cau.add(this.sinhCauCoPhieuCoKhoiLuongBanNhieuNhat());
        cau.add(this.sinhCauCoPhieuMuaRongNhieuNhat());
        cau.add(this.sinhCauCoPhieuCoGiaTriMuaCaoNhat());
        cau.add(this.sinhCauCoPhieuCoGiaTriBanCaoNhat());
        cau.add(this.sinhCauCoPhieuCoGiaTriBanThapNhat());
        cau.add(this.sinhCauCoPhieuCoGiaTriGiaoDichRongCaoNhat());
        cau.add(this.sinhCauCoPhieuSoHuuCaoNhat());

        return cau;
    }

}
