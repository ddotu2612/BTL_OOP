package cackieudulieu;

public class TheoNgay  {

    private String maCk;

    private double giaMoCua;
    private double giaCaoNhat;
    private double giaThapNhat;
    private double giaDongCua;
    private long klgdKhopLenh;
    private long klgdThoaThuan;
    private long gtgdKhopLenh;
    private long gtgdThoaThuan;

    private double thaydoi;

    public TheoNgay() {
    }

    public String getMaCk() {
        return this.maCk;
    }

    public double getGiaMoCua() { return 1000.0D * this.giaMoCua;}

    public double getGiaCaoNhat() {
        return 1000.0D * this.giaCaoNhat;
    }

    public double getGiaThapNhat() {
        return 1000.0D * this.giaThapNhat;
    }

    public double getGiaDongCua() {
        return 1000.0D * this.giaDongCua;
    }

    public long getKlgdKhopLenh() {
        return this.klgdKhopLenh;
    }

    public long getGtgdKhopLenh() {
        return gtgdKhopLenh;
    }

    public long getKlgdThoaThuan() {
        return klgdThoaThuan;
    }

    public long getGtgdThoaThuan() {
        return gtgdThoaThuan;
    }


    public double getThaydoi() {
        this.thaydoi = 1000.0D * this.giaDongCua - 1000.0D * this.giaMoCua;
        return this.thaydoi;
    }


    public void setMaCk(String maCk) {
        this.maCk = maCk;
    }

    public void setGiaMoCua(double giaMoCua) {this.giaMoCua = giaMoCua; }

    public void setGiaCaoNhat(double giaCaoNhat) {
        this.giaCaoNhat = giaCaoNhat;
    }

    public void setGiaThapNhat(double giaThapNhat) {
        this.giaThapNhat = giaThapNhat;
    }

    public void setGiaDongCua(double giaDongCua) {
        this.giaDongCua = giaDongCua;
    }

    public void setKlgdKhopLenh(long klgdKhopLenh) {
        this.klgdKhopLenh = klgdKhopLenh;
    }

    public void setGtgdKhopLenh(long gtgdKhopLenh) {
        this.gtgdKhopLenh = gtgdKhopLenh;
    }

    public void setKlgdThoaThuan(long klgdThoaThuan) {
        this.klgdThoaThuan = klgdThoaThuan;
    }

    public void setGtgdThoaThuan(long gtgdThoaThuan) {
        this.gtgdThoaThuan = gtgdThoaThuan;
    }
}
