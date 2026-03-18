package ntu.plcong;

public class MainQuanLySanPham {

	public static void main(String[] args) {
		System.out.println("=== HỆ THỐNG QUẢN LÝ SẢN PHẨM VỚI ARRAYLIST ===\n");

		QuanLySanPham qlsp = new QuanLySanPham();

		// Thêm sản phẩm
		qlsp.themSanPham(new SanPham("SP001", "Laptop Dell", 15000000, 10));
		qlsp.themSanPham(new SanPham("SP002", "Chuột Logitech", 250000, 50));
		qlsp.themSanPham(new SanPham("SP003", "Bàn phím cơ", 1200000, 30));
		qlsp.themSanPham(new SanPham("SP004", "Màn hình Samsung", 4500000, 15));
		qlsp.themSanPham(new SanPham("SP005", "Tai nghe Sony", 2000000, 20));
		
		// Tìm theo tên
	    System.out.println("\n=== TÌM THEO TÊN 'Laptop' ===");
	    qlsp.timTheoTen("Laptop").forEach(System.out::println);
	    
	    // Sắp xếp tăng dần
	    System.out.println("\n=== SẮP XẾP GIÁ TĂNG DẦN ===");
	    qlsp.sapXepGiaTangDan();
	    qlsp.hienThiDanhSach();
	    
	    
	    // Tổng giá trị kho
	    System.out.println("\n=== TỔNG GIÁ TRỊ KHO ===");
	    System.out.printf("Tổng: %,.0f VNĐ\n", qlsp.tongGiaTriKho());
	    
	    // Sản phẩm sắp hết hàng
	    System.out.println("\n=== SẢN PHẨM SẮP HẾT HÀNG ===");
	    qlsp.sapHetHang().forEach(System.out::println);
	    
	    // Xóa sản phẩm
	    System.out.println("\n=== XÓA SP002 ===");
	    qlsp.xoaTheoMa("SP002");
	    qlsp.hienThiDanhSach();
	}

}
