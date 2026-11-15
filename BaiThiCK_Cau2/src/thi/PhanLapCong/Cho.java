package thi.PhanLapCong;

import thi.PhanLapCong.IDongVat.DongVat;

public class Cho implements DongVat{
	private String ten;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Cho(String ten) {
		super();
		this.ten = ten;
	}
	public void tiengKeu() {
		 System.out.println("Gau gau");
	}
	public String getLoai() {
		return "Cho";
	}
}
