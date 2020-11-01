package layDuLieu;

import cacKieuDuLieu.NhaDauTuNuocNgoai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DuLieuNDTNN extends LayDuLieuCSV {
    public NhaDauTuNuocNgoai taoNDTNN(ArrayList<String> a) {
        NhaDauTuNuocNgoai duLieuNDTNN = new NhaDauTuNuocNgoai();
        duLieuNDTNN.setMa(a.get(0));
        duLieuNDTNN.setKhoiLuongMua(Long.parseLong(a.get(1).substring(1, a.get(1).length() - 1).replace(".", "")));
        duLieuNDTNN.setGiaTriMua(Long.parseLong(a.get(2).substring(1, a.get(2).length() - 1).replace(".", "")));
        duLieuNDTNN.setKhoiLuongBan(Long.parseLong(a.get(3).substring(1, a.get(3).length() - 1).replace(".", "")));
        duLieuNDTNN.setGiaTriBan(Long.parseLong(a.get(4).substring(1, a.get(4).length() - 1).replace(".", "")));
        duLieuNDTNN.setKhoiLuongRong(Long.parseLong(a.get(5).substring(1, a.get(5).length() - 1).replace(".", "")));
        duLieuNDTNN.setGiaTriGiaoDichRong(Long.parseLong(a.get(6).substring(1, a.get(6).length() - 1).replace(".", "")));
        return duLieuNDTNN;
    }

    public ArrayList chuyenFileCSVNDTNNSangList(String csvPath) {
        ArrayList list = new ArrayList();
        BufferedReader br = null;
        try {
            String line ;
            br = new BufferedReader(new FileReader(csvPath));
            while((line = br.readLine()) != null) {
                list.add(taoNDTNN(parseCSVLine(line)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return list;
    }
}