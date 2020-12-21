package tintuc;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LayDuLieu {
	public List<String> cauChungKhoan =new ArrayList<String>();
        
	public void layCau() throws IOException {
		//Set the URL to connect
		String url = "https://vnexpress.net/kinh-doanh/chung-khoan";

		for(int i = 1; i <= 10; i++) {
			//Fetch and parse HTML file from the web into a Document object
			//Chỉ tìm kiếm hot tag 50 trang đầu
			Document docPage = Jsoup.connect(url+"-p"+i).timeout(10000).get();

			//Using Selector Syntax
			Elements elementPage = docPage.select(".description a[data-medium]");
			for(int j = 0; j<elementPage.size(); j++) {
				cauChungKhoan.add(elementPage.get(j).ownText());
			}
		}
	}
}
