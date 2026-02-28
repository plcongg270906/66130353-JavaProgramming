import java.util.Scanner;
public class MainBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Bank tk1 = new Bank();
		tk1.soTaiKhoan = "1234";
		tk1.tenChuTaiKhoan = "C";
		tk1.soDu = 1000000;
		
		Bank tk2 = new Bank();
		tk2.soTaiKhoan = "4321";
		tk2.tenChuTaiKhoan = "T";
		tk2.soDu = 1000000;
		
		System.out.print("Nhập số tiền bạn muốn gửi vào bank (VND): ");
		double soTien1 = sc.nextDouble();
		tk1.guiTien(soTien1);
		tk1.hienThiSoDu();
		
		System.out.print("Nhập số tiền bạn muốn rút: ");
		double soTien2 = sc.nextDouble();
		if(tk1.rutTien(soTien2)) {
			System.out.println("Bạn đã rút thành công " + soTien2);
			tk1.hienThiSoDu();
		}else {
			System.out.println("Số dư của bạn không đủ để thực hiện rút tiền");
		}
		
		System.out.print("Nhập số tiền bạn muốn chuyển vào tài khoản " + tk2.soTaiKhoan + ": ");
		double soTien3 = sc.nextDouble();
		tk1.chuyenTien(tk2, soTien3);
		tk1.hienThiSoDu();
		
		sc.close();
	}

}
