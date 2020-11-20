package crawlData;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

import javax.swing.text.Document;
import java.io.FileWriter;

public class CrawlDuLieuTheoNgay {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        org.jsoup.nodes.Document doc;
        try {
            doc =  Jsoup.connect("https://s.cafef.vn/TraCuuLichSu2/1/HOSE/16/11/2020.chn").get();
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
                else if (i % 10 == 1) {
                    sb.append("\"").append(Item_ChangePrice_lsg.get(index2 ++).text()).append("\",");
                    sb.append("\"").append(Item_Price1.get(i).text()).append("\",");
                }
                else {
                    sb.append("\"").append(Item_Price1.get(i).text());
                    sb.append( (i % 10 != 9) ? "\"," : "\"\n");
                }
                if(index1 == Item_Price1.size()/11) break;
            }
            System.out.println(sb);
            fw.write(sb.toString());
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
