package soSanhDuLieuNDTNN;

import cacKieuDuLieu.NhaDauTuNuocNgoai;
import java.util.Comparator;

public class SoSanhKhoiLuongBan implements Comparator<NhaDauTuNuocNgoai> {

    @Override
    public int compare(NhaDauTuNuocNgoai o1, NhaDauTuNuocNgoai o2) {
        return Long.compare(o1.getKhoiLuongBan(),o2.getKhoiLuongBan());
    }
}
