package ntu.plcong;

public class HinhTron extends HinhHoc{
	private double banKinh;

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

	public HinhTron(String ten, String mauSac, double banKinh) {
		super(ten, mauSac);
		this.banKinh = banKinh;
	}
	@Override
	public double tinhDienTich() {
		return Math.PI*banKinh*banKinh;
	}
	@Override
	public double tinhChuVi() {
		return 2*banKinh*Math.PI;
	}
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Dien tich hinh tron: " + tinhDienTich());
		System.out.println("Chu vi hinh tron: " + tinhChuVi());
	}
}
