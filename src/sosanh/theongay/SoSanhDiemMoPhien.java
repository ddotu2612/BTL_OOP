package sosanh.theongay;

import cackieudulieu.ChungKhoanTheoNgay;

import java.util.Comparator;


    public class SoSanhDiemMoPhien implements Comparator<ChungKhoanTheoNgay> {

        @Override
        public int compare(ChungKhoanTheoNgay o1, ChungKhoanTheoNgay o2) {
            // Sap xep theo diem mo phien
            return Double.compare(o1.getGiaMoCua(), o2.getGiaMoCua());
        }
}


