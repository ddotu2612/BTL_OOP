package sosanh.nhadautunuocngoai;

import cackieudulieu.NhaDauTuNuocNgoai;

import java.util.Comparator;

public class SoSanhKhoiLuongBan implements Comparator<NhaDauTuNuocNgoai> {
    @Override
    public int compare(NhaDauTuNuocNgoai o1, NhaDauTuNuocNgoai o2) {
        if(o1.getKhoiLuongBan() < o2.getKhoiLuongBan()) {
            return 1;
        }
        else if(o1.getKhoiLuongBan() == o2.getKhoiLuongBan()) {
            return 0;
        }
        else
            return -1;
    }
}
