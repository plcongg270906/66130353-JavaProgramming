package plcong.quanlynhanvien;

public class NhanVienVanPhong extends NhanVien{
	private double soGioLamThem;
	private double luongThemMoiGio;
	public NhanVienVanPhong(String maNV, String hoTen, double luongCoBan, double soGioLamThem, double luongThemMoiGio) {
		super(maNV, hoTen, luongCoBan);
		this.soGioLamThem = soGioLamThem;
		this.luongThemMoiGio = luongThemMoiGio;
	}
	@Override
	public double tinhLuong() {
		return super.getLuongCoBan() + soGioLamThem*luongThemMoiGio;
	}
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Số giờ làm thêm: " + soGioLamThem);
		System.out.println("Lương thêm mỗi giờ: " + luongThemMoiGio);
		System.out.println("Lương được nhận: " + tinhLuong());
	}
	@Override
	public String toString() {
		String chuoiXuat = super.toString();
		chuoiXuat = chuoiXuat + "\nSố giờ làm thêm: " + this.soGioLamThem;
		chuoiXuat = chuoiXuat + "\nLương thêm mỗi giờ: " + this.luongThemMoiGio;
		chuoiXuat = chuoiXuat + "\nLương nhận được: " + tinhLuong();
		return chuoiXuat;
//		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
	}
}
