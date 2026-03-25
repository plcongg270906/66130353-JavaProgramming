package ntu.plcong;

public class Main {

	public static void main(String[] args) {
		HinhChuNhat h1 = new HinhChuNhat("Hinh chu nhat","Do", 4, 5);
		HinhTron h2 = new HinhTron("Hinh tron","Xanh", 3);
		HinhTamGiac h3 = new HinhTamGiac("Hinh tam giac","Vang", 3, 4, 5);
		HinhTamGiac h4 = new HinhTamGiac("Hinh tam giac","Vang", 10, 2, 2);
		
		h1.hienThiThongTin();
		System.out.println("=======================");
		h2.hienThiThongTin();
		System.out.println("=======================");
		h3.hienThiThongTin();
		System.out.println("=======================");
		h4.hienThiThongTin();
		
	}

}
