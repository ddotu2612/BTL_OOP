package mauCau;

public class MaucauBienDongChungKhoan {
    public static String[] giaoDichNhieuNhat = {
            "Đứng đầu về khối lượng giao dịch tháng qua là |ma1|, với |khoiLuong1| cổ phiếu, kế đến là |ma2|, |ma3|.",
            "Top 3 cổ phiếu đứng đầu về khối lượng giao dịch trong tháng qua, |ma1| dẫn đầu thị trường (|khoiLuong1| cổ phiếu), theo sau là  |ma2| (|khoiLuong2| cổ phiếu) và |ma3| (|khoiLuong3| cổ phiếu)",
    };

    public static String[] giaoDichItNhat = {
            "Ở chiều ngược lại, |ma1| là mã cổ phiếu chạm đáy xét về khối lượng giao dịch trong tháng vừa qua với |gia1|.",
            "Đứng cuối về khối lượng giao dịch trong một tháng trở lại đây là |ma1|, với |khoiLuong1| cổ phiếu, kế đến là |ma2|, |ma3|. ",
            "|ma1| là mã cổ phiếu có khối lượng giao dịch ít nhất tháng vừa qua với |khoiLuong1| cổ phiếu, xếp ngay sau đó là |ma2| và |ma3|.",
    };

    public static String[] vonHoaLonNhat = {
            "Ba cổ phiếu có vốn hóa lớn nhất thị trường trong tháng vừa qua là |ma1|, |ma2| và |ma3| với giá trị lần lượt là |vonHoa1|, |vonHoa2| và |vonHoa3|  tỷ đồng.",
            "Trong 1 tháng trở lại đây, |ma1| là cổ phiếu có vốn hóa lớn nhất thị trường (|vonHoa1| tỷ đồng), theo sau đó là |ma2| (|vonHoa2| tỷ đồng) và |ma3| (|vonHoa3| tỷ đồng)."
    };

    public static String[] vonHoaNhoNhat = {
            "Ở chiều đối diện, |ma1| là mã có vốn hóa ở cuối bảng với |vonHoa1| tỷ đồng, xếp ngay trên là |ma2| với |vonHoa2| tỷ đồng.",
            "Trong khi đó, |ma1|, |ma2| là hai cổ phiếu có vốn hóa thấp nhất với giá trị lần lượt là |vonHoa1| và |vonHoa2| tỷ đồng."
    };

    public static String[] giaCaoNhat = {
            "|ma1| là mã cổ phiếu có giá cao nhất trong tháng vừa qua, theo sau đó là |ma2| và |ma3|.",
            "Đứng đầu bảng về giá là mã cổ phiếu |ma1|, tiếp theo đó là |ma2| và |ma3|.",
            "Top 3 mã cổ phiếu có giá cao nhất trong tháng qua lần lượt là |ma1|, |ma2| và |ma3|."
    };

    public static String[] giaThapNhat = {
            "Ba mã cổ phiếu có giá thấp nhất trong tháng vừa qua lần lượt là |ma1| ,|ma2| và |ma3|.",
            "Đứng cuối bảng về giá là mã |ma1|, nhỉnh hơn một chút là các mã |ma2|, |ma3|.",
            "|ma1| là mã cổ phiếu có giá đứng áp chót bảng."
    };

    public static String[] tangNhieuNhat = {
            "Trong tháng qua, thị trường chứng khoán chứng kiến sự tăng trưởng mạnh mẽ của mã cổ phiếu |ma1| .",
            "Top 3 cổ phiếu có mức độ tăng trưởng về giá hàng đầu trong tháng qua là |ma1|, |ma2| và |ma3|.",
            "|ma1| tăng trưởng mạnh nhất tháng qua, theo ngay sau đó là |ma2|, |ma3|."
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

    public static String[] getTangNhieuNhat() {
        return tangNhieuNhat;
    }
}

