package laydulieu;
import cackieudulieu.BienDongChungKhoan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DuLieuBDTK extends LayDuLieuCSV {
    public static BienDongChungKhoan LayDLBDTK(List<String> args){
        BienDongChungKhoan Data = new BienDongChungKhoan();
        Data.setMa(args.get(0));
        Data.setVonHoa(args.get(1));
        Data.setGia(args.get(2));
        Data.setKhoiLuong(args.get(3));
        Data.setGiaSoVoiThangTruoc(args.get(4));
        Data.setkLuongSoVoiTB1Thang(args.get(5));
        return Data;
    }

    public List<BienDongChungKhoan> CSV_Extract(String csvPath) {

        List<BienDongChungKhoan> datalist = new ArrayList<>();
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(csvPath));
            br.readLine();
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