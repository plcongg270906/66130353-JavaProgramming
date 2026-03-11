
public class Main {

	public static void main(String[] args) {
		System.out.println("Sản phẩm mặc định");
		SanPham sp0 = new SanPham();
		sp0.hienThiThongTin();
		
		System.out.println("Sản phẩm 1");
		SanPham sp1 = new SanPham("000001","Chuột",600000,5);
		System.out.println("Mã SP: " + sp1.getMaSP());
		System.out.println("Tên SP: " + sp1.getTenSP());
		System.out.println("Giá: " + sp1.getGia());
        System.out.println("Số lượng: " + sp1.getSoLuong());
        System.out.println("Thành tiền: " + sp1.tinhThanhTien());
		
		System.out.println("Update sản phẩm mặc định");
		sp0.setMaSP("111111");
		sp0.setTenSP("Balo");
		sp0.setGia(300000);
		sp0.setSoLuong(3);
		sp0.hienThiThongTin();
		
		
		System.out.println("Update sản phẩm mặc định bị lỗi");
		sp0.setMaSP("");
		System.out.println("Mã SP: " + sp0.getMaSP());
		sp0.setGia(0);
		System.out.println("Giá: " + sp0.getGia());
		sp0.setSoLuong(-1);
        System.out.println("Số lượng: " + sp0.getSoLuong());
	}

}
