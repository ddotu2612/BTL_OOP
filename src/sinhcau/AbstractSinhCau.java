package sinhcau;

import java.util.List;
import java.util.Random;

public abstract class AbstractSinhCau {

	public String sinhCauNgauNhien(String[] sentences) {
		Random ran = new Random() ;
		int i = ran.nextInt(sentences.length);
		String res = sentences[i];
		return res;
	}

	public abstract List<String> sinhDoanVan();

}