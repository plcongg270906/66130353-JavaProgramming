import java.util.Scanner;

public class BTVN_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập vào số giờ làm (giờ): ");
		double soGio = sc.nextDouble();
		System.out.print("Nhập vào số lương theo giờ (đồng): ");
		double luongTheoGio= sc.nextDouble();
		
		double tongLuong = 0;
		if(soGio <= 40) {
			tongLuong = soGio * luongTheoGio;
		}else {
			tongLuong = luongTheoGio * (soGio - 40) * 1.5 + 40 * luongTheoGio;
		}
		
		System.out.println("Tổng lương: " + String.format("%.0f", tongLuong) + " đồng");
		
		sc.close();

	}

}
