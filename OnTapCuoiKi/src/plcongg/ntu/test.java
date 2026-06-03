package plcongg.ntu;

public class test {
	private String maSV;
	private String hoTen;
	private double dtb;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
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
	public test() {}
	public test(String maSV, String hoTen, double dtb) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.dtb = dtb;
	}
	@Override
	public String toString() {
		return "Mã SV: " + maSV + ", họ và tên: " + hoTen + ", điểm tb: " + dtb;
	}
	
}
