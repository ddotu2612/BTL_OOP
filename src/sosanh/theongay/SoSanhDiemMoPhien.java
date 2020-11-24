package sosanh.theongay;

import cacKieuDuLieu.TheoNgay;

import java.util.Comparator;


    public class SoSanhDiemMoPhien implements Comparator<TheoNgay> {

        @Override
        public int compare(TheoNgay o1, TheoNgay o2) {
            // Sap xep theo diem mo phien
            return Double.compare(o1.getGiaMoCua(), o2.getGiaMoCua());
        }
}


