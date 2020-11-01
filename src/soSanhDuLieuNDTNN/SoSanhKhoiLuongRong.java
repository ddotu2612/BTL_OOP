package soSanhDuLieuNDTNN;

import cacKieuDuLieu.NhaDauTuNuocNgoai;

import java.util.Comparator;

public class SoSanhKhoiLuongRong implements Comparator <NhaDauTuNuocNgoai>{
    @Override
    public int compare(NhaDauTuNuocNgoai o1, NhaDauTuNuocNgoai o2) {
        return Long.compare(o1.getKhoiLuongRong(),o2.getKhoiLuongRong());
    }
}
