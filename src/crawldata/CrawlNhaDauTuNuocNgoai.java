package crawldata;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class CrawlNhaDauTuNuocNgoai {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir") ;
        Document doc;
        {
            try {
                doc = Jsoup.connect("https://s.cafef.vn/TraCuuLichSu2/3/HOSE/01/12/2020.chn").get();
                Elements column1= doc.select("tr > td.CodeItem>a");
                Elements body = doc.select("tr > td.Item");

                int indext = 0 ;
                StringBuilder sb = new StringBuilder();
                FileWriter fw = new FileWriter(dir + "\\src\\duLieu\\NDTNN_01_12_20.csv");

                for ( int i =0 ; i < body.size(); i++) {
                    String s = body.get(i).text();
                    String[] str = s.split(",");
                    s = String.join(".",str);
                    if( i % 8 == 0) {

                        sb.append("\"").append(column1.get(indext++).text()).append("\",");
                        sb.append("\"").append(s).append("\",");
                    } else {
                        sb.append("\"").append(s);
                        sb.append( (i % 8 != 7) ? "\"," : "\"\n");
                    }
                    if( i == body.size() - 1 && indext == body.size() -1 ) break;
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
