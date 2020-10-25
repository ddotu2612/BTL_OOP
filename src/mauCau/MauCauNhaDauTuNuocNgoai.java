package mauCau;

//mẫu câu nhà đầu tư nước ngoài
public class MauCauNhaDauTuNuocNgoai {
    public static String [] tongKhoiLuongMua = {
            "Tổng Khối lượng mua ngày |Ngày| của sàn giao dịch |Sàn Giao Dịch| là |Tổng Khối Lượng Mua|",
            "Tổng khối lượng mua của sàn giao dịch |Sàn Giao Dịch| trong ngày |Ngày| là|Tổng Khối Lượng Mua|",
            "Ngày |Ngày| , Tổng Khối lượng mua trên sàn giao dịch |Sàn Giao Dịch| đạt |Tổng Khối Lượng Mua|"
    };

    public static String [] tongKhoiLuongBan = {
            "Tổng khối lượng bán ngày |Ngày| của sàn giao dịch |Sàn Giao Dịch| là |Tổng Khối Lượng Bán|",
            "Tổng khối lượng bán của sàn giao dịch |Sàn Giao Dịch| trong ngày |Ngày| là|Tổng Khối Lượng Bán|",
            "Ngày |Ngày| , tổng Khối lượng bán trên sàn giao dịch |Sàn Giao Dịch| đạt |Tổng Khối Lượng Bán|",
            "Trong ngày |Ngày| ,|Tổng Khối Lượng Bán| là tổng số lượng bán trên sàn |Sàn Giao Dịch|"
    };

    public static String [] coPhieuCoKhoiLuongMuaNhieuNhat = {
            "Cổ Phiếu |Mua Nhiều Nhất| được rao mua nhiều nhất trong ngày.Tổng sức mua là |Sức Mua Lớn Nhất| ",
            "Được Mua Với số lượng |Sức Mua Lớn Nhất|, Cổ Phiếu |Mua Nhiều Nhất| đạt kỷ lục về lượng bán",
            "|Mua Nhiều Nhất| là Cổ phiếu được mua nhiều nhất với số lượng là |Sức Mua Lớn Nhất|",
            "Các Nhà Đầu tư tranh nhau mua Cổ phiếu |Mua  Nhiều Nhất|, Khối lượng giao dịch đạt ngưỡng |Sức Mua Lớn Nhất|",
            "Cổ phiếu được mua nhiều nhất với số lượng |Sức Mua Lớn Nhất| chính là |Mua Nhiều Nhất|"
    } ;

    public static String [] coPhieuDuocMuaNhieuNhat = {
            "Cổ Phiếu |Mua Nhiều Nhất| được rao mua nhiều nhất trong ngày.Tổng sức mua là |Số Lượng Mua| ",
            "|Mua Nhiều Nhất| là Cổ phiếu được mua nhiều nhất với số lượng là |Số Lượng Mua|",
            "Được Mua Với số lượng |Số Lượng Mua|, Cổ Phiếu |Mua Nhiều Nhất| đạt kỷ lục về lượng bán",
            "Các Nhà Đầu tư tranh nhau mua Cổ phiếu |Mua Nhiều Nhất|, Khối lượng giao dịch đạt ngưỡng |Số Lượng Mua|",
    };

    public static String [] coPhieuDuocBanNhieuNhat = {
            "Với số lượng bán ròng |Số Lượng Bán|,|Bán Nhiều Nhất| là cổ phiếu được bán nhiều nhất trong ngày ",
            "Ngày Hôm nay, Cổ Phiếu được bán nhiều nhất là |Bán Nhiều Nhất|, với số lượng là |Số Lượng Bán|",
            "Khối lượng bán ròng đạt |Số Lượng Bán|,|Bán Nhiều Nhất| dẫn đầu về khối lượng bán ròng",
            "Khối Lượng bán ròng của |Bán Nhiều Nhất| đạt ngưỡng |Số Lượng Bán| đã tạo nên kỷ lục chưa từng có"
    };

    public static String [] coPhieuMuaRongNhieuNhat = {
            "|Mua Ròng Nhiều Nhất| được nhà đầu tư nước ngoài mua ròng hơn |Số Cổ Phiếu| cổ phiếu.",
            "Được mua ròng nhiều nhất là |Mua Ròng Nhiều Nhất| với số cổ phiếu |Số Cổ Phiếu| bởi nhà đầu tư nước ngoài",
            "Theo số liệu được thống kê với số cổ phiếu là |Số Cổ Phiếu| ,|Mua Ròng Nhiều Nhất| đã trở thành cổ phiếu được mua ròng nhiều nhất",
    };
    public static String [] coPhieuBanRongNhieuNhat = {
            //saysomethings
    };

    public static String[] getTongKhoiLuongMua() {
        return tongKhoiLuongMua;
    }

    public static String[] getTongKhoiLuongBan() {
        return tongKhoiLuongBan;
    }

    public static String[] getCoPhieuCoKhoiLuongMuaNhieuNhat() {
        return coPhieuCoKhoiLuongMuaNhieuNhat;
    }

    public static String[] getCoPhieuDuocMuaNhieuNhat() {
        return coPhieuDuocMuaNhieuNhat;
    }

    public static String[] getCoPhieuDuocBanNhieuNhat() {
        return coPhieuDuocBanNhieuNhat;
    }

    public static String[] getCoPhieuMuaRongNhieuNhat() {
        return coPhieuMuaRongNhieuNhat;
    }

    public static String[] getCoPhieuBanRongNhieuNhat() {
        return coPhieuBanRongNhieuNhat;
    }
}
