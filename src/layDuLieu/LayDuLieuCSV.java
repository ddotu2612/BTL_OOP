package layDuLieu;



import java.util.ArrayList;

public class LayDuLieuCSV {
<<<<<<< HEAD
	public static ArrayList<String> parseCSVLine(String csvLine) {

=======
	public ArrayList<String> parseCSVLine(String csvLine) {
>>>>>>> adee5b874e2b550ff34fd49be0852d9d64719ab7
		ArrayList<String > res = new ArrayList<>();
		if(csvLine != null ){
			String[] data = csvLine.split(",");
			for( String i: data){
				res.add(i);
			}
		}
		return res ;
	}
}