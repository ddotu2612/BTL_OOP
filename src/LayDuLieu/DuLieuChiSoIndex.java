package LayDuLieu;

import cacKieuDuLieu.ChiSoIndex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DuLieuChiSoIndex extends LayDuLieuCSV{

	public DuLieuChiSoIndex() {
	}

	/**
	 * 
	 * @param a
	 * @param maCK
	 */
	public ChiSoIndex taoChiSoIndex(ArrayList<String> a, String maCK) {
		ChiSoIndex chiSoIndex = new ChiSoIndex();
		chiSoIndex.setMaChungKhoan(maCK);
		chiSoIndex.setNgayGD(a.get(0));
		chiSoIndex.setGiaDongCua(Double.parseDouble(a.get(1).substring(1,a.get(1).length()-1)));//bỏ qua 2 dấu ""
		chiSoIndex.setThayDoi(a.get(2));
		chiSoIndex.setKLGDKhopLenh(Long.parseLong(a.get(3).substring(1,a.get(3).length()-1).replace("\\,","")));// bỏ qua dấu phẩy trong dữ liệu
		chiSoIndex.setGTGDKhopLenh(Long.parseLong(a.get(4).substring(1,a.get(4).length()-1).replace("\\,","")));// 369,111,310 -> 369111310
		chiSoIndex.setKLGDThoaThuan(Long.parseLong(a.get(5).substring(1,a.get(5).length()-1).replace("\\,","")));
		chiSoIndex.setGTGDThoaThuan(Long.parseLong(a.get(6).substring(1,a.get(6).length()-1).replace("\\,","")));
		chiSoIndex.setGiaMoCua(Double.parseDouble(a.get(7).substring(1,a.get(7).length()-1)));
		chiSoIndex.setGiaCaoNhat(Double.parseDouble(a.get(8).substring(1,a.get(8).length()-1)));
		chiSoIndex.setGiaThapNhat(Double.parseDouble(a.get(9).substring(1,a.get(9).length()-1)));
		return chiSoIndex;
	}

	/**
	 * 
	 * @param csvPath
	 * @param maCK
	 */
	public ArrayList<ChiSoIndex> chuyenCSVSangIndexList(String csvPath, String maCK) {
		ArrayList<ChiSoIndex> list = new ArrayList<>() ;
		try {
			BufferedReader br = new BufferedReader(new FileReader(csvPath));
			try {
				String res;
				// Bỏ qua dòng đầu tiên
				br.readLine() ;

				while ((res = br.readLine()) != null){
					res = br.readLine() ;
					list.add(taoChiSoIndex(parseCSVLine(res) , maCK));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list ;
	}

}