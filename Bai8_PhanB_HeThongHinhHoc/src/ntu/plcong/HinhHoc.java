package ntu.plcong;

public class HinhHoc {
	private String ten;
	private String mauSac;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	
	public HinhHoc(String ten, String mauSac) {
		this.ten = ten;
		this.mauSac = mauSac;
	}
	public double tinhDienTich() {
		return 0;
	}
	public double tinhChuVi() {
		return 0;
	}
	public void hienThiThongTin() {
		System.out.println("Ten: " + ten);
        System.out.println("Mau sac: " + mauSac);
	}
}
