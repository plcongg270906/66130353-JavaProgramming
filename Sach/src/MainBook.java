
public class MainBook {

	public static void main(String[] args) {
		Book sach1 = new Book();
		sach1.tieuDe = "Sapiens: Lược sử về loài người";
		sach1.tacGia = "Yuval Noah Harari";
		sach1.soTrang = 556;
		sach1.gia = 189000;
		
		Book sach2 = new Book();
		sach2.tieuDe = "Nhà giả kim";
		sach2.tacGia = "Paulo Coelho";
		sach2.soTrang = 228;
		sach2.gia = 79000;
		
		Book sach3 = new Book();
		sach3.tieuDe = "Đắc nhân tâm";
		sach3.tacGia = "Dale Carnegie";
		sach3.soTrang = 320;
		sach3.gia = 86000;
		
		System.out.println("THÔNG TIN SÁCH 1:");
		sach1.hienThiThongTin();
		
		System.out.println("THÔNG TIN SÁCH 2:");
		sach2.hienThiThongTin();
		
		System.out.println("THÔNG TIN SÁCH 3:");
		sach3.hienThiThongTin();
	}

}
