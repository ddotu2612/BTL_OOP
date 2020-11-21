package sinhCau;

import cacKieuDuLieu.BienDongChungKhoan;
import mauCau.MaucauBienDongChungKhoan;
import sosanh.*;

import java.util.ArrayList;
import java.util.Collections;

public class SinhCauBDTK extends AbstractSinhCau {
    private ArrayList<BienDongChungKhoan> datalist = new ArrayList<>();
    public static ArrayList<String> doanvan = new ArrayList<>();

    public ArrayList<BienDongChungKhoan> getDatalist() {
        return datalist;
    }

    public void setDatalist(ArrayList<BienDongChungKhoan> datalist) {
        this.datalist = datalist;
        this.listModify();
    }
    public void listModify(){
        for(int i = 0; i < this.datalist.size(); i++){
            if(this.datalist.get(i).getVonHoa() == 0.0){
                this.datalist.remove(i);
                i--;
            }
            if (this.datalist.get(i).getKhoiLuong() == 0.0){
                this.datalist.remove(i);
                i--;
            }
        }
    }

    public String sinhCauGiaoDichNhieuNhat(){
        String cau;
        Collections.sort(this.datalist, new SoSanhKhoiLuong());

        cau = sinhCauNgauNhien(MaucauBienDongChungKhoan.getGiaoDichNhieuNhat());
        cau = cau.replace("|ma1|", this.datalist.get(0).getMa());
        cau = cau.replace("|ma2|", this.datalist.get(1).getMa());
        cau = cau.replace("|ma3|", this.datalist.get(2).getMa());
        cau = cau.replace("|khoiLuong1|", String.valueOf(this.datalist.get(0).getKhoiLuong()));
        cau = cau.replace("|khoiLuong2|", String.valueOf(this.datalist.get(0).getKhoiLuong()));
        cau = cau.replace("|khoiLuong3|", String.valueOf(this.datalist.get(0).getKhoiLuong()));

        return cau;
    }

    public String sinhCauGiaoDichItNhat(){
        String cau;
        Collections.sort(this.datalist, new SoSanhKhoiLuong());
        int x = this.datalist.size();

        cau = sinhCauNgauNhien(MaucauBienDongChungKhoan.getGiaoDichItNhat());
        cau = cau.replace("|ma1|", this.datalist.get(x-1).getMa());
        cau = cau.replace("|ma2|", this.datalist.get(x-2).getMa());
        cau = cau.replace("|ma3|", this.datalist.get(x-3).getMa());
        cau = cau.replace("|khoiLuong1|", String.valueOf(this.datalist.get(x-1).getKhoiLuong()));
        cau = cau.replace("|khoiLuong2|", String.valueOf(this.datalist.get(x-2).getKhoiLuong()));
        cau = cau.replace("|khoiLuong3|", String.valueOf(this.datalist.get(x-3).getKhoiLuong()));

        return cau;
    }

    public String sinhCauVonHoaLonNhat(){
        String cau;
        Collections.sort(this.datalist, new SoSanhVonHoa());

        cau = sinhCauNgauNhien(MaucauBienDongChungKhoan.getVonHoaLonNhat());
        cau = cau.replace("|ma1|", this.datalist.get(0).getMa());
        cau = cau.replace("|ma2|", this.datalist.get(1).getMa());
        cau = cau.replace("|ma3|", this.datalist.get(2).getMa());
        cau = cau.replace("|vonHoa1|", String.valueOf(this.datalist.get(0).getVonHoa()));
        cau = cau.replace("|vonHoa2|", String.valueOf(this.datalist.get(1).getVonHoa()));
        cau = cau.replace("|vonHoa3|", String.valueOf(this.datalist.get(2).getVonHoa()));

        return cau;
    }

    public String sinhCauVonHoaNhoNhat(){
        String cau;
        Collections.sort(this.datalist, new SoSanhVonHoa());
        int x = this.datalist.size();

        cau = sinhCauNgauNhien(MaucauBienDongChungKhoan.getVonHoaNhoNhat());
        cau = cau.replace("|ma1|", this.datalist.get(x-1).getMa());
        cau = cau.replace("|ma2|", this.datalist.get(x-2).getMa());
        cau = cau.replace("|ma3|", this.datalist.get(x-3).getMa());
        cau = cau.replace("|vonHoa1|", String.valueOf(this.datalist.get(x-1).getVonHoa()));
        cau = cau.replace("|vonHoa2|", String.valueOf(this.datalist.get(x-2).getVonHoa()));
        cau = cau.replace("|vonHoa3|", String.valueOf(this.datalist.get(x-3).getVonHoa()));

        return cau;
    }

    public String sinhCauGiaCaoNhat(){
        String cau;
        Collections.sort(this.datalist, new SoSanhGia());

        cau = sinhCauNgauNhien(MaucauBienDongChungKhoan.getGiaCaoNhat());
        cau = cau.replace("|ma1|", this.datalist.get(0).getMa());
        cau = cau.replace("|ma2|", this.datalist.get(1).getMa());
        cau = cau.replace("|ma3|", this.datalist.get(2).getMa());
        cau = cau.replace("|gia1|", String.valueOf(this.datalist.get(0).getGia()));
        cau = cau.replace("|gia2|", String.valueOf(this.datalist.get(1).getGia()));
        cau = cau.replace("|gia3|", String.valueOf(this.datalist.get(2).getGia()));

        return cau;
    }

    public String sinhCauGiaThapNhat(){
        String cau;
        Collections.sort(this.datalist, new SoSanhGia());
        int x = this.datalist.size();

        cau = sinhCauNgauNhien(MaucauBienDongChungKhoan.getGiaThapNhat());
        cau = cau.replace("|ma1|", this.datalist.get(x-1).getMa());
        cau = cau.replace("|ma2|", this.datalist.get(x-2).getMa());
        cau = cau.replace("|ma3|", this.datalist.get(x-3).getMa());
        cau = cau.replace("|gia1|", String.valueOf(this.datalist.get(x-1).getGia()));
        cau = cau.replace("|gia2|", String.valueOf(this.datalist.get(x-2).getGia()));
        cau = cau.replace("|gia3|", String.valueOf(this.datalist.get(x-3).getGia()));

        return cau;
    }

    public String sinhCauGiaTangNhieuNhat(){
        String cau;
        Collections.sort(this.datalist, new SoSanhThayDoiGia());

        cau = sinhCauNgauNhien(MaucauBienDongChungKhoan.getGiaTangNhieuNhat());
        cau = cau.replace("|ma1|", this.datalist.get(0).getMa());
        cau = cau.replace("|ma2|", this.datalist.get(1).getMa());
        cau = cau.replace("|ma3|", this.datalist.get(2).getMa());
        cau = cau.replace("|giasvtt1|", String.valueOf(this.datalist.get(0).getGiaSoVoiThangTruoc()));
        cau = cau.replace("|giasvtt2|", String.valueOf(this.datalist.get(1).getGiaSoVoiThangTruoc()));
        cau = cau.replace("|giasvtt3|", String.valueOf(this.datalist.get(2).getGiaSoVoiThangTruoc()));

        return cau;
    }

    public String sinhCauGiaGiamNhieuNhat(){
        String cau;
        Collections.sort(this.datalist, new SoSanhThayDoiGia());
        int x = this.datalist.size();

        cau = sinhCauNgauNhien(MaucauBienDongChungKhoan.getGiaGiamNhieuNhat());
        cau = cau.replace("|ma1|", this.datalist.get(x-1).getMa());
        cau = cau.replace("|ma2|", this.datalist.get(x-2).getMa());
        cau = cau.replace("|ma3|", this.datalist.get(x-3).getMa());
        cau = cau.replace("|giasvtt1|", String.valueOf(this.datalist.get(x-1).getGiaSoVoiThangTruoc()));
        cau = cau.replace("|giasvtt2|", String.valueOf(this.datalist.get(x-2).getGiaSoVoiThangTruoc()));
        cau = cau.replace("|giasvtt3|", String.valueOf(this.datalist.get(x-3).getGiaSoVoiThangTruoc()));

        return cau;
    }

    public String sinhCauKluongSoVoiTBLonNhat(){
        String cau;
        Collections.sort(this.datalist, new SoSanhKLVoiTB());
        cau = sinhCauNgauNhien(MaucauBienDongChungKhoan.getkLuongSoVoiTBLonNhat());
        cau = cau.replace("|ma1|", this.datalist.get(0).getMa());
        cau = cau.replace("|ma2|", this.datalist.get(1).getMa());
        cau = cau.replace("|ma3|", this.datalist.get(2).getMa());
        cau = cau.replace("|klsvtbt1|", String.valueOf(this.datalist.get(0).getkLuongSoVoiTB1Thang()));
        cau = cau.replace("|klsvtbt2|", String.valueOf(this.datalist.get(1).getkLuongSoVoiTB1Thang()));
        cau = cau.replace("|klsvtbt3|", String.valueOf(this.datalist.get(2).getkLuongSoVoiTB1Thang()));

        return cau;
    }

    public String sinhCauKluongSoVoiTBNhoNhat(){
        String cau;
        Collections.sort(this.datalist, new SoSanhThayDoiGia());
        int x = this.datalist.size();

        cau = sinhCauNgauNhien(MaucauBienDongChungKhoan.getkLuongSoVoiTBNhoNhat());
        cau = cau.replace("|ma1|", this.datalist.get(x-1).getMa());
        cau = cau.replace("|ma2|", this.datalist.get(x-2).getMa());
        cau = cau.replace("|ma3|", this.datalist.get(x-3).getMa());
        cau = cau.replace("|klsvtbt1|", String.valueOf(this.datalist.get(x-1).getkLuongSoVoiTB1Thang()));
        cau = cau.replace("|klsvtbt2|", String.valueOf(this.datalist.get(x-2).getkLuongSoVoiTB1Thang()));
        cau = cau.replace("|klsvtbt3|", String.valueOf(this.datalist.get(x-3).getkLuongSoVoiTB1Thang()));

        return cau;
    }

    @Override
    public ArrayList<String> sinhDoanVan() {
        doanvan.add("Biến động chứng khoán trong 1 tháng trở lại đây: ");
        doanvan.add(sinhCauGiaoDichNhieuNhat());
        doanvan.add(sinhCauGiaoDichItNhat());
        doanvan.add(sinhCauVonHoaLonNhat());
        doanvan.add(sinhCauVonHoaNhoNhat());
        doanvan.add(sinhCauGiaCaoNhat());
        doanvan.add(sinhCauGiaThapNhat());
        doanvan.add(sinhCauGiaTangNhieuNhat());
        doanvan.add(sinhCauGiaGiamNhieuNhat());
        doanvan.add(sinhCauKluongSoVoiTBLonNhat());
        doanvan.add(sinhCauKluongSoVoiTBNhoNhat());

        return doanvan;
    }
}
