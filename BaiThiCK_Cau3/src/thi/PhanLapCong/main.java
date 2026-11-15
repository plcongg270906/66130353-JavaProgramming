package thi.PhanLapCong;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
		ds.add(new NhanVien("NV01","Nguyen Van A",5000000));
		ds.add(new NhanVien("NV02","Nguyen Van B",7000000));
		ds.add(new NhanVien("NV03","Nguyen Thi C",6000000));
		System.out.println("Danh sach nhan vien: ");
		for (NhanVien nv : ds) {
			System.out.println(nv);
		}
		double luongMin = 5000000;
		System.out.println("Danh sach nhan vien co luong lon hon luongMin(5000000): ");
		for (NhanVien nv : ds) {
			if(nv.getLuong()>luongMin) System.out.println(nv);
		}
	}

}
