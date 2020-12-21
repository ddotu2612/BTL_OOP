package maucau;

public class MaucauBienDongChungKhoan {
    public static String[] giaoDichNhieuNhat = {
            "Đứng đầu về khối lượng giao dịch tháng qua là |ma1|, với |khoiLuong1| cổ phiếu, kế đến là |ma2|, |ma3|.",
            "Top 3 cổ phiếu đứng đầu về khối lượng giao dịch trong tháng qua: |ma1| dẫn đầu thị trường (|khoiLuong1| cổ phiếu), theo sau là  |ma2| (|khoiLuong2| cổ phiếu) và |ma3| (|khoiLuong3| cổ phiếu).",
    };

    public static String[] giaoDichItNhat = {
            "Ở chiều ngược lại, |ma1| là mã cổ phiếu chạm đáy xét về khối lượng giao dịch trong tháng vừa qua với |gia1|.",
            "Đứng cuối về khối lượng giao dịch trong một tháng trở lại đây là |ma1|, với |khoiLuong1| cổ phiếu, kế đến là |ma2|, |ma3|.",
            "|ma1| là mã cổ phiếu có khối lượng giao dịch ít nhất tháng vừa qua với |khoiLuong1| cổ phiếu, xếp ngay sau đó là |ma2| và |ma3|.",
    };

    public static String[] vonHoaLonNhat = {
            "Ba cổ phiếu có vốn hóa lớn nhất thị trường trong tháng vừa qua là |ma1|, |ma2| và |ma3| với giá trị lần lượt là |vonHoa1| , |vonHoa2| và |vonHoa3|  tỷ đồng.",
            "Trong 1 tháng trở lại đây, |ma1| là cổ phiếu có vốn hóa lớn nhất thị trường (|vonHoa1| tỷ đồng), theo sau đó là |ma2| (|vonHoa2| tỷ đồng) và |ma3| (|vonHoa3| tỷ đồng)."
    };

    public static String[] vonHoaNhoNhat = {
            "Ở chiều đối diện, |ma1| là mã có vốn hóa ở cuối bảng với |vonHoa1| tỷ đồng, xếp ngay trên là |ma2| với |vonHoa2| tỷ đồng và |ma3| với vốn hóa bằng |vonHoa3| tỷ đồng.",
            "Trong khi đó, |ma1|, |ma2| và |ma3| là ba cổ phiếu có vốn hóa thấp nhất với giá trị lần lượt là |vonHoa1|, |vonHoa2| và |vonHoa3| tỷ đồng."
    };

    public static String[] giaCaoNhat = {
            "|ma1| là mã cổ phiếu có giá cao nhất trong tháng vừa qua với |gia1| tỷ đồng, theo sau đó là |ma2| và |ma3| với giá lần lượt là |gia2| và |gia3| tỷ đồng.",
            "Đứng đầu bảng về giá là mã cổ phiếu |ma1| (|gia1| tỷ đồng), tiếp theo đó là |ma2| (|gia2| tỷ đồng) và |ma3| (|gia3| tỷ đồng).",
            "Top 3 mã cổ phiếu có giá cao nhất trong tháng qua lần lượt là |ma1|, |ma2| và |ma3| với giá lần lượt là |gia1|, |gia2| và |gia3| tỷ đồng."
    };

    public static String[] giaThapNhat = {
            "Ngược lại,ba mã cổ phiếu có giá thấp nhất trong tháng vừa qua lần lượt là |ma1| (|gia1| tỷ đồng) ,|ma2| (|gia2| tỷ đồng) và |ma3| (|gia3| tỷ đồng).",
            "Đứng cuối bảng về giá là mã |ma1|, nhỉnh hơn một chút là các mã |ma2|, |ma3|.",
            "Đứng áp chót bảng về giá là |ma1|, |ma2| và |ma3| với giá lần lượt là |gia1|, |gia2| và |gia3| tỷ đồng."
    };

    public static String[] giaTangNhieuNhat = {
            "Trong tháng qua, thị trường chứng khoán chứng kiến sự tăng trưởng mạnh mẽ về giá của mã cổ phiếu |ma1| với |giasvtt1|% .", //gia so voi thang truoc
            "Top 3 cổ phiếu có mức độ tăng trưởng về giá hàng đầu trong tháng qua là |ma1| (|giasvtt1|%), |ma2| (|giasvtt2|) và |ma3| (|giasvtt3|%).",
            "|ma1| tăng trưởng mạnh nhất tháng qua với |giasvtt1|%, theo ngay sau đó là |ma2| với |giasvtt2|% và |ma3| với |giasvtt3|%."
    };

    public static String[] giaGiamNhieuNhat = {
            "Bên cạnh đó, thị trường cũng chứng kiến sự tụt dốc của mã cổ phiếu |ma1| (|giasvtt1|%).",
            "Top 3 cổ phiếu có mức tăng trưởng về giá tệ nhất trong tháng qua là |ma1| (|giasvtt1|%), |ma2| (|giasvtt2|%) và |ma3| (|giasvtt3|%).",
            "Đứng cuối bảng xếp hạng mức tăng trưởng về giá là mã cổ phiếu |ma1| (|giasvtt1|%), xếp ngay trên là |ma2| (|giasvtt2|%) và |ma3| (|giasvtt3|%)."
    };

    public static String[] kLuongSoVoiTBLonNhat = {
            "Top 3 về khối lượng so với trung bình 1 tháng cao nhất là |ma1|, |ma2| và |ma3| với tỉ lệ lần lượt là gấp |klsvtbt1|, |klsvtbt2| và |klsvtbt3| lần.", // khối lượng so với trung bình tháng
            "Trong tháng qua, chứng kiến sự tăng trưởng mạnh mẽ về khối lượng so với trung bình 1 tháng trước của mã cổ phiếu |ma1| (gấp |klsvtbt1| lần)," +
                    " đứng ngay sau là |ma2| (gấp |klsvtbt2| lần) và |ma3| (gấp |klsvtbt3| lần)."
    };

    public static String[] kLuongSoVoiTBNhoNhat = {
            "Ngoài ra, thị trường cũng chứng kiến sự tụt giảm về khối lượng so với trung bình 1 tháng với các" +
                    " mã cổ phiếu đứng cuối bảng là |ma1| (giảm |klsvtbt1| lần), |ma2| (giảm |klsvtbt2| lần) và |ma3| (giảm |klsvtbt3| lần).",
            "Ngược lại, đứng cuối bảng xếp hạng về khối lượng so với trung bình tháng lần lượt là " +
                    "|ma1| (giảm |klsvtbt1| lần), |ma2| (giảm |klsvtbt2| lần) và |ma3| (giảm |klsvtbt3| lần)."
    };

    public static String[] getGiaoDichNhieuNhat() {
        return giaoDichNhieuNhat;
    }

    public static String[] getGiaoDichItNhat() {
        return giaoDichItNhat;
    }

    public static String[] getVonHoaLonNhat() {
        return vonHoaLonNhat;
    }

    public static String[] getVonHoaNhoNhat() {
        return vonHoaNhoNhat;
    }

    public static String[] getGiaCaoNhat() {
        return giaCaoNhat;
    }

    public static String[] getGiaThapNhat() {
        return giaThapNhat;
    }

    public static String[] getGiaTangNhieuNhat() {
        return giaTangNhieuNhat;
    }

    public static String[] getGiaGiamNhieuNhat() {
        return giaGiamNhieuNhat;
    }

    public static String[] getkLuongSoVoiTBLonNhat() {
        return kLuongSoVoiTBLonNhat;
    }

    public static String[] getkLuongSoVoiTBNhoNhat() {
        return kLuongSoVoiTBNhoNhat;
    }
}

