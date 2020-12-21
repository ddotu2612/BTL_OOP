package laydulieu;

import cackieudulieu.ChiSoIndex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DuLieuChiSoIndex extends LayDuLieuCSV{
	/**
	 *
	 * @param a
	 * @param maCK
	 */
	public ChiSoIndex taoChiSoIndex(List<String> a, String maCK) {
		ChiSoIndex chiSoIndex = new ChiSoIndex();
		chiSoIndex.setMaChungKhoan(maCK);
		chiSoIndex.setNgayGD(a.get(0).substring(1,a.get(0).length() - 1));
		chiSoIndex.setGiaDongCua(Double.parseDouble(a.get(1).substring(1,a.get(1).length()-1)));//bỏ qua 2 dấu ""
		chiSoIndex.setThayDoi(a.get(2));
		chiSoIndex.setKLGDKhopLenh(Long.parseLong(a.get(3).substring(1,a.get(3).length()-1).replace(".","")));// bỏ qua dấu chấm trong dữ liệu
		chiSoIndex.setGTGDKhopLenh(Long.parseLong(a.get(4).substring(1,a.get(4).length()-1)));// 369.111.310 -> 369111310
		chiSoIndex.setKLGDThoaThuan(Long.parseLong(a.get(5).substring(1,a.get(5).length()-1)));
		chiSoIndex.setGTGDThoaThuan(Long.parseLong(a.get(6).substring(1,a.get(6).length()-1)));
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
	public List<ChiSoIndex> chuyenCSVSangIndexList(String csvPath, String maCK) {
		List<ChiSoIndex> list = new ArrayList<>() ;
		BufferedReader br = null;
		try {
			String line;
			br = new BufferedReader(new FileReader(csvPath));
			// Bỏ qua dòng đầu tiên
			//br.readLine();
			// Đọc file csv
			while ((line = br.readLine()) != null) {
				list.add(taoChiSoIndex(parseCSVLine(line),maCK));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return list ;
	}
}