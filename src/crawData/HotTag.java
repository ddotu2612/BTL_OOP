package crawData;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class HotTag {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://vnexpress.net/kinh-doanh/chung-khoan-p2").get() ;
            Elements body = doc.select(".description > a");
            for ( var e : body ){
                System.out.println(e.ownText());
                //int i = e.text().indexOf("title");
                // int i=(e.text()).indexOf("href");
                 //System.out.println(i);
                //System.out.println(e.text().substring(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
