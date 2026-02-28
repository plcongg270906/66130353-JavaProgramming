public class Book {
	String tieuDe;
	String tacGia;
	int gia;
	int soTrang;
	
	void hienThiThongTin() {
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Giá: " + gia + " Đồng");
        System.out.println("Số trang: " + soTrang);
    }
}
