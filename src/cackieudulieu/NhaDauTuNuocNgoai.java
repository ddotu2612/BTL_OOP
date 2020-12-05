package cackieudulieu;

public class NhaDauTuNuocNgoai {
    private String ma;
    private long khoiLuongMua;
    private long giaTriMua;
    private long khoiLuongBan;
    private long giaTriBan;
    private long khoiLuongRong;
    private long giaTriGiaoDichRong;
    private long roomConLai;
    private double dangSoHuu;


    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public long getKhoiLuongMua() {
        return khoiLuongMua;
    }

    public void setKhoiLuongMua(long khoiLuongMua) {
        this.khoiLuongMua = khoiLuongMua;
    }

    public long getGiaTriMua() {
        return giaTriMua;
    }

    public void setGiaTriMua(long giaTriMua) {
        this.giaTriMua = giaTriMua;
    }

    public long getKhoiLuongBan() {
        return khoiLuongBan;
    }

    public void setKhoiLuongBan(long khoiLuongBan) {
        this.khoiLuongBan = khoiLuongBan;
    }

    public long getGiaTriBan() {
        return giaTriBan;
    }

    public void setGiaTriBan(long giaTriBan) {
        this.giaTriBan = giaTriBan;
    }

    public long getKhoiLuongRong() {
        return khoiLuongRong;
    }

    public void setKhoiLuongRong(long khoiLuongRong) {
        this.khoiLuongRong = khoiLuongRong;
    }

    public long getGiaTriGiaoDichRong() {
        return giaTriGiaoDichRong;
    }

    public void setGiaTriGiaoDichRong(long giaoDichRong) {
        this.giaTriGiaoDichRong = giaoDichRong;
    }

    public long getRoomConLai() {
        return roomConLai;
    }

    public void setRoomConLai(long roomConLai) {
        this.roomConLai = roomConLai;
    }

    public double getDangSoHuu() {
        return dangSoHuu;
    }

    public void setDangSoHuu(double dangSoHuu) {
        this.dangSoHuu = dangSoHuu;
    }


    public String getKhoiLuongQuyDoi( long khoiLuong) {
        if (khoiLuong/1_000_000_000 > 1)
            return String.format("%.2f",(double) khoiLuong/1_000_000_000) + " tỷ";
        if (khoiLuong / 1_000_000 > 1)
            return String.format("%.2f", (double) khoiLuong / 1_000_000) + " triệu";
        else if (khoiLuong/ 1000 > 1)
            return String.format("%.2f", (double) khoiLuong / 1000) + " nghìn";
        else
            return String.format("%d", khoiLuong);
    }

    public String getGiaTriQuyDoi(long giaTri) {
        if (giaTri/1_000_000_000 > 1)
            return String.format("%.2f",(double) giaTri/1_000_000_000) + " tỷ";
        else if(giaTri/1_000_000 > 1)
            return String.format("%.2f",(double) giaTri/1_000_000) + " triệu";
        else
            return String.format("%d",giaTri);
    }

}

