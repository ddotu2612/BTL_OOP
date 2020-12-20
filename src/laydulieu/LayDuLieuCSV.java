package laydulieu;



import java.util.ArrayList;
import java.util.List;

public class LayDuLieuCSV {

	public List<String> parseCSVLine(String csvLine) {
		List<String > res = new ArrayList<>();
		if(csvLine != null ){
			String[] data = csvLine.split(",");
			for( String i: data){
				res.add(i);
			}
		}
		return res ;
	}
}