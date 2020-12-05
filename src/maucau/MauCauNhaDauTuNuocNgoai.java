package maucau;

//mẫu câu nhà đầu tư nước ngoài
public class MauCauNhaDauTuNuocNgoai {
    static final String san = "|san|";
    static final String ma = "|MaCK|";
    static final String khoiLuongMua = "|khoiLuongMua|";
    static final String giaTriMua = "|giaTriMua|";
    static final String khoiLuongBan = "|khoiLuongBan|";
    static final String giaTriBan = "|giaTriBan|";
    static final String khoiLuongRong = "|khoiLuongRong|";
    static final String giaTriGiaoDichRong = "|giaTriGiaoDichRong|";
    static final String tongKhoiLuongMua = "|tongKhoiLuongMua|";
    static final String tongKhoiLuongBan = "|tongKhoiLuongBan|";
    static final String tongGiaTriMua = "|tongGiaTriMua|";
    static final String tongGiaTriBan = "|tongGiaTriBan|";
    static final String dangSoHuu = "|dangSoHuu|";

    public static String [] tongKhoiLuongMuaVao={
            "Tổng khối lượng mua ngày hôm nay của sàn giao dịch "+san+" là "+tongKhoiLuongMua+" cổ phiếu",
            "Ngày hôm nay, tổng khối lượng  mua trên sàn giao dịch "+san+"  đạt "+tongKhoiLuongMua+" cổ phiếu",
            "Các nhà đầu tư nước ngoài ghi dấu ấn mạnh với việc mua vào trong ngày với tổng khối lượng cổ phiếu đạt "+tongKhoiLuongMua+"",
    };

    public static String [] tongKhoiLuongBanRa={
            ""+tongKhoiLuongBan+" cổ phiếu là tổng khối lượng bán ra của sàn giao dịch "+san+" trong ngày hôm nay",
            "Trên sàn "+san+" , tổng khối lượng bán ra trong ngày hôm nay đạt "+tongKhoiLuongBan+" cổ phiếu",
            "Tại "+san+",khối ngoại hôm nay có tổng khối lượng bán ra lên tới "+tongKhoiLuongBan+"",
    };

    public static String [] tongGiaTriBanRa={
            ""+tongGiaTriBan+" là tổng giá trị bán ra của sàn giao dịch "+san+" trong ngày hôm nay",
            "Trên sàn "+san+" , tổng giá trị bán ra trong ngày hôm nay đạt "+tongGiaTriBan+"",
            "Theo thống kê của sàn chứng khoán "+san+",tổng giá trị bán ra trong ngày hôm nay đạt "+tongGiaTriBan+"",
            "Tính toàn thị trường trên sàn "+san+" ,tổng giá trị bán ra của các loại cổ phiếu lên tới "+tongGiaTriBan+"",
            "Các nhà đầu tư nước ngoài đã bán liên tiếp ,với tổng giá trị bán ra trong ngày hôm nay trên sàn "+san+" đạt "+tongGiaTriBan+"",

    };

    public static String [] tongGiaTriMuaVao={
            ""+tongGiaTriMua+" là tổng giá trị mua vào của sàn giao dịch "+san+" trong ngày hôm nay",
            "Trên sàn "+san+" , tổng giá tị mua vào của tất cả các cổ phiếu trong ngày hôm nay đạt "+tongGiaTriMua+"",
            "Tổng giá trị mua vào của nhà đầu tư nước ngoài trên sàn "+san+" ngày đạt hơn "+tongGiaTriMua+"",

    };
    public static String [] coPhieuCoKhoiLuongMuaNhieuNhat = {
           "Trên "+san+" Cổ phiếu "+ma+" được mua nhiều nhất trong ngày với tổng sức mua là "+khoiLuongMua+" cổ phiếu",
            ""+ma+" được mua nhiều nhất.Tổng sức mua là "+khoiLuongMua+"",
            "Với sức mua "+khoiLuongMua+","+ma+" đã trở thành cổ phiếu được mua nhiều nhất trong ngày tại sàn "+san+"",
            "Các nhà đầu tư tranh nhau mua cổ phiếu "+ma+",khối lượng giao dịch đạt ngưỡng "+khoiLuongMua+" cổ phiếu",
    } ;
    public static String [] coPhieuCoKhoiLuongBanNhieuNhat = {
            "Trong phiên giao dịch ngày hôm nay,"+ma+" là cổ phiếu có khối lượng bán ra nhiều nhất đạt "+khoiLuongBan+" cổ phiếu",
            "Tổng khối lượng bán ra là "+khoiLuongBan+",cổ phiếu "+ma+" trở thành cổ phiếu được bán ra với khối lượng nhiều nhất",
            "Cổ phiếu "+ma+" có khối lượng bán ra tăng vọt đạt "+khoiLuongBan+" trong ngày hôm nay trên sàn giao dịch "+san+"",
            "Bị bán nhiều nhất hôm nay là "+ma+" với khối lượng bán ròng là "+khoiLuongBan+"cổ phiếu",
    } ;

    public static String [] coPhieuMuaRongNhieuNhat = {
            "Ở sàn "+san+",cổ phiếu cạnh tranh được mua ròng nhiều nhất là "+ma+ "với tổng khối lượng là "+khoiLuongRong+"",
            "Trong ngày hôm nay, "+ma+" là cổ phiếu được mua ròng nhiều nhất với khối lượng giao dịch đạt ngưỡng "+khoiLuongRong+"",
            "Với khối lượng mua ròng nhiều nhất trên sàn "+san+" đạt "+khoiLuongRong+","+ma+" đã trở thành cổ phiếu được mua ròng nhiều nhất trong ngày hôm nay",
            ""+ma+" là cổ phiếu được khối ngoại mua ròng nhiều nhất trong ngày trên sàn "+san+" với "+khoiLuongRong+"",
    };
    public static String [] coPhieuCoGiaTriBanCaoNhat = {
            "Phía bán cổ phiếu, mã "+ma+" có lượng và giá bán áp đảo là "+khoiLuongBan+"-"+giaTriBan+"",
            "Giá trị bán đạt "+giaTriBan+","+ma+" đã trở thành cổ phiếu có giá trị bán cao nhất trong ngày hôm nay",
            "Được bán nhiều nhất hôm nay là "+ma+" với giá trị bánđạt ngưỡng "+giaTriBan+"",
            "Đứng thứ nhất về giá trị bán trên "+san+" là cổ phiếu "+ma+" với "+giaTriBan+"",
    };
    public static String [] coPhieuCoGiaTriMuaCaoNhat = {
            "Với "+khoiLuongMua+" cổ phiếu được mua ,"+ma+" chính cổ phiếu có giá trị mua cao nhất trong ngày đạt "+giaTriMua+" trên sàn "+san+"",
            ""+ma+" là cổ phiếu được mua vào mạnh nhất với giá trị mua khoảng "+giaTriMua+"",
            "Trên sàn "+san+","+ma+" là cổ phiếu có giá trị mua cao nhất trong ngày đạt ngưỡng "+giaTriMua+"",
            "Trong tất cả các cổ phiếu được mua trong ngày ở sàn "+san+" thì "+ma+" có giá trị mua cao nhất đạt "+giaTriMua+"",
    };
    public static String [] coPhieuCoGiaTriGiaoDichRongCaoNhat = {
            ""+ma+" đứng thứ nhất về giá trị giao dịch ròng của khối ngoại trên sàn "+san+" đạt "+giaTriGiaoDichRong+"",
            "Cổ phiếu "+ma+" tiếp tục dẫn đầu thị trường về giá trị giao dịch ròng, đạt "+giaTriGiaoDichRong+"",
            "Trong ngày hôm nay, cổ phiếu "+ma+" được khối ngoại quan tâm nhiều nhất,giá trị giao dịch ròng đạt "+giaTriGiaoDichRong+"",
            "Xét theo giá trị giao dịch ròng trong tuần,với "+giaTriGiaoDichRong+" "+ma+" đã trở thành cổ phiếu có giá trị giao dịch ròng cao nhất",
            "Tại sàn "+san+", cổ phiếu "+ma+" là cổ phiếu có giá trị giao dịch ròng cao nhất trong ngày hôm nay với "+giaTriGiaoDichRong+"",
    };
    public static String [] coPhieuCoGiaTriBanThapNhat = {
            "Kết thúc phiên giao dịch ngày hôm nay ,với giá trị bán ra chỉ đạt "+giaTriBan+" ,"+ma+" ghi nhận giá trị bán ra thấp nhất trong tất cả các cổ phiếu trên sàn "+san+"",
            "Với giá trị bán ra chỉ đạt "+giaTriBan+","+ma+" đã trở thành cổ phiếu có giá trị bán ra thấp nhất trong ngày hôm nay trên sàn "+san+"",
    };
    public static String [] coPhieuDuocSoHuuCaoNhat = {
            "Kết thúc phiên giao dịch ,"+ma+" là cổ phiếu có tỷ lệ sở hữu bởi nhà đầu tư nước ngoài cao nhất trên sàn "+san+" đạt "+dangSoHuu+" %",
            "Với tỷ lệ đang sở hữu của các nhà đầu tư nước ngoài lên tới "+dangSoHuu+" %,"+ma+" là cổ phiếu có tỷ lệ sở hữu cao nhất trên sàn "+san+"",
            "Trên sàn "+san+",cổ phiếu có tỷ lệ sở hữu bởi các nhà đầu tư nước ngoài cao nhất chính là "+ma+" với tỷ lệ sở hữu là "+dangSoHuu+" %",
    };

    public static String[] getTongKhoiLuongMuaVao() {
        return tongKhoiLuongMuaVao;
    }

    public static String[] getTongKhoiLuongBanRa() {
        return tongKhoiLuongBanRa;
    }

    public static String getSan() {
        return san;
    }

    public static String[] getTongGiaTriBanRa() {
        return tongGiaTriBanRa;
    }

    public static String[] getTongGiaTriMuaVao() {
        return tongGiaTriMuaVao;
    }

    public static String[] getCoPhieuCoKhoiLuongMuaNhieuNhat() {
        return coPhieuCoKhoiLuongMuaNhieuNhat;
    }

    public static String[] getCoPhieuCoKhoiLuongBanNhieuNhat() {
        return coPhieuCoKhoiLuongBanNhieuNhat;
    }

    public static String[] getCoPhieuMuaRongNhieuNhat() {
        return coPhieuMuaRongNhieuNhat;
    }

    public static String[] getCoPhieuCoGiaTriBanCaoNhat() {
        return coPhieuCoGiaTriBanCaoNhat;
    }

    public static String[] getCoPhieuCoGiaTriMuaCaoNhat() {
        return coPhieuCoGiaTriMuaCaoNhat;
    }

    public static String[] getCoPhieuCoGiaTriGiaoDichRongCaoNhat() {
        return coPhieuCoGiaTriGiaoDichRongCaoNhat;
    }

    public static String getMa() {
        return ma;
    }

    public static String[] getCoPhieuCoGiaTriBanThapNhat() {
        return coPhieuCoGiaTriBanThapNhat;
    }

    public static String[] getCoPhieuDuocSoHuuCaoNhat() {
        return coPhieuDuocSoHuuCaoNhat;
    }
}
