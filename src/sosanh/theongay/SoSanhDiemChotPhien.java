package sosanh.theongay;

import cacKieuDuLieu.TheoNgay;

import java.util.Comparator;

public class SoSanhDiemChotPhien implements Comparator <TheoNgay> {

    public int compare(TheoNgay o1, TheoNgay o2){
        return (Double.compare (o1.getGiaDongCua(), o2.getGiaDongCua()));

    }

}
