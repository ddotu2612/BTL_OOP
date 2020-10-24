package crawData;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class NDTNNCrawData {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir") ;
        Document doc;
        {
            try {
                doc = Jsoup.connect("https://s.cafef.vn/TraCuuLichSu2/3/HOSE/23/10/2020.chn").get();
                Elements column1= doc.select("tr > td.CodeItem>a");
                Elements body =doc.select("tr > td.Item");

                int indext = 0 ;
                StringBuilder sb = new StringBuilder();
                FileWriter fw = new FileWriter(dir + "\\gdnnData");

                for ( int i =0 ; i < body.size(); i++) {
                    if( i % 8 == 0) {
                        sb.append("\"").append(column1.get(indext++).text()).append("\",");
                        sb.append("\"").append(body.get(i).text()).append("\",");
                    } else {
                        sb.append("\"").append(body.get(i).text());
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
