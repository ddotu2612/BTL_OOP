package layDuLieu;



import java.util.ArrayList;

public class LayDuLieuCSV {
	public static ArrayList<String> parseCSVLine(String csvLine) {

		ArrayList<String > res = new ArrayList<>();
		if(csvLine != null ){
			String[] data = csvLine.split(",");
			for( var i: data){
				res.add(i);
			}
		}
		return res ;
	}
}