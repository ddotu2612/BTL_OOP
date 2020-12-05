package sosanh.nhadautunuocngoai;

import cackieudulieu.NhaDauTuNuocNgoai;

import java.util.Comparator;

public class SoSanhKhoiLuongMuaRong implements Comparator<NhaDauTuNuocNgoai> {
    @Override
    public int compare(NhaDauTuNuocNgoai o1, NhaDauTuNuocNgoai o2) {
        if(o1.getKhoiLuongRong() < o2.getKhoiLuongRong()) {
            return 1;
        }
        else if(o1.getKhoiLuongRong() == o2.getKhoiLuongRong()) {
            return 0;
        }
        else
            return -1;
    }
}
