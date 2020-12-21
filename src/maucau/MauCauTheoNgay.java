package maucau;

public  class MauCauTheoNgay{
    public MauCauTheoNgay(){

    }
    private static String[] tangSoVoiBanDau = new String[]{
            "Chốt phiên cuối ngày, giá cổ phiếu |maCk| tăng từ |giaMoCua| lên thành |giaDongCua| .",
            "Đóng cửa phiên cuối ngày, giá cổ phiếu |maCk| dừng lại ở mức |giaDongCua|, so với khi mở cửa phiên giao dịch tăng |thaydoi|.",
            "Chốt phiên giao dịch, ghi nhận giá cổ phiếu |maCk| đạt |giaDongCua|,tăng |thaydoi| so với khi mở cửa phiên giao dịch.",
            "Cổ phiếu |maCk| tại lúc đóng cửa phiên giao dịch đạt |giaDongCua|,ghi nhận tăng |thaydoi| so với thời điểm bắt đầu phiên giao dịch."
    };
    private static String[] bangSoVoiBanDau = new String[]{
            "Chốt phiên cuối ngày , giá cổ phiếu |maCk| đứng giá tại |giaMoCua| .",
            "Đóng cửa phiên cuối ngày , giá cổ phiếu |maCk| dừng lại ở mức |giaMoCua|,không đổi so với khi mở cửa phiên giao dịch.",
            "Chốt phiên giao dịch, ghi nhận giá cổ phiếu |maCk| đạt |giaDongCua|,không đổi so với khi mở cửa phiên giao dịch.",
            "Cổ phiếu |maCk| tại lúc đóng cửa phiên giao dịch đạt |giaDongCua|,ghi nhận không đổi so với thời điểm bắt đầu phiên giao dịch."
    };

    private static String[] giamSoVoiBanDau = new String[]{
            "Chốt phiên cuối ngày , giá cổ phiếu |maCk| giảm từ |giaMoCua| xuống thành |giaDongCua|.",
            "Đóng cửa phiên cuối ngày, giá cổ phiếu |maCk| dừng lại ở mức |giaDongCua|,so với khi mở cửa phiên giao dịch giảm |thaydoi|.",
            "Chốt phiên giao dịch ghi nhận giá cổ phiếu |maCk| đạt |giaDongCua|,giảm |thaydoi| so với khi mở cửa phiên giao dịch.",
            "Cổ phiếu |maCk| tại lúc đóng cửa phiên giao dịch chỉ đạt |giaDongCua|,ghi nhận giảm |thaydoi| so với thời điểm bắt đầu phiên giao dịch."
    };

    private static String[] giaoDichNhieu = new String[]{
            "Đóng cửa phiên giao dịch,các cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| được giao dịch nhiều nhất. Trong đó,đứng đầu là mã cổ phiếu |maCk0| với khối lượng giao dịch |klgd0|",
            "Chốt phiên giao dịch, các cổ phiếu được nhà đầu tư giao dịch nhiều nhất là |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| Trong đó |maCk0| đang dẫn đầu xu thế thị trường với khối lượng giao dịch |klgd0|",
            "kết thúc phiên giao dịch ,các cổ phiếu đang dẫn đầu xu thế thị trường là |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| "
    };

    private static String[] giaoDichIt = new String[]{
            "Đóng cửa phiên giao dịch,các cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| được giao dịch ít nhất. Trong đó,thấp nhất là mã cổ phiếu |maCk0| với khối lượng giao dịch |klgd0|",
            "Chốt phiên giao dịch các cổ phiếu được nhà đầu tư giao dịch ít nhất là |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| Trong đó |maCk0| ít được các nhà đầu tư quan tâm nhất với khối lượng giao dịch |klgd0|",
            "Kết thúc phiên giao dịch,các cổ phiếu ít được các nhà đầu tư quan tâm nhất là |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| "
    };

    private static String[] giaCaoDauNgay = new String[]{
            "Mở cửa phiên giao dịch,cổ phiếu có giá cao nhất là |maCk0| với giá |giaMoCua0|/1 cổ phiếu.",
            "Mở cửa phiên giao dịch, ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá cao nhất ",
            "Mở đầu phiên giao dịch, ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá cao nhất,trong đó đứng đầu là |maCk0| với giá |giaMoCua0|/1 cổ phiếu "
    };

    private static String[] giaCaoCuoiNgay = new String[]{
            "Kết thúc phiên giao dịch,cổ phiếu có giá cao nhất là |maCk0| với giá |giaDongCua0|/1 cổ phiếu.",
            "Đóng cửa phiên giao dịch, ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá cao nhất ",
            "Chốt phiên giao dịch, ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá cao nhất,trong đó đứng đầu là |maCk0| với giá |giaDongCua0|/1 cổ phiếu "
    };

    private static String[] giaThapDauNgay = new String[]{
            "Mở cửa phiên giao dịch,cổ phiếu có giá thấp nhất là |maCk0| với giá |giaMoCua0|/1 cổ phiếu.",
            "Mở cửa phiên giao dịch, ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá thấp nhất ",
            "Mở đầu phiên giao dịch, ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá thấp nhất,trong đó quan ngại nhất là |maCk0| với giá |giaMoCua0|/1 cổ phiếu "
    };

    private static String[] giaThapCuoiNgay = new String[]{
            "Kết thúc phiên giao dịch, cổ phiếu có giá thấp nhất là |maCk0| với giá |giaDongCua0|/1 cổ phiếu.",
            "Đóng cửa phiên giao dịch, ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá thấp nhất ",
            "Chốt phiên giao dịch, ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá thấp nhất,trong đó quan ngại nhất là |maCk0| với giá |giaDongCua0|/1 cổ phiếu "
    };

    private static String[] giaDauNgay = new String[]{
            "Mở cửa phiên giao dịch, ghi nhận cổ phiếu |maCk| có giá |giaDongCua|/1 cổ phiếu",
            "Mở đầu phiên giao dịch, 1 cổ phiếu |maCk| có giá |giaMoCua|",
            "Giá trị 1 cổ phiếu |maCk| là |giaMoCua| tại thời điểm bắt đầu phiên giao dịch"
    };

    private static String[] giaCuoiNgay = new String[]{
            "Đóng cửa phiên giao dịch, ghi nhận cổ phiếu |maCk| có giá |giaDongCua|/1 cổ phiếu",
            "Chốt phiên giao dịch,1 cổ phiếu |maCk| có giá |giaDongCua|",
            "Giá trị 1 cổ phiếu |maCk| là |giaDongCua| tại thời điểm kết thúc phiên giao dịch"
    };

    private static String[] giaCaoNhat = new String[]{
            "Trong phiên giao dịch, ghi nhận từng có thời điểm giá cổ phiếu |maCk| đạt giá trị |giaCaoNhat|, cao nhất trong ngày",
            "Giá trị cao nhất của cổ phiếu |maCk| trong ngày là |giaCaoNhat|",
            "Cổ phiếu |maCk| đạt giá trị cao nhất là |giaCaoNhat| trong phiên giao dịch"
    };

    private static String[] giaThapNhat = new String[]{
            "Trong phiên giao dịch, ghi nhận từng có thời điểm giá cổ phiếu |maCk| đạt giá trị |giaThapNhat|, thấp nhất trong ngày",
            "Giá trị thấp nhất của cổ phiếu |maCk| trong ngày là |giaThapNhat|",
            "Cổ phiếu |maCk| đạt giá trị thấp nhất là |giaThapNhat| trong phiên giao dịch"
    };

    private static String[] khoiLuongGiaoDichKhopLenh = new String[]{
            "Trong toàn bộ phiên giao dịch,mã cổ phiếu |maCk| đạt khối lượng giao dịch |klgd|",
            "Có tổng cộng |klgd| lượt giao dịch cổ phiếu |maCk| trong phiên giao dịch"
    };


    private static String[] giaTriGiaoDichThoaThuan = new String[]{
            "Kết thúc phiên giao dịch, mã cổ phiếu |maCk| được giao dịch thỏa thuận tổng cộng |gtgdThoaThuan|.",
            "Chốt phiên giao dịch, ghi nhận mã cổ phiếu |maCk| đã có tổng cộng |gtgdThoaThuan| được thỏa thuận giao dịch",
            "Kết thúc phiên giao dịch, các nhà đầu tư đã thỏa thuận giá trị tộng cộng |gtgdThoaThuan| cho mã cổ phiếu |maCk|"
    };

    private static String[] giaTriGiaoDichKhopLenh = new String[]{
            "Kết thúc phiên giao dịch, mã cổ phiếu |maCk| được khớp lệnh với giá trị tổng cộng |gtgdKhopLenh|",
            "Chốt phiên giao dịch, ghi nhận mã cổ phiếu |maCk| có tổng cộng |gtgdKhopLenh| được khớp lệnh",
            "Kết thúc phiên giao dịch, tổng cộng có |gtgdKhopLenh| đã được khớp lệnh cho mã cổ phiểu |maCk|"
    };

    public static String[] getTangSoVoiBanDau() { return tangSoVoiBanDau; }
    public static String[] getBangSoVoiBanDau() { return bangSoVoiBanDau; }
    public static String[] getGiamSoVoiBanDau() { return giamSoVoiBanDau; }
    public static String[] getGiaoDichNhieu() { return giaoDichNhieu; }
    public static String[] getGiaoDichIt() { return giaoDichIt; }
    public static String[] getGiaCaoDauNgay() { return giaCaoDauNgay; }
    public static String[] getGiaThapDauNgay() { return giaThapDauNgay; }
    public static String[] getGiaCaoCuoiNgay() { return giaCaoCuoiNgay; }
    public static String[] getGiaThapCuoiNgay() { return giaThapCuoiNgay; }
    public static String[] getGiaDauNgay() { return giaDauNgay; }
    public static String[] getGiaCuoiNgay() { return giaCuoiNgay; }
    public static String[] getGiaCaoNhat() { return giaCaoNhat; }
    public static String[] getGiaThapNhat() { return giaThapNhat; }
    public static String[] getKhoiLuongGiaoDichKhopLenh() { return khoiLuongGiaoDichKhopLenh; }
    public static String[] getGiaTriGiaoDichThoaThuan() { return giaTriGiaoDichThoaThuan; }
    public static String[] getGiaTriGiaoDichKhopLenh() { return giaTriGiaoDichKhopLenh; }


}
