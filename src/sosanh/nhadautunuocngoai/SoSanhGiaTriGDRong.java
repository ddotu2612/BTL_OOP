package sosanh.nhadautunuocngoai;

import cackieudulieu.NhaDauTuNuocNgoai;

import java.util.Comparator;

public class SoSanhGiaTriGDRong implements Comparator<NhaDauTuNuocNgoai> {
    @Override
    public int compare(NhaDauTuNuocNgoai o1, NhaDauTuNuocNgoai o2) {
        if(o1.getGiaTriGiaoDichRong() < o2.getGiaTriGiaoDichRong()) {
            return 1;
        }
        else if(o1.getGiaTriGiaoDichRong() == o2.getGiaTriGiaoDichRong()) {
            return 0;
        }
        else
            return -1;
    }
}
