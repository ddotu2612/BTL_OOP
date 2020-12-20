package cackieudulieu;

public class ChiSoIndex {

	private String maChungKhoan;
	private String ngayGD;
	private double giaMoCua;
	private double giaDongCua;
	private double giaCaoNhat;
	private double giaThapNhat;
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

	public void setGiaCaoNhat(double giaCaoNhat) {
		this.giaCaoNhat = giaCaoNhat;
	}

	public void setGiaThapNhat(double giaThapNhat) {
		this.giaThapNhat = giaThapNhat;
	}

	public double getGiaTriThayDoi() {
		return giaTriThayDoi;
	}

	public double getTiLeThayDoi() {
		return tiLeThayDoi;
	}

	public void setGTGDKhopLenh(long GTGDKhopLenh) {
		this.GTGDKhopLenh = GTGDKhopLenh;
	}

	public void setGTGDThoaThuan(long GTGDThoaThuan) {
		this.GTGDThoaThuan = GTGDThoaThuan;
	}

	public void setKLGDKhopLenh(long KLGDKhopLenh) {
		this.KLGDKhopLenh = KLGDKhopLenh;
	}

	public void setKLGDThoaThuan(long KLGDThoaThuan) {
		this.KLGDThoaThuan = KLGDThoaThuan;
	}

	private long GTGDThoaThuan;
	private long KLGDKhopLenh;
	private long KLGDThoaThuan;

	public void setThayDoi(String thayDoi) {
		int n = thayDoi.length();
		this.thayDoi = thayDoi;
		int i;
		int j;
		for(i = 0; i< n;i++)
			if(thayDoi.charAt(i) == '(' ) break;
		for(j = i; j< n;j++)
			if(thayDoi.charAt(j) == ')' ) break;
		this.giaTriThayDoi = Double.parseDouble(this.thayDoi.substring(1, i-1));
		this.tiLeThayDoi = Double.parseDouble(this.thayDoi.substring(i+1,j-1));
	}

	public String chuyenDoiThayDoi() {
		int n = thayDoi.length();
		String a ;
		int i,j;
		if(thayDoi.charAt(1) == '-'){
			for(i = 0 ; i < n ; i++){
				if(thayDoi.charAt(i) == '(') break;
			}
			for(j = 0 ; j < n ; j++){
				if(thayDoi.charAt(j) == ')' ) break;
			}
			double giaTri=Double.parseDouble(thayDoi.substring(2 , i-1));
			double tiLe=Double.parseDouble(thayDoi.substring(i+2 , j-1));
			a = "giảm " + giaTri + " điểm (tương ứng với " + tiLe + " phần trăm )";
		}else{
			for(i = 0 ; i < n ; i++){
				if(thayDoi.charAt(i) == '(') break;
			}
			for(j = 0 ; j < n ; j++){
				if(thayDoi.charAt(j) == ')' ) break;
			}
			double giaTri = Double.parseDouble(thayDoi.substring(1 , i-1));
			double tiLe = Double.parseDouble(thayDoi.substring(i+1 , j-1));
			a = "tăng " + giaTri + " điểm (tương ứng với " + tiLe + " phần trăm )";
		}
		return a;
	}

	public double getThayDoiDauPhien() {
		return giaMoCua - (giaDongCua - giaTriThayDoi);
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