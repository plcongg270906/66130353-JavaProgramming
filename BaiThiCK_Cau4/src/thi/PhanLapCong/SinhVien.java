package thi.PhanLapCong;

public class SinhVien {
	private String hoTen;
	private double dtb;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getDtb() {
		return dtb;
	}
	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
	public SinhVien() {}
	public SinhVien(String hoTen, double dtb) {
		super();
		this.hoTen = hoTen;
		this.dtb = dtb;
	}
	
}
