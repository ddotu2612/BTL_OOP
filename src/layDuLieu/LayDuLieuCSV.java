package layDuLieu;



import java.util.ArrayList;

<<<<<<< HEAD
	}
	public static ArrayList<String> parseCSVLine(String csvLine) {
=======
public class LayDuLieuCSV {
	public ArrayList<String> parseCSVLine(String csvLine) {
>>>>>>> f4e8c0e8fb9154f1e95b0bdbcf8e68d81c0e2c18
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