package crawData;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class CrawHose {
    public static void main(String[] args) {
        String div = System.getProperty( "user.dir");
        try {
            Document doc = Jsoup.connect("https://s.cafef.vn/TraCuuLichSu2/1/HOSE/19/10/2020.chn").get();
            Elements item_DateItem_lsg = doc.select("tr > td.Item_DateItem_lsg > a");
            Elements item_ChangePrice_lsg = doc.select("tr > td.Item_ChangePrice_lsg");
            Elements item_Price1 = doc.select("tr > td.Item_Price1");

            int indext1 = 0;
            int indext2 = 0;
            StringBuilder sb=new StringBuilder();
            FileWriter fileWriter=new FileWriter(div+"//src//duLieu//hoseData.csv");

            for(int i = 0 ; i < item_Price1.size() ; i ++) {
                if(i % 10 == 0){
                    sb.append("\"").append(item_DateItem_lsg.get(indext1++).text()).append("\",");
                    sb.append("\"").append(item_Price1.get(i).text()).append("\",");
                } else if(i % 10 == 2 && indext2 < item_Price1.size()-1){
                    sb.append("\"").append(item_ChangePrice_lsg.get(indext2++).text()).append("\",");
                    sb.append("\"").append(item_Price1.get(i).text()).append("\",");
                } else if(i % 10 == 1) {
                    continue;
                } else {
                    sb.append("\"").append(item_Price1.get(i).text());
                    sb.append( (i % 10 != 9) ? "\"," : "\"\n");
                }
                //if(indext1 == item_Price1.size()-1 && i == item_Price1.size()-1) break;
            }
            System.out.println(sb);
            fileWriter.write(sb.toString());
            fileWriter.close();
            System.out.println("Bạn đã ghi dữ liệu thành công vào file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
