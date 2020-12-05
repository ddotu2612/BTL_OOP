package crawldulieu;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class CrawlBienDongChungKhoan {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        Document doc;
        try {
            doc = Jsoup.connect("https://s.cafef.vn/thong-ke/timeline-1-thang/san-hose.chn").get();
            Elements col1 = doc.select("tr > td.col1 > a");
            Elements col2 = doc.select("tr >td.col2");
            Elements col3 = doc.select("tr >td.col3");
            Elements col4 = doc.select("tr >td.col4");
            Elements col5 = doc.select("tr >td.col5");
            Elements col7 = doc.select("tr >td.col7");
            StringBuilder sb = new StringBuilder();
            FileWriter fileWriter = new FileWriter(dir + "\\src\\duLieu//BienDongChungKhoan.csv");
            for (int i = 0; i < col1.size(); i++) {
                sb.append(col1.get(i).ownText()).append(",");
                sb.append(col2.get(i).text()).append(",");
                sb.append(col3.get(i).text()).append(",");
                sb.append(col4.get(i).text()).append(",");
                sb.append(col5.get(i).text()).append(",");
                sb.append(col7.get(i).text()).append("\n");
            }
            System.out.println(sb);
            fileWriter.write(sb.toString());
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
