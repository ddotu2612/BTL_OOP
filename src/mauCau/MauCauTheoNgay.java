package mauCau;

public  class MauCauTheoNgay{
    public MauCauTheoNgay(){

    }
    private static String[] tangSoVoiBanDau = new String[]{
            "Chốt phiên cuối ngày, giá cổ phiếu |maCk| tăng từ |openValue| lên thành |closeValue| .",
            "Đóng cửa phiên cuối ngày, giá cổ phiếu |maCk| dừng lại ở mức |closeValue|, so với khi mở cửa phiên giao dịch tăng |thaydoi|.",
            "Chốt phiên giao dịch, ghi nhận giá cổ phiếu |maCk| đạt |closeValue|,tăng |thaydoi| so với khi mở cửa phiên giao dịch.",
            "Cổ phiếu |maCk| tại lúc đóng cửa phiên giao dịch đạt |closeValue|,ghi nhận tăng |thaydoi| so với thời điểm bắt đầu phiên giao dịch."
    };

    private static String[] bangSoVoiBanDau = new String[]{
            "Chốt phiên cuối ngày , giá cổ phiếu |maCk| đứng giá tại |openValue| .",
            "Đóng cửa phiên cuối ngày , giá cổ phiếu |maCk| dừng lại ở mức |closeValue|,không đổi so với khi mở cửa phiên giao dịch.",
            "Chốt phiên giao dịch, ghi nhận giá cổ phiếu |maCk| đạt |closeValue|,không đổi so với khi mở cửa phiên giao dịch.",
            "Cổ phiếu |maCk| tại lúc đóng cửa phiên giao dịch đạt |closeValue|,ghi nhận không đổi so với thời điểm bắt đầu phiên giao dịch."
    };

    private static String[] giamSoVoiBanDau = new String[]{
            "Chốt phiên cuối ngày , giá cổ phiếu |maCk| giảm từ |openValue| xuống thành |closeValue|.",
            "Đóng cửa phiên cuối ngày, giá cổ phiếu |maCk| dừng lại ở mức |closeValue|,so với khi mở cửa phiên giao dịch giảm |thaydoi|.",
            "Chốt phiên giao dịch ghi nhận giá cổ phiếu |maCk| đạt |closeValue|,giảm |thaydoi| so với khi mở cửa phiên giao dịch.",
            "Cổ phiếu |maCk| tại lúc đóng cửa phiên giao dịch chỉ đạt |closeValue|,ghi nhận giảm |thaydoi| so với thời điểm bắt đầu phiên giao dịch."
    };

    private static String[] giaoDichNhieu = new String[]{
            "Đóng cửa phiên giao dịch,các cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| được giao dịch nhiều nhất. Trong đó,đứng đầu là mã cổ phiếu |maCk0| với khối lượng giao dịch |volume0|",
            "Chốt phiên giao dịch, các cổ phiếu được nhà đầu tư giao dịch nhiều nhất là |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| Trong đó |maCk0| đang dẫn đầu xu thế thị trường với khối lượng giao dịch |volume0|",
            "kết thúc phiên giao dịch ,các cổ phiếu đang dẫn đầu xu thế thị trường là |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| "
    };

    private static String[] giaoDichIt = new String[]{
            "Đóng cửa phiên giao dịch,các cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| được giao dịch ít nhất. Trong đó,thấp nhất là mã cổ phiếu |maCk0| với khối lượng giao dịch |volume0|",
            "Chốt phiên giao dịch các cổ phiếu được nhà đầu tư giao dịch ít nhất là |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| Trong đó |maCk0| ít được các nhà đầu tư quan tâm nhất với khối lượng giao dịch |volume0|",
            "Kết thúc phiên giao dịch,các cổ phiếu ít được các nhà đầu tư quan tâm nhất là |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| "
    };

    private static String[] giaCaoDauNgay = new String[]{
            "Mở cửa phiên giao dịch,cổ phiếu có giá cao nhất là |maCk0| với giá |giaMoCua0|/1 cổ phiếu.",
            "Mở cửa phiên giao dịch, ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá cao nhất ",
            "Mở đầu phiên giao dịch, ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá cao nhất,trong đó đứng đầu là |maCk0| với giá |giaMoCua0|/1 cổ phiếu "
    };

    private static String[] giaCaoCuoiNgay = new String[]{
            "Kết thúc phiên giao dịch,cổ phiếu có giá cao nhất là |maCk0| với giá |closeValue0|/1 cổ phiếu.",
            "Đóng cửa phiên giao dịch, ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá cao nhất ",
            "Chốt phiên giao dịch, ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá cao nhất,trong đó đứng đầu là |maCk0| với giá |closeValue0|/1 cổ phiếu "
    };

    private static String[] giaThapDauNgay = new String[]{
            "Mở cửa phiên giao dịch,cổ phiếu có giá thấp nhất là |maCk0| với giá |giaMoCua0|/1 cổ phiếu.",
            "Mở cửa phiên giao dịch, ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá thấp nhất ",
            "Mở đầu phiên giao dịch, ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá thấp nhất,trong đó quan ngại nhất là |maCk0| với giá |giaMoCua0|/1 cổ phiếu "
    };

    private static String[] giaThapCuoiNgay = new String[]{
            "Kết thúc phiên giao dịch, cổ phiếu có giá thấp nhất là |maCk0| với giá |closeValue0|/1 cổ phiếu.",
            "Đóng cửa phiên giao dịch, ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá thấp nhất ",
            "Chốt phiên giao dịch, ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá thấp nhất,trong đó quan ngại nhất là |maCk0| với giá |closeValue0|/1 cổ phiếu "
    };

    private static String[] giaDauNgay = new String[]{
            "Mở cửa phiên giao dịch, ghi nhận cổ phiếu |maCk| có giá |openValue|/1 cổ phiếu",
            "Mở đầu phiên giao dịch, 1 cổ phiếu |maCk| có giá |openValue|",
            "Giá trị 1 cổ phiếu |maCk| là |openValue| tại thời điểm bắt đầu phiên giao dịch"
    };

    private static String[] giaCuoiNgay = new String[]{
            "Đóng cửa phiên giao dịch, ghi nhận cổ phiếu |maCk| có giá |closeValue|/1 cổ phiếu",
            "Chốt phiên giao dịch,1 cổ phiếu |maCk| có giá |closeValue|",
            "Giá trị 1 cổ phiếu |maCk| là |closeValue| tại thời điểm kết thúc phiên giao dịch"
    };

    private static String[] giaCaoNhat = new String[]{
            "Trong phiên giao dịch, ghi nhận từng có thời điểm giá cổ phiếu |maCk| đạt giá trị |highestValue|, cao nhất trong ngày",
            "Giá trị cao nhất của cổ phiếu |maCk| trong ngày là |highestValue|",
            "Cổ phiếu |maCk| đạt giá trị cao nhất là |highestValue| trong phiên giao dịch"
    };

    private static String[] giaThapNhat = new String[]{
            "Trong phiên giao dịch, ghi nhận từng có thời điểm giá cổ phiếu |maCk| đạt giá trị |lowestValue|, thấp nhất trong ngày",
            "Giá trị thấp nhất của cổ phiếu |maCk| trong ngày là |lowestValue|",
            "Cổ phiếu |maCk| đạt giá trị thấp nhất là |lowestValue| trong phiên giao dịch"
    };

    private static String[] khoiLuongGiaoDich = new String[]{
            "Trong toàn bộ phiên giao dịch,mã cổ phiếu |maCk| đạt khối lượng giao dịch |volume|",
            "Có tổng cộng |volume| lượt giao dịch cổ phiếu |maCk| trong phiên giao dịch"
    };

    private static String[] maOnDinh = new String[]{
            "Các mã cổ phiếu có độ ổn định cao nhất là |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| "
    };

    private static String[] maKhongOnDinh = new String[]{
            "Các mã cổ phiếu có độ ổn định thấp nhất là |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| "
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
    public static String[] getMaOnDinh() { return maOnDinh; }
    public static String[] getMaKhongOnDinh() { return maKhongOnDinh;}
    public static String[] getKhoiLuongGiaoDich() { return khoiLuongGiaoDich; }

}
