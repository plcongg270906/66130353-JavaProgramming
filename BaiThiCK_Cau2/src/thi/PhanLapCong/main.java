package thi.PhanLapCong;

import java.util.ArrayList;

import thi.PhanLapCong.IDongVat.DongVat;

public class main {

	public static void main(String[] args) {
		ArrayList<DongVat> ds = new ArrayList<DongVat>();
		ds.add(new Cho("Milo"));
		ds.add(new Meo("Tom"));
		for (DongVat dv : ds) {
			System.out.print(dv.getLoai() + " - " + dv.getTen() + " - ");
			dv.tiengKeu();
		}
	}

}
