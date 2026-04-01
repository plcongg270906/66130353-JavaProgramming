package ntu.plcong;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HocSinh hs1 = new HocSinh();
		hs1.setTenHS("Nguyễn Văn A");
		short tuoiHS1 = 14;
		hs1.setTuoiHS(tuoiHS1);
		hs1.setLopHS("8/1");
		
		HocSinh hs2 = new HocSinh("Nguyễn Văn B", (short)15, "9/1");
		
		System.out.println(hs1);
		System.out.print("Tên của HS2: " + hs2.getTenHS());
		System.out.print("\nTuổi của HS2: " + hs2.getTuoiHS());
		System.out.print("\nLớp của HS2: " + hs2.getLopHS());
		
		Scanner sc = new Scanner(System.in);
		HocSinh hs3 = new HocSinh();
		System.out.print("\nNhập vào tên của học sinh 3: ");
		String tenHS3 = sc.nextLine();
		hs3.setTenHS(tenHS3);
		System.out.print("Nhập vào tuổi của học sinh 3: ");
		short tuoiHS3 = sc.nextShort();
		sc.nextLine();
		hs3.setTuoiHS(tuoiHS3);
		System.out.print("Nhập vào lớp của học sinh 3: ");
		String lopHS3 = sc.nextLine();
		hs3.setLopHS(lopHS3);
		System.out.println(hs3);
		
		ArrayList<HocSinh> ds = new ArrayList<HocSinh>();
		System.out.print("Mời bạn nhập số lượng học sinh: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			HocSinh hs = new HocSinh();
			System.out.printf("\nNhập vào tên của học sinh %d: ", i+1);
			String tenHS = sc.nextLine();
			hs.setTenHS(tenHS);
			System.out.printf("Nhập vào tuổi của học sinh %d: ", i+1);
			short tuoiHS = sc.nextShort();
			sc.nextLine();
			hs.setTuoiHS(tuoiHS);
			System.out.printf("Nhập vào lớp của học sinh %d: ",i+1);
			String lopHS = sc.nextLine();
			hs.setLopHS(lopHS);
			ds.add(hs);
		}
		System.out.println("Danh sách học sinh vừa nhập: ");
		for (HocSinh hs : ds) {
			System.out.println(hs);
		}
		
		HocSinh hs4 = new HocSinh();
		System.out.print("\nNhập vào tên của học sinh muốn bổ sung: ");
		String tenHS = sc.nextLine();
		hs4.setTenHS(tenHS);
		System.out.print("Nhập vào tuổi của học sinh muốn bổ sung: ");
		short tuoiHS = sc.nextShort();
		sc.nextLine();
		hs4.setTuoiHS(tuoiHS);
		System.out.print("Nhập vào lớp của học sinh muốn bổ sung: ");
		String lopHS = sc.nextLine();
		hs4.setLopHS(lopHS);
		ds.add(hs4);
		System.out.println("\nDanh sách học sinh sau khi bổ sung: ");
		for (HocSinh hs : ds) {
			System.out.println(hs);
		}
		
		boolean check = false;
		for(int i=0;i<ds.size();i++) {
			HocSinh hs = ds.get(i);
			if(hs.getTenHS().equalsIgnoreCase("Hoa")) {
				ds.remove(hs);
				check = true;
				break;
			}
		}
		if(check) System.out.println("Đã tìm thấy bạn tên Hoa trong danh sách đã nhập và xóa");
		else System.out.println("Không tìm thấy bạn nào tên Hoa trong danh sách đã nhập");
		System.out.println("\nIn lại danh sách: ");
		for (HocSinh hs : ds) {
			System.out.println(hs);
		}
		sc.close();
	}

}
