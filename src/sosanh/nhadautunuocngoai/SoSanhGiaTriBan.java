package sosanh.nhadautunuocngoai;

import cackieudulieu.NhaDauTuNuocNgoai;

import java.util.Comparator;

public class SoSanhGiaTriBan implements Comparator<NhaDauTuNuocNgoai> {
    @Override
    public int compare(NhaDauTuNuocNgoai o1, NhaDauTuNuocNgoai o2) {
        if(o1.getGiaTriBan() < o2.getGiaTriBan()) {
            return 1;
        }
        else if(o1.getGiaTriBan() == o2.getGiaTriBan()) {
            return 0;
        }
        else
            return -1;
    }
}
