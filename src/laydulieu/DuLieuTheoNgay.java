package laydulieu;

import cackieudulieu.ChungKhoanTheoNgay;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class DuLieuTheoNgay extends LayDuLieuCSV {

    public ChungKhoanTheoNgay taoDuLieuTheoNgay(List <String> a){
        ChungKhoanTheoNgay dulieuChungKhoanTheoNgay = new ChungKhoanTheoNgay();
        dulieuChungKhoanTheoNgay.setMaCk(a.get(0).substring(1,a.get(0).length()-1));
        dulieuChungKhoanTheoNgay.setGiaDongCua(Double.parseDouble(a.get(1).substring(1,a.get(1).length()-1)));
        //dulieuTheoNgay.setGiaDongCua(Double.parseDouble(a.get(3).substring(1,a.get(3).length()-1)));
        dulieuChungKhoanTheoNgay.setGiaMoCua(Double.parseDouble(a.get(4).substring(1,a.get(4).length()-1)));
        dulieuChungKhoanTheoNgay.setGiaCaoNhat(Double.parseDouble(a.get(5).substring(1,a.get(5).length()-1)));
        dulieuChungKhoanTheoNgay.setGiaThapNhat(Double.parseDouble(a.get(6).substring(1,a.get(6).length()-1)));
        dulieuChungKhoanTheoNgay.setKlgdKhopLenh(Long.parseLong(a.get(7).substring(1,a.get(7).length()-1).replace(".","")));
        dulieuChungKhoanTheoNgay.setGtgdKhopLenh(Long.parseLong(a.get(8).substring(1,a.get(8).length()-1).replace(".","")));
        dulieuChungKhoanTheoNgay.setKlgdThoaThuan(Long.parseLong(a.get(9).substring(1,a.get(9).length()-1).replace(".","")));
        dulieuChungKhoanTheoNgay.setGtgdThoaThuan(Long.parseLong(a.get(10).substring(1,a.get(10).length()-1).replace(".","")));
        return dulieuChungKhoanTheoNgay;
    }
    public List<ChungKhoanTheoNgay> chuyenCSVSangIndexList (String csvPath) {
        List<ChungKhoanTheoNgay> list = new ArrayList<>() ;
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(csvPath));
            // Bỏ qua dòng đầu tiên
            br.readLine();
            // Đọc file csv
            while ((line = br.readLine()) != null) {
               list.add(taoDuLieuTheoNgay(parseCSVLine(line)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list ;
    }
}
