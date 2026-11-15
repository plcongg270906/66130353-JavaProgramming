package thi.PhanLapCong;

public class NhanVien {
	private String maNV;
	private String hoTen;
	private double luong;
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	public NhanVien() {}
	public NhanVien(String maNV, String hoTen, double luong) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luong = luong;
	}
	@Override
	public String toString() {
		return "Ma NV: " + maNV + ", ho ten: " + hoTen + ", luong: " + luong;
	}
	
}
