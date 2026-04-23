package thigk2.PhanLapCong66130353;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
		
		dsSP.add(new SanPham("SP01", "Sữa tươi", "Đồ uống", 32000));
        dsSP.add(new SanPham("SP02", "Vitamin C", "Thực phẩm chức năng", 150000));
        dsSP.add(new SanPham("SP03", "Bánh quy", "Thực phẩm", 25000));

	}

}
