package cacKieuDuLieu;

public class ChiSoIndex {

	private String maChungKhoan;
	private String ngayGD;
	private double giaMoCua;
	private double giaDongCua;
	private double giaCaoNhat;
	private double giaThapNhat;
	private double giaThamChieu;
	private double giaTriThayDoi;
	private double tiLeThayDoi;
	private String thayDoi;//so với phiên trước đó
	private long GTGDKhopLenh;

	public String getMaChungKhoan() {
		return maChungKhoan;
	}

	public void setMaChungKhoan(String maChungKhoan) {
		this.maChungKhoan = maChungKhoan;
	}

	public String getNgayGD() {
		return ngayGD;
	}

	public void setNgayGD(String ngayGD) {
		this.ngayGD = ngayGD;
	}

	public double getGiaMoCua() {
		return giaMoCua;
	}

	public void setGiaMoCua(double giaMoCua) {
		this.giaMoCua = giaMoCua;
	}

	public double getGiaDongCua() {
		return giaDongCua;
	}

	public void setGiaDongCua(double giaDongCua) {
		this.giaDongCua = giaDongCua;
	}

	public double getGiaCaoNhat() {
		return giaCaoNhat;
	}

	public void setGiaCaoNhat(double giaCaoNhat) {
		this.giaCaoNhat = giaCaoNhat;
	}

	public double getGiaThapNhat() {
		return giaThapNhat;
	}

	public void setGiaThapNhat(double giaThapNhat) {
		this.giaThapNhat = giaThapNhat;
	}

	public double getGiaThamChieu() {
		return giaThamChieu;
	}

	public void setGiaThamChieu(double giaThamChieu) {
		this.giaThamChieu = giaThamChieu;
	}

	public double getGiaTriThayDoi() {
		return giaTriThayDoi;
	}

	public void setGiaTriThayDoi(double giaTriThayDoi) {
		this.giaTriThayDoi = giaTriThayDoi;
	}

	public double getTiLeThayDoi() {
		return tiLeThayDoi;
	}

	public void setTiLeThayDoi(double tiLeThayDoi) {
		this.tiLeThayDoi = tiLeThayDoi;
	}

	public String getThayDoi() {
		return thayDoi;
	}

	public long getGTGDKhopLenh() {
		return GTGDKhopLenh;
	}

	public void setGTGDKhopLenh(long GTGDKhopLenh) {
		this.GTGDKhopLenh = GTGDKhopLenh;
	}

	public long getGTGDThoaThuan() {
		return GTGDThoaThuan;
	}

	public void setGTGDThoaThuan(long GTGDThoaThuan) {
		this.GTGDThoaThuan = GTGDThoaThuan;
	}

	public long getKLGDKhopLenh() {
		return KLGDKhopLenh;
	}

	public void setKLGDKhopLenh(long KLGDKhopLenh) {
		this.KLGDKhopLenh = KLGDKhopLenh;
	}

	public long getKLGDThoaThuan() {
		return KLGDThoaThuan;
	}

	public void setKLGDThoaThuan(long KLGDThoaThuan) {
		this.KLGDThoaThuan = KLGDThoaThuan;
	}

	private long GTGDThoaThuan;
	private long KLGDKhopLenh;
	private long KLGDThoaThuan;

	public void chiSoIndex() {

	}

	/**
	 * 
	 * @param thayDoi
	 */
	public void setThayDoi(String thayDoi) {

		this.thayDoi = thayDoi;

		int i;
		int j;
		for(i = 0; i< thayDoi.length();i++)
			if(thayDoi.charAt(i) == '(' ) break;
		for(j = i; j< thayDoi.length();j++)
			if(thayDoi.charAt(j) == ')' ) break;
		this.giaTriThayDoi = Double.parseDouble(this.thayDoi.substring(1, i-1));
		this.tiLeThayDoi = Double.parseDouble(this.thayDoi.substring(i+1,j-1));
	}

	public String chuyenDoiThayDoi() {
		String a ;
		int i,j;
		if(thayDoi.charAt(1) == '-'){
			for(i = 0 ; i < thayDoi.length() ; i++){
				if(thayDoi.charAt(i) == '(') break;
			}
			for(j = 0 ; j < thayDoi.length() ; j++){
				if(thayDoi.charAt(j) == ')' ) break;
			}
			double giaTri=Double.parseDouble(thayDoi.substring(2 , i-1));
			double tiLe=Double.parseDouble(thayDoi.substring(i+2 , j-1));
			a="giảm "+giaTri+" điểm (tương ứng với "+tiLe+ " phần trăm )";
		}else{
			for(i = 0 ; i < thayDoi.length() ; i++){
				if(thayDoi.charAt(i) == '(') break;
			}
			for(j = 0 ; j < thayDoi.length() ; j++){
				if(thayDoi.charAt(j) == ')' ) break;
			}
			double giaTri=Double.parseDouble(thayDoi.substring(1 , i-1));
			double tiLe=Double.parseDouble(thayDoi.substring(i+1 , j-1));
			a="tăng "+giaTri+" điểm (tương ứng với "+tiLe+ " phần trăm )";
		}
		return a;
	}

	public void infoData() {
		System.out.println( maChungKhoan + "|" + ngayGD + "|" + giaDongCua + "|" + giaTriThayDoi + "|" + tiLeThayDoi + "|" + giaMoCua
				+ "|" + giaCaoNhat + "|" + giaThapNhat +"|"+ KLGDThoaThuan +"|"+ GTGDThoaThuan+"|"+ KLGDKhopLenh +"|"+ GTGDKhopLenh);
	}

	public double getThayDoiDauPhien() {
		double change = giaMoCua - (giaDongCua - giaTriThayDoi);
		return change;
	}

	public int quyDoiGTGDKhopLenh() {
		int a;
		a = (int) GTGDKhopLenh/1000000000;
		return a;
	}

	public int quyDoiKLGDKhopLenh() {
		int a;
		a = (int )KLGDKhopLenh/1000000 ;
		return a;
	}

	public int quyDoiGTGDThoaThuan() {
		int a;
		a = (int) GTGDThoaThuan/1000000000;
		return a;
	}

	public int quyDoiKLGDThoaThuan() {
		int a;
		a = (int) KLGDThoaThuan/1000000;
		return a;
	}
}