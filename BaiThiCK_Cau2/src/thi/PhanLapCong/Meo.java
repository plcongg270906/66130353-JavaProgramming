package thi.PhanLapCong;

import thi.PhanLapCong.IDongVat.DongVat;

public class Meo implements DongVat{
	private String ten;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Meo(String ten) {
		super();
		this.ten = ten;
	}
	public void tiengKeu() {
		 System.out.println("Meo meo");
	}
	public String getLoai() {
		return "Meo";
	}
}
