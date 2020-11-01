package sinhCau;

import cacKieuDuLieu.ChiSoIndex;

import java.util.ArrayList;
import java.util.Random;

public abstract class AbstractSinhCau {

	public String sinhCauNgauNhien(String[] sentences) {
		Random ran = new Random() ;
		int i = ran.nextInt(sentences.length);
		String res = sentences[i];
		return res;
	}

	public abstract ArrayList<String> sinhDoanVan();

	public abstract void setDataList(ArrayList<ChiSoIndex> chuyenCSVSangIndexList);
}