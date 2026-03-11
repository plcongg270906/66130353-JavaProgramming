
public class Main {

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("NV01", "Nguyễn Văn A", 3000000, 1.2);
        NhanVien nv2 = new NhanVien("NV02", "Trần Thị B", 4000000, 2.3);
        NhanVien nv3 = new NhanVien("NV03", "Nguyễn Văn C", 5000000, 4.5);
        System.out.println("Danh sách nhân viên");
        System.out.printf("Mã NV: %s\nHọ tên: %s\nLương cơ bản: %,.0f VNĐ\nHệ số lương: %.1f\n", 
        nv1.getMaNV(), nv1.getHoTen(), nv1.getLuongCoBan(), nv1.getHeSoLuong());
        System.out.println(nv2.toString());
        System.out.println(nv3.toString());
	}

}
