package crawData;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class CrawNhaDauTuNuocNgoai {
    public static void main(String[] args) {
        String div = System.getProperty("user.dir");
        System.out.println(div);
        Document doc;
        try {
            doc = Jsoup.connect("https://s.cafef.vn/TraCuuLichSu2/3/HOSE/23/10/2020.chn").get();
            Elements codeItem = doc.select("tr > td.CodeItem > a");
            Elements item = doc.select("tr > td.Item");
            StringBuilder sb = new StringBuilder();
            FileWriter fileWriter = new FileWriter( div + "\\src\\duLieu//NhadautuNNDate.csv");
            sb.append("\"").append("Ma").append("\",").append("\"").append("KLMua").append("\",").append("\"").append("GTMua").append("\",").append("\"").append("KLBan").append("\",").append("\"").append("GTBan").append("\"");
            sb.append("\"").append("KLGDRong").append("\",").append("\"").append("GTDGRong").append("\",").append("\"").append("RoomConLai").append("\",").append("\"").append("DangSoHuu").append("\"\n");
            int index1 = 0 ;
            for (int i = 0; i < item.size(); i++) {
                if ( i % 8 == 0) {
                    sb.append("\"").append(codeItem.get(index1++).text()).append("\",");
                    sb.append("\"").append(item.get(i).text()).append("\",");
                } else {
                    sb.append("\"").append(item.get(i).text());
                    sb.append((i % 8 != 7)  ? "\"," : "\"\n");
                }
            }
            System.out.println(sb);
            fileWriter.write(sb.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
