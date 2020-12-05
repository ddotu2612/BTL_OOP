package sosanh.nhadautunuocngoai;

import cackieudulieu.NhaDauTuNuocNgoai;

import java.util.Comparator;

public class SoSanhTyLeSoHuu implements Comparator<NhaDauTuNuocNgoai> {

    @Override
    public int compare(NhaDauTuNuocNgoai o1, NhaDauTuNuocNgoai o2) {
        if(o1.getDangSoHuu() < o2.getDangSoHuu()) {
            return 1;
        }
        else if(o1.getDangSoHuu() == o2.getDangSoHuu()) {
            return 0;
        }
        else
            return -1;
    }
}
