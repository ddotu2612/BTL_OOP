package maucau;

public class MauCauChiSoIndex {
	static final String ngay = "|ngay|";
	static final String maCK = "|maCK|";
	static final String thayDoi = "|thayDoi|";
	static final String giaDongCua = "|giaDongCua|";
	static final String giaTriThayDoi = "|giaTriThayDoi|";
	static final String klgdThoaThuan = "|klgdThoaThuan|";
	static final String gtgdThoaThuan = "|gtgdThoaThuan|";
	static final String giaMoCua = "|giaMoCua|";
	static final String gtgdKhopLenh = "|gtgdKhopLenh|";
	static final String klgdKhopLenh = "|klgdKhopLenh|";
	static final String Date0 = "|Date0|";
	static final String Date1 = "|Date1|";
	static final String Date2 = "|Date2|";
	static final String DateX = "|DateX|";
	static final String Sum = "|Sum|";
	static final String CloseValue1 = "|CloseValue1|";
	static final String CloseValue2 = "|CloseValue2|";

	public static String[] ChotPhienGiaoDichTang = {"Chốt phiên ngày "+ ngay +", chỉ số " + maCK + " " +thayDoi+ ", lên thành " +giaDongCua+ " điểm.",
			"Kết thúc phiên ngày " +ngay+ ", chỉ số " + maCK + " tăng và dừng lại ở mức " +giaDongCua+ " điểm, " +thayDoi+ " so với phiên ngày trước đó.",
			"Phiên giao dịch ngày " +ngay+ " ghi nhận chỉ số " + maCK + " đạt " +giaDongCua+ " điểm, " +thayDoi+ " so với phiên trước đó.",
			"Chỉ số " + maCK + " tại lúc đóng cửa phiên giao dịch ngày " +ngay+ " đạt " +giaDongCua+ " điểm, ghi nhận " +thayDoi+ " so với ngày trước đó.",
			"Chỉ số " + maCK + " tại giờ đóng cửa giao dịch đạt " +giaDongCua+ " điểm, " +thayDoi+ " so với phiên trước.",
			"Chốt phiên giao dịch ngày " +ngay+ ", " + maCK + " tăng " +giaTriThayDoi+ " điểm , lên " +giaDongCua+ " điểm, chuyển nhượng " +klgdThoaThuan+ " " +
					"triệu cổ phiếu, tương đương " +gtgdThoaThuan+ " tỷ đồng."};
	public static String[] ChotPhienGiaoDichGiam = {"Chốt phiên ngày " +ngay+ ", chỉ số " + maCK + " " +thayDoi+ ", xuống còn " +giaDongCua+ " điểm.",
			"Đóng cửa phiên ngày " +ngay+ ", chỉ số " + maCK + " giảm và dừng lại ở mức " +giaDongCua+ " điểm, " +thayDoi+ " so với phiên ngày trước đó.",
			"Phiên giao dịch ngày " +ngay+ " ghi nhận chỉ số " + maCK + " còn " +giaDongCua+ " điểm, " +thayDoi+ " so với phiên trước đó.",
			"Chỉ số " + maCK + " tại lúc đóng cửa phiên giao dịch ngày " +ngay+ " đạt " +giaDongCua+ " điểm, ghi nhận " +thayDoi+ " so với ngày trước đó.",
			"Chỉ số " + maCK + " tại giờ đóng cửa giao dịch đạt " +giaDongCua+ " điểm, " +thayDoi+ " so với phiên trước.",
			"Chốt phiên giao dịch ngày " +ngay+ ", " + maCK + " giảm " +giaTriThayDoi+ " điểm , lên " +giaDongCua+ " điểm, chuyển nhượng " +klgdThoaThuan+ " triệu cổ phiếu, tương đương " +gtgdThoaThuan+ " tỷ đồng."};
	public static String[] KhoiSacDauPhienGiam = {"Bất chấp những khởi sắc đầu phiên giao dịch, cuối ngày " +ngay+ ", " + maCK + " giảm xuống còn " +giaDongCua+ ", " +thayDoi+ " so với phiên trước đó.",
			"Mặc dù có những dấu hiệu khởi sắc đầu phiên, cuối ngày " +ngay+ ", " + maCK + " giảm xuống còn " +giaDongCua+ ", " +thayDoi+ " so với phiên trước đó.",
			"Có dấu hiệu của sự hồi phục đầu phiên giao dịch, song chốt phiên ngày " +ngay+ ", " + maCK + " giảm xuống còn " +giaDongCua+ ", " +thayDoi+ " so với phiên trước đó."};
	public static String[] KhoiSacDauPhienTang = {"Tiếp nối những sắc xanh từ đầu phiên giao dịch, cuối ngày " +ngay+ ", " + maCK + " vươn lên, chạm mốc " +giaDongCua+ " điểm.",
			"Phiên giao dịch " +ngay+ " chứng kiến những thay đổi tích cực đối với chỉ số " + maCK + ", theo đà đó, chốt phiên giao dịch, " + maCK + " vươn lên, chạm mốc " +giaDongCua+ " điểm."};
	public static String[] GiamDauPhienGiam = {"Đầu phiên giao dịch ngày " +ngay+ " chứng kiến dấu hiệu giảm của chỉ số " + maCK + ", theo đó, đóng cửa phiên, chỉ số " + maCK + " giảm xuống còn " +giaDongCua+ " điểm.",
			"Chỉ số " + maCK + " đã cho thấy những dấu hiệu tiêu cực ngay từ đầu phiên, kết thúc phiên giao dịch ngày " +ngay+ ", chỉ số " + maCK + " tụt xuống còn " +giaDongCua+ " điểm."};
	public static String[] GiamDauPhienTang = {"Mặc dù khởi đầu trong không khí ảm đạm, chốt phiên giao dịch ngày " +ngay+ ", chỉ số " + maCK + " tăng đến " +giaDongCua+ " điểm.",
			"Với khởi đầu phiên không mấy khả quan với giá mở cửa " +giaMoCua+ " ,kết thúc phiên giao dich ngày " +ngay+ " , mã " + maCK + " tăng lên tới " +giaDongCua+ ""};
	public static String[] GiaoDichKhopLenh = {"Phiên giao dịch ngày " +ngay+ " ghi nhận trên " +klgdKhopLenh+ " triệu giao dịch khớp lệnh, tổng giá trị lên tới hơn " +gtgdKhopLenh+ " tỷ đồng.",
			"Đã có tổng cộng hơn " +klgdKhopLenh+ " triệu giao dịch khớp lệnh với tổng giá trị đạt trên " +gtgdKhopLenh+ " tỷ đồng trong phiên giao dịch ngày " +ngay+ "."};
	public static String[] GiaoDichThoaThuan = {"Phiên giao dịch ngày " +ngay+ " ghi nhận hơn " +klgdThoaThuan+ " triệu giao dịch thỏa thuận, tổng giá trị lên tới trên " +gtgdThoaThuan+ " tỷ đồng.",
			"Đã có tổng cộng trên " +klgdThoaThuan+ " triệu giao dịch thỏa thuận với tổng giá trị đạt hơn " +gtgdThoaThuan+ " tỷ đồng trong phiên giao dịch ngày " +ngay+ "."};
	public static String[] TangManh = {"So với phiên trước đó, chỉ số " + maCK + " trong phiên giao dịch này tăng mạnh (" +giaTriThayDoi+ " điểm).",
			"Trong phiên giao dịch này ghi nhận chỉ số " + maCK + " tăng mạnh so với phiên trước đó với mức tăng " +giaTriThayDoi+ " điểm."};
	public static String[] TangNhe = {"So với phiên giao dịch trước đó, chỉ số " + maCK + " chỉ tăng nhẹ với mức " +thayDoi+ "."};
	public static String[] GiamManh ={"Trong phiên giao dịch này ghi nhận chỉ số " + maCK + " giảm sâu so với phiên trước đó với mức giảm " +giaTriThayDoi+ " điểm."};
	public static String[] GiamNhe = {"So với phiên giao dịch trước đó, chỉ số " + maCK + " chỉ giảm nhẹ với mức " +thayDoi+ "."};
	public static String[] TangLienTuc ={"Chỉ số " + maCK + " cho thấy những dấu hiệu tích cực khi tăng liên tục từ ngày " + Date1 + " đến ngày " + Date2 + ", tổng giá trị tăng lên tới " + Sum + " điểm.",
			"Trong các phiên giao dịch liên tiếp kể từ ngày " + Date1 + " đến " + Date2 + " chỉ số " + maCK + " liên tục tăng từ " + CloseValue1 + " đến " + CloseValue2 + " điểm.",
			"" + maCK + " liên tục tăng từ ngày " + Date1 + " đến " + Date2 + " với mức tăng tương ứng là " + Sum + " điểm."};
	public static String[] GiamLienTuc = {"Chỉ số " + maCK + " cho thấy những dấu hiệu tích cực khi giảm liên tục từ ngày " + Date1 + " đến ngày " + Date2 + ", tổng giá trị giảm lên tới " + Sum + " điểm.",
			"Trong các phiên giao dịch liên tiếp kể từ ngày " + Date1 + " đến " + Date2 + " chỉ số " + maCK + " liên tục giảm từ " + CloseValue1 + " đến " + CloseValue2 + " điểm.",
			"" + maCK + " liên tục tăng từ ngày " + Date1 + " đến " + Date2 + " với mức giảm tương ứng là " + Sum + " điểm."};
	public static String[] GiaCaoNhat = {"Trong khoảng thời gian trên, chỉ số " + maCK + " đạt đỉnh tại mức " +giaDongCua+ " điểm tại ngày " +ngay+ ".",
			"Chỉ số " + maCK + " trong khoảng thời gian trên chạm tới mốc cao nhất (" +giaDongCua+ " điểm) vào ngày " +ngay+ "."};
	public static String[] GiaThapNhat = {"Ngày " +ngay+ " ghi nhận chỉ số " + maCK + " chạm đáy ở " +giaDongCua+ " điểm trong khoảng thời gian trên.",
			"Trong khoảng thời gian trên, chỉ số " + maCK + " giảm xuống mức sâu nhất tại " +giaDongCua+ " điểm tại ngày " +ngay+ "."};
	public static String[] PhienTangManhNhat = {"Phiên giao dịch ngày " +ngay+ " ghi nhận chỉ số " + maCK + " tăng mạnh nhất (" +giaTriThayDoi+ " điểm) so với các phiên giao dịch ngay trước đó trong khoảng thời gian từ ngày " + Date0 + " đến ngày " + DateX + ".",};
	public static String[] PhienGiamManhNhat = {"Khoảng thời gian từ ngày " + Date0 + " đến " + DateX + " ghi nhận " + maCK + " giảm mạnh nhất (" +giaTriThayDoi+ " điểm) so với các phiên giao dịch trước đó vào ngày " +ngay+ "."};

	public static String[] getChotPhienGiaoDichTang() {
		return ChotPhienGiaoDichTang;
	}

	public static String[] getChotPhienGiaoDichGiam() {
		return ChotPhienGiaoDichGiam;
	}

	public static String[] getKhoiSacDauPhienGiam() {
		return KhoiSacDauPhienGiam;
	}

	public static String[] getKhoiSacDauPhienTang() {
		return KhoiSacDauPhienTang;
	}

	public static String[] getGiamDauPhienGiam() {
		return GiamDauPhienGiam;
	}

	public static String[] getGiamDauPhienTang() {
		return GiamDauPhienTang;
	}

	public static String[] getGiaoDichKhopLenh() {
		return GiaoDichKhopLenh;
	}

	public static String[] getGiaoDichThoaThuan() {
		return GiaoDichThoaThuan;
	}

	public static String[] getTangManh() {
		return TangManh;
	}

	public static String[] getTangNhe() {
		return TangNhe;
	}

	public static String[] getGiamManh() {
		return GiamManh;
	}

	public static String[] getGiamNhe() {
		return GiamNhe;
	}

	public static String[] getTangLienTuc() {
		return TangLienTuc;
	}

	public static String[] getGiamLienTuc() {
		return GiamLienTuc;
	}

	public static String[] getGiaCaoNhat() {
		return GiaCaoNhat;
	}

	public static String[] getGiaThapNhat() {
		return GiaThapNhat;
	}

	public static String[] getPhienTangManhNhat() {
		return PhienTangManhNhat;
	}

	public static String[] getPhienGiamManhNhat() {
		return PhienGiamManhNhat;
	}
}

