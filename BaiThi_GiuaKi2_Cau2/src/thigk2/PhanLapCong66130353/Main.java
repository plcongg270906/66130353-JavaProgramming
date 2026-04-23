package thigk2.PhanLapCong66130353;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	//Tóm tắt cách giải:
	//1. khởi tạo 1 array list danh sách sản phẩm gồm 3 sản phẩm
	//2. sử dụng for-each để in ra danh sách
	//3. tạo các biến cần thiết để nhập dữ liệu từ bàn phím rồi thêm các biến đó vào spMoi rồi add vào ds
	//4. sử dụng for-each để duyệt từng phần tử rồi sử dụng getLoaiSP và trim() để lấy chuỗi loại sp rồi so sánh với
	//chuỗi "Thực phẩm chức năng" qua phương thức equalsIgnoreCase

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
		
		dsSP.add(new SanPham("SP01", "Sữa tươi", "Đồ uống", 32000));
        dsSP.add(new SanPham("SP02", "Vitamin C", "Thực phẩm chức năng", 150000));
        dsSP.add(new SanPham("SP03", "Bánh quy", "Thực phẩm", 25000));
        
        System.out.println("Danh sách các sản phẩm:");
        for(SanPham sp : dsSP) {
        	System.out.println(sp.InThongTin());
        }
        
        System.out.println("Hãy nhập vào 1 sản phẩm mới");
        System.out.print("Nhập mã SP: ");
        String ma = sc.nextLine();

        System.out.print("Nhập tên SP: ");
        String ten = sc.nextLine();

        System.out.print("Nhập loại SP: ");
        String loai = sc.nextLine();

        System.out.print("Nhập giá SP: ");
        double gia = sc.nextDouble();

        SanPham spMoi = new SanPham(ma, ten, loai, gia);

        dsSP.add(spMoi);
        
        System.out.println("Danh sách các sản phẩm sau khi thêm mới:");
        for(SanPham sp : dsSP) {
        	System.out.println(sp.InThongTin());
        }
        
        System.out.println("Danh sách các sản phẩm thuộc loại Thực phẩm chức năng:");
        for(SanPham sp : dsSP) {
        	if(sp.getLoaiSP().trim().equalsIgnoreCase("Thực phẩm chức năng"))
        	System.out.println(sp.InThongTin());
        }
        
        sc.close();
	}

}
