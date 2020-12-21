package sosanh.theongay;

import cackieudulieu.ChungKhoanTheoNgay;

import java.util.Comparator;

public class SoSanhDiemChotPhien implements Comparator <ChungKhoanTheoNgay> {

    public int compare(ChungKhoanTheoNgay o1, ChungKhoanTheoNgay o2){
        return (Double.compare (o1.getGiaDongCua(), o2.getGiaDongCua()));

    }

}
