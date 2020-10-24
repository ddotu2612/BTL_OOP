package crawData;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class CrawData {
    public static void main(String[] args) throws IOException {
        String dir = System.getProperty("user.dir"); // lấy đường dẫn đến thư mục chứa project
        System.out.println(dir);
        Document document= Jsoup.connect("https://s.cafef.vn/TraCuuLichSu2/3/HOSE/19/10/2020.chn").get();
        Elements body = document.select("tr > td.Item");
        Elements codeItem = document.select("tr > td.CodeItem > a");
        int i = 0, index = 0;
        StringBuilder row = new StringBuilder();
        FileWriter fw = new FileWriter(dir+"\\test.csv");
        for(Element e : body) {
            if(i == 0){
                row.append("\"");
                row.append(codeItem.get(index++).text());
                row.append("\",");
            }
            row.append("\"");
            row.append(e.text());
            row.append((i != 7)? "\",": "\"\n");
            i = (i + 1) % 8;
        }
        System.out.print(row);
        try {
            fw.write(row.toString());
            fw.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

//        final int NUM = 24;
//        Document doc = Jsoup.connect("http://stockboard.sbsc.com.vn/apps/StockBoard/SBSC/HOSE.html").get();
//        Elements data = doc.select("tr > td.board-number");
//
//        int i = 0;
//        for(Element e : data){
//            System.out.print(e.text() + "\t");
//            i = (i+1)%NUM;
//            if(i == NUM-1){
//                System.out.println();
//            }
//        }
    }


}
