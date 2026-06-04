package plcongg.ntu;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<test> ds = new ArrayList<test>();
		System.out.print("Nhập vào số lượng danh sách sv: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			test sv = new test();
			sc.nextLine();
			System.out.printf("Nhập vao mã sv thứ %d: ",i+1);
			String ma = sc.nextLine();
			sv.setMaSV(ma);
			System.out.printf("Nhập vao họ tên sv thứ %d: ",i+1);
			String ho = sc.nextLine();
			sv.setHoTen(ho);
			System.out.printf("Nhập vao dtb sv thứ %d: ",i+1);
			double diem =sc.nextDouble();
			sv.setDtb(diem);
			ds.add(sv);
		}
		for (test sv : ds) {
			System.out.println(sv);
		}
		boolean timThay = false;
		for (test sv : ds) {
			if(sv.getMaSV().trim().equalsIgnoreCase("1")) {
				System.out.println("Đã tìm thấy sv có mã 1:");
				System.out.println(sv);
				timThay = true;
				break;
			}
		}
		if(!timThay) System.out.println("Không tìm thấy sv có mã 1");
		test svMax = ds.get(0);
		for (test sv : ds) {
			if(sv.getDtb() > svMax.getDtb()) {
				svMax = sv;
			}
		}
		System.out.println("Sinh viên có điểm cao nhất: ");
		System.out.println(svMax);
		for (int i=0;i<ds.size();i++) {
			if(ds.get(i).getMaSV().trim().equalsIgnoreCase("2")) {
				ds.remove(i);
				break;
			}
		}
		System.out.println("Danh sách sv sau khi xóa sinh vien có mã 2: ");
		for (test sv : ds) {
			System.out.println(sv);
		}
		System.out.println("Nhập vào sv mới: ");
		test svnew = new test();
		sc.nextLine();
		System.out.printf("Nhập vao mã sv thứ: ");
		String ma = sc.nextLine();
		svnew.setMaSV(ma);
		System.out.printf("Nhập vao họ tên sv thứ: ");
		String ho = sc.nextLine();
		svnew.setHoTen(ho);
		System.out.printf("Nhập vao dtb sv thứ: ");
		double diem =sc.nextDouble();
		svnew.setDtb(diem);
		for (int i=0;i<ds.size();i++) {
			if(ds.get(i).getMaSV().trim().equalsIgnoreCase("3")) {
				ds.add(i, svnew);
				break;
			}
		}
		System.out.println("Danh sách sv sau khi thêm sv mới vào vị trí sv có mã 3: ");
		for (test sv : ds) {
			System.out.println(sv);
		}
		ds.sort((a,b) -> Double.compare(b.getDtb(), a.getDtb()));
		System.out.println("Danh sách sv sau sắp xếp giảm dần theo điểm: ");
		for (test sv : ds) {
			System.out.println(sv);
		}
		ds.sort((a,b) -> a.getMaSV().compareTo(b.getMaSV()));
		
		System.out.println("Danh sách sv sau sắp xếp tăng dần theo mã sv: ");
		for (test sv : ds) {
			System.out.println(sv);
		}
		//Một số dạng khác:
//		int xeCon = 0;
//		int xeTai = 0;
//
//		for(Xe x : ds){
//		    if(x instanceof XeCon)
//		        xeCon++;
//		    else if(x instanceof XeTai)
//		        xeTai++;
//		}
		//Dạng xóa phần tử trùng
//		for(int i = 0; i < ds.size(); i++){
//		    for(int j = i + 1; j < ds.size(); j++){
//		        if(ds.get(i).getMaSV()
//		                .equalsIgnoreCase(ds.get(j).getMaSV())){
//		            ds.remove(j);
//		            j--;
//		        }
//		    }
//		}
	}

}
