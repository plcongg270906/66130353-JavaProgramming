package thigk2.PhanLapCong66130353;

import java.util.Scanner;

public class HinhChuNhat {
	//Tóm tắt cách giải:
	//1. hỏi người dùng về thông tin về tọa độ của các góc đề yêu cầu
	//2. tính chiều dài và rộng bằng công thức |x2-x1| và |y2-y1|
	//3. tính diện tích và chu vi của hình chữ nhật
	//4. xuất ra màn hình

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập vào tọa độ x1 của góc trên trái của hình chữ nhật: ");
		double x1 = sc.nextDouble();
		System.out.print("Nhập vào tọa độ y1 của góc trên trái của hình chữ nhật: ");
		double y1 = sc.nextDouble();
		
		System.out.print("Nhập vào tọa độ x2 của góc dưới phải của hình chữ nhật: ");
		double x2 = sc.nextDouble();
		System.out.print("Nhập vào tọa độ y2 của góc dưới phải của hình chữ nhật: ");
		double y2 = sc.nextDouble();
		
		double chieuDai = Math.abs(x2 - x1);
		double chieuRong = Math.abs(y2 - y1);
		
		double chuVi = (chieuDai + chieuRong) * 2;
		double dienTich = chieuDai * chieuRong;
		
		System.out.println("Chu vi của hình chữ nhật là: " + chuVi);
		System.out.println("Diện tích của hình chữ nhật là: " + dienTich);
	}

}
