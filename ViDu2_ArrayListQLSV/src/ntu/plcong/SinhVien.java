package ntu.plcong;


// Lớp SinhVien
class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemTB;
    
    public SinhVien(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
    
    // Getter
    public String getMaSV() { return maSV; }
    public String getHoTen() { return hoTen; }
    public double getDiemTB() { return diemTB; }
    
    @Override
    public String toString() {
        return String.format("Mã: %s\nHọ tên: %s\nĐiểm trung bình: %.2f", maSV,hoTen,diemTB);
    }
}

