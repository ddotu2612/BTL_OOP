package sinhCau;

import cacKieuDuLieu.TheoNgay;
import mauCau.MauCauTheoNgay;
import sinhCau.AbstractSinhCau;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class SinhCauTheoNgay extends AbstractSinhCau {
    public SinhCauTheoNgay() {

    }
    public List<TheoNgay> datalist = new ArrayList<>();
    public static List<String> cau = new ArrayList<>();

    public String sinhCauNgauNhien(String [] cau) {
        Random rd = new Random();
        return cau[rd.nextInt(cau.length)];
    }

    // Thay the cac key word va du lieu trong cau bang cac thuoc tinh cua data
    public String chenDuLieu(String cau, TheoNgay data) {

        cau = cau.replace("|maCk|", data.getMaCk());
        cau = cau.replace("|giaMoCua|", Double.toString(data.getGiaMoCua()) + " đồng");
        cau = cau.replace("|closeValue|", Double.toString(data.getGiaDongCua()) + " đồng");
        cau = cau.replace("|giaCaoNhat|", Double.toString(data.getGiaCaoNhat()) + " đồng");
        cau = cau.replace("|lowestValue|", Double.toString(data.getGiaThapNhat()) + " đồng");
        cau = cau.replace("|thaydoi|", Double.toString(Math.abs(data.getThaydoi())) + " đồng");

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
    public String khoiLuongGiaodich(TheoNgay data) {
        return chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getKhoiLuongGiaoDich()), data);
    }

    //Sinh cau theo nhieu ma
    public String giaCaoThapDauPhien(List<TheoNgay> datalist) {
        String cau1, cau2;
        datalist.sort(new SoSanhDiemMoPhien());
        cau1 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaThapDauNgay()), datalist);
        Collections.reverse(datalist);
        cau2 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaCaoDauNgay()), datalist);
        return cau1 + "\n" + cau2;
    }

    public String giaCaoThapChotPhien(List<TheoNgay> datalist) {
        String sentence1,sentence2;
        datalist.sort(new SoSanhDiemChotPhien());
        sentence1 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaThapCuoiNgay()), datalist);
        Collections.reverse(datalist);
        sentence2 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaCaoCuoiNgay()), datalist);
        return sentence1 + "\n" + sentence2;
    }

    public String sapXepKhoiLuongGiaoDich(List<TheoNgay> datalist) {
        String sentence1,sentence2;
        datalist.sort(new SoSanhKhoiLuongGiaoDich());
        sentence1 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaoDichIt()), datalist);
        Collections.reverse(datalist);
        sentence2 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaoDichNhieu()), datalist);
        return sentence1 + "\n" + sentence2;
    }



    public List<String> sinhDoanVan() {
//		List<String> cau = new ArrayList<>();
        Random rd = new Random();
        int i = rd.nextInt(datalist.size());
        cau.add("Tin về sàn giao dịch " + datalist.get(i).getMaCk() +" :");
        cau.add(giaDauNgay(datalist.get(i)));
        cau.add(giaCuoiNgay(datalist.get(i)));
        cau.add(soVoiDauPhien(datalist.get(i)));
        cau.add(giaCaoNhat(datalist.get(i)));
        cau.add(giaThapNhat(datalist.get(i)));
        cau.add(khoiLuongGiaodich(datalist.get(i)));
        cau.add(giaCaoThapDauPhien(datalist));
        cau.add(giaCaoThapChotPhien(datalist));
        cau.add(sapXepKhoiLuongGiaoDich(datalist));
        return cau;
    }
}