
package crawldulieu;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class CrawlVNINDEX {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        Document doc;

        {
            try {
                doc = Jsoup.connect("https://s.cafef.vn/Lich-su-giao-dich-VNINDEX-1.chn#").get();
                Elements item_DateItem = doc.select(" tr > td.Item_DateItem ");
                Elements item_ChangePrice =doc.select("tr > td.Item_ChangePrice > span") ;
                Elements lastItem_Price = doc.select("tr > td.LastItem_Price") ;
                Elements item_Price10 = doc.select("tr > td.Item_Price10") ;

                StringBuilder sb = new StringBuilder() ;
                FileWriter fw = new FileWriter(dir + "//src//duLieu//vnindexData.csv") ;
                int index1 = 0 ;
                int index2 = 0 ;
                int index3 = 0 ;
                for (int i = 0; i < item_Price10.size(); i++) {
                    if( i % 10 == 0){
                        sb.append("\"").append(item_DateItem.get(index1++).text().replace(",", "")).append("\",");
                        sb.append("\"").append(item_Price10.get(i).text().replace(",", "")).append("\",");
                    }else if (i % 10 == 1){
                        sb.append("\"").append(item_ChangePrice.get(index2++).text().replace(",", "")).append("\",");
                        sb.append("\"").append(item_Price10.get(i).text().replace(',','.')).append("\",");
                    }else if( i % 10 == 4){
                        sb.append("\"").append(lastItem_Price.get(index3++).text().replace(",", "")).append("\",");
                        sb.append("\"").append(item_Price10.get(i).text().replace(",", "")).append("\",");
                    }else if( i % 10 == 7 || i % 10 == 8 || i % 10 == 9){
                        continue;
                    } else {
                        if(i % 10 == 2 || i % 10 == 3 ) {
                            sb.append("\"").append(item_Price10.get(i).text().replace(",", "")).append("\",");
                        } else {
                            sb.append("\"").append(item_Price10.get(i).text().replace(",", ""));
                            sb.append( (i % 10 != 6) ? "\"," : "\"\n");
                        }
                    }
                }
                System.out.println(sb);
                fw.write(sb.toString());
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
