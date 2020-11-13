package layDuLieu;
import cacKieuDuLieu.BienDongChungKhoan;
import layDuLieu.LayDuLieuCSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DuLieuBDTK extends LayDuLieuCSV {
    public static BienDongChungKhoan LayDLBDTK(ArrayList<String> args){
        BienDongChungKhoan Data = new BienDongChungKhoan();
        Data.setMa(args.get(0));
        Data.setVonHoa(args.get(1));
        Data.setGia(args.get(2));
        Data.setKhoiLuong(args.get(3));
        Data.setGiaSoVoiThangTruoc(args.get(4));
        Data.setkLuongSoVoiTB1Thang(args.get(5));
        return Data;
    }
    public static ArrayList<BienDongChungKhoan> CSV_Extract(String csvPath) {
        ArrayList<BienDongChungKhoan> datalist = new ArrayList<>();
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(csvPath));
            // Skip the first line
            br.readLine();
            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {
                datalist.add(LayDLBDTK(parseCSVLine(line)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        return datalist;
    }
}