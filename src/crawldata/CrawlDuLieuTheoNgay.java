package crawldata;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.FileWriter;

public class CrawlDuLieuTheoNgay {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        Document doc;
        try {
            doc =  Jsoup.connect("https://s.cafef.vn/TraCuuLichSu2/1/HOSE/20/11/2020.chn").get();
            FileWriter fw = new FileWriter(dir + "//src//duLieu//bienDongTheoNgayData.csv") ;
            Elements Item_DateItem_lsg = doc.select("tr > td.Item_DateItem_lsg > a");
            Elements Item_Price1 = doc.select("tr > td.Item_Price1");
            Elements Item_ChangePrice_lsg = doc.select("tr > td.Item_ChangePrice_lsg");
            StringBuilder sb = new StringBuilder();
            int index1 = 0 ;
            int index2 = 0 ;
            for(int i = 0 ; i < Item_Price1.size();i++) {
                if (i % 10 == 0) {
                    sb.append("\"").append(Item_DateItem_lsg.get(index1++).text()).append("\",");
                    sb.append("\"").append(Item_Price1.get(i).text()).append("\",");
                }
                else if (i % 10 == 2) {
                    sb.append("\"").append(Item_ChangePrice_lsg.get(index2 ++).text()).append("\",");
                    sb.append("\"").append(Item_Price1.get(i).text()).append("\",");
                }
                else if( i % 10 == 1) continue;
                else {
                    sb.append("\"").append(Item_Price1.get(i).text().replace(",", "."));
                    sb.append( (i % 10 != 9) ? "\"," : "\"\n");
                }
            }
            System.out.println(sb);
            fw.write(sb.toString());
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
