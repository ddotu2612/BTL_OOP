package sosanh.nhadautunuocngoai;

import cackieudulieu.NhaDauTuNuocNgoai;

import java.util.Comparator;

public class SoSanhKhoiLuongMuaVao implements Comparator <NhaDauTuNuocNgoai> {
    @Override
    public int compare(NhaDauTuNuocNgoai o1, NhaDauTuNuocNgoai o2) {
        if(o1.getKhoiLuongMua() < o2.getKhoiLuongMua()) {
            return 1;
        }
        else if(o1.getKhoiLuongMua() == o2.getKhoiLuongMua()) {
            return 0;
        }
        else
            return -1;
    }
}


