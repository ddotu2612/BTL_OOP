package cacKieuDuLieu;

public class NhaDauTuNuocNgoai {
    private String ma;
    private long khoiLuongMua;
    private long giaTriMua;
    private long khoiLuongBan;
    private long giaTriBan;
    private long khoiLuongRong;
    private long giaTriGiaoDichRong;
    private long roomConLai;
    private long dangSoHuu;

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

    public long getDangSoHuu() {
        return dangSoHuu;
    }

    public void setDangSoHuu(long dangSoHuu) {
        this.dangSoHuu = dangSoHuu;
    }

    public String getKhoiLuongMuaQuyDoi() {
        if (khoiLuongMua / 1_000_000 > 1)
            return String.format("%0.2f", (double) khoiLuongMua / 1_000_000) + "triệu";
        else if (khoiLuongBan / 1000 > 1)
            return String.format("%0.2f", (double) khoiLuongMua / 1000) + "nghìn";
        else
            return String.format("%d", khoiLuongMua);
    }

    public String getKhoiLuongBanQuyDoi() {
        if (khoiLuongBan / 1_000_000 > 1)
            return String.format("%0.2f", (double) khoiLuongBan / 1_000_000) + "triệu";
        else if (khoiLuongBan / 1000 > 1)
            return String.format("%0.2f", (double) khoiLuongBan / 1000) + "nghìn";
        else
            return String.format("%d", khoiLuongBan);
    }

    public String getKhoiLuongRongQuyDoi() {
        if (khoiLuongRong / 1_000_000 > 1)
            return String.format("%0.2f", (double) khoiLuongRong / 1_000_000) + "triệu";
        else if (khoiLuongRong / 1000 > 1)
            return String.format("%0.2f", (double) khoiLuongRong / 1000) + "nghìn";
        else
            return String.format("%d", khoiLuongRong);
    }
    public String getGiaTriMuaQuyDoi() {
        if (giaTriMua/1_000_000_000 > 1)
            return String.format("0.2f",(double) giaTriMua/1_000_000_000) + "tỷ";
        else if(giaTriMua/1_000_000 > 1)
            return String.format("%0.2f",(double) giaTriMua/1_000_000) + "triệu";
        else
            return String.format("%d",giaTriMua);
    }
    public String getGiaTriBanQuyDoi() {
        if (giaTriBan/1_000_000_000 > 1)
            return String.format("0.2f",(double) giaTriBan/1_000_000_000) + "tỷ";
        else if(giaTriBan/1_000_000 > 1)
            return String.format("%0.2f",(double) giaTriBan/1_000_000) + "triệu";
        else
            return String.format("%d",giaTriBan);
    }
    public String getGiaTriGiaoDichRongQuyDoi() {
        if (giaTriGiaoDichRong/1_000_000_000 > 1)
            return String.format("0.2f",(double) giaTriGiaoDichRong/1_000_000_000) + "tỷ";
        else if(giaTriGiaoDichRong/1_000_000 > 1)
            return String.format("%0.2f",(double) giaTriGiaoDichRong/1_000_000) + "triệu";
        else
            return String.format("%d",giaTriGiaoDichRong);
    }
    public void hienThiDuLieu() {
        System.out.println(ma + "|"+ khoiLuongMua + "|"+giaTriMua+"|"+khoiLuongBan+"|"+giaTriBan+"|"+khoiLuongRong+"|"+giaTriGiaoDichRong+"|"+roomConLai+"|"+dangSoHuu);
    }
}

