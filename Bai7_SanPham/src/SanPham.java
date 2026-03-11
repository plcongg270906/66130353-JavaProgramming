
public class SanPham {
	private String maSP;
    private String tenSP;
    private double gia;
    private int soLuong;
    public SanPham() {
        this.maSP = "000000";
        this.tenSP = "Không có tên sản phẩm";
        this.gia = 1; 
        this.soLuong = 0;
    }
    public SanPham(String maSP, String tenSP, double gia, int soLuong) {
        setMaSP(maSP);
        setTenSP(tenSP);
        setGia(gia);
        setSoLuong(soLuong);
    }
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
    public void setMaSP(String maSP) {
        if (maSP != null && !maSP.trim().isEmpty()) {
            this.maSP = maSP;
        } else {
            System.out.println("Lỗi: Mã sản phẩm không được rỗng");
            this.maSP = "000000"; 
        }
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    public void setGia(double gia) {
        if (gia > 0) {
            this.gia = gia;
        } else {
            System.out.println("Lỗi: Giá phải > 0");
            this.gia = 1; 
        }
    }
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Lỗi: Số lượng phải >= 0");
            this.soLuong = 0; 
        }
    }
    public double tinhThanhTien() {
        return gia * soLuong;
    }
    public void hienThiThongTin() {
        System.out.println("Mã SP: " + maSP);
        System.out.println("Tên SP: " + tenSP);
        System.out.println("Giá: " + gia);
        System.out.println("Số lượng: " + soLuong);
    }
}
