import java.util.Scanner;
public class BTVN_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập số tiền: ");
        double soTien = sc.nextDouble();

        System.out.print("Nhập loại tiền (USD/EUR): ");
        String loaiTien = sc.next();

        double vnd = 0;

        if (loaiTien.equalsIgnoreCase("USD")) {
            vnd = soTien * 23500;
        } else if (loaiTien.equalsIgnoreCase("EUR")) {
            vnd = soTien * 27000;
        } else {
            System.out.println("Loại tiền không hợp lệ!");
            sc.close();
            return;
        }

        System.out.println("Số tiền quy đổi: " + String.format("%.0f", vnd) + " VND");

        sc.close();
	}

}
