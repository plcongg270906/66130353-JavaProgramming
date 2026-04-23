package thigk2.PhanLapCong66130353;

public class SanPham {
	private String maSP;
	private String tenSP;
	private String loaiSP;
	private double giaSP;
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getLoaiSP() {
		return loaiSP;
	}
	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}
	public double getGiaSP() {
		return giaSP;
	}
	public void setGiaSP(double giaSP) {
		this.giaSP = giaSP;
	}
	public SanPham(String maSP, String tenSP, String loaiSP, double giaSP) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.giaSP = giaSP;
	}
	public String InThongTin() {
		return "Mã SP: " + maSP + ", tên SP: " + tenSP + ", loại SP: " + loaiSP + ", giá SP: " + giaSP;
	} 
}
