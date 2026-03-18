package ntu.plcong;

import java.util.ArrayList;
import java.util.List;

public class QuanLySanPham {
	private List<SanPham> danhSachSP;
	
	public QuanLySanPham() {
		danhSachSP = new ArrayList<>();
	}
	public void themSanPham(SanPham sp) {
		danhSachSP.add(sp);
		System.out.println("Đã thêm: " + sp.getTenSP());
	}
	public boolean xoaTheoMa(String maSP) {
		for(int i=0;i<danhSachSP.size();i++) {
			if(danhSachSP.get(i).getMaSP().equals(maSP)) {
				SanPham spBiXoa = danhSachSP.remove(i);
				System.out.println("Đã xóa: " + spBiXoa.getTenSP());
				return true;
			}
		}
		System.out.println("Không tìm thấy sản phẩm với mã: " + maSP);
		return false;
	}
	public void hienThiDanhSach() {
		if(danhSachSP.isEmpty()) {
			System.out.println("Danh sách sản phẩm trống");
			return;
		}
		System.out.println("\n=== DANH SÁCH SẢN PHẨM ===");
        System.out.println(String.format("%-6s %-25s %-15s %-10s",
            "Mã SP", "Tên SP", "Gia","Số Lượng"));
        System.out.println("=".repeat(60));
        
        for (int i = 0; i < danhSachSP.size(); i++) {
            SanPham sp = danhSachSP.get(i);
            System.out.println(String.format("%-6s %-25s %,-15.0f %-10d",
                sp.getMaSP(), sp.getTenSP(), sp.getGia(), sp.getSoLuong()));
        }
	}
	public List<SanPham> timTheoTen(String tuKhoa) {
	    List<SanPham> ketQua = new ArrayList<>();
	    
	    for (SanPham sp : danhSachSP) {
	        if (sp.getTenSP().toLowerCase().contains(tuKhoa.toLowerCase())) {
	            ketQua.add(sp);
	        }
	    }
	    
	    return ketQua;
	}
	public void sapXepGiaTangDan() {
	    for (int i = 0; i < danhSachSP.size() - 1; i++) {
	        for (int j = 0; j < danhSachSP.size() - i - 1; j++) {
	            if (danhSachSP.get(j).getGia() > danhSachSP.get(j + 1).getGia()) {
	                SanPham temp = danhSachSP.get(j);
	                danhSachSP.set(j, danhSachSP.get(j + 1));
	                danhSachSP.set(j + 1, temp);
	            }
	        }
	    }
	}
	public double tongGiaTriKho() {
	    double tong = 0;
	    
	    for (SanPham sp : danhSachSP) {
	        tong += sp.getGia() * sp.getSoLuong();
	    }
	    
	    return tong;
	}
	public List<SanPham> sapHetHang() {
	    List<SanPham> ketQua = new ArrayList<>();
	    
	    for (SanPham sp : danhSachSP) {
	        if (sp.getSoLuong() < 10) {
	            ketQua.add(sp);
	        }
	    }
	    
	    return ketQua;
	}
	
}
