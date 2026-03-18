package ntu.plcong;

public class SanPham {
	private String maSP;
	private String tenSP;
	private double gia;
	private int soLuong;
	
	public String getMaSP() {
		return maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public double getGia() {
		return gia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	
	public SanPham(String maSP,String tenSP, double gia, int soLuong) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.gia = gia;
		this.soLuong = soLuong;
	}
	
	@Override
	public String toString() {
        return String.format("Mã SP: %s\nTên SP: %s\nGiá: %,.0f VNĐ\nSố lượng: %d",maSP, tenSP, gia, soLuong);
    }

}
