package tintuc;

import java.io.IOException;
import java.util.List;

public class testTinTucCK {
    public static void main(String[] args) throws IOException {
        LayDuLieu data = new LayDuLieu();
        data.layCau();
        PhanLoai pl = new PhanLoai();
        for(String s: data.cauChungKhoan) {
            pl.phanLoai(s);
        }

        System.out.println("===TIN TỨC CHỈ SỐ CK:");
        inTinTuc(ChiSoChungKhoan.chiSo);

        System.out.println("===TIN TỨC CỔ ĐÔNG CK:");
        inTinTuc(CoDongChungKhoan.coDong);

        System.out.println("===TIN TỨC CỔ PHIẾU CK:");
        inTinTuc(CoPhieuChungKhoan.coPhieu);

        System.out.println("===TIN TỨC CỔ TỨC CK:");
        inTinTuc(CoTucChungKhoan.coTuc);

        System.out.println("===TIN TỨC GIÁ CK:");
        inTinTuc(GiaChungKhoan.gia);

        System.out.println("===TIN TỨC GIẢI NGÂN CK:");
        inTinTuc(GiaiNganChungKhoan.giaiNgan);

        System.out.println("===TIN TỨC LỢI NHUẬN CK:");
        inTinTuc(LoiNhuanChungKhoan.loiNhuan);

        System.out.println("===TIN TỨC NHÀ ĐẦU TƯ CK:");
        inTinTuc(NhaDauTuChungKhoan.nhaDauTu);

        System.out.println("===TIN TỨC PHIÊN CK:");
        inTinTuc(PhienChungKhoan.phien);

        System.out.println("===TIN TỨC SÀN GIAO DỊCH CK:");
        inTinTuc(SanGiaoDichChungKhoan.sanGiaoDich);

        System.out.println("===TIN TỨC THANH KHOẢN CK:");
        inTinTuc(ThanhKhoanChungKhoan.thanhKhoan);

        System.out.println("===TIN TỨC TRÁI PHIẾU CK:");
        inTinTuc(TraiPhieuChungKhoan.traiPhieu);
    }

    public static void inTinTuc(List<String> p) {
        for (int i = 0; i < 5; i++) {
            try {
                String s = p.get(i);
                System.out.println(s);
            }
            catch (Exception exception) {
                System.out.println("NOT FOUND!");
            }
        }
    }
}
