import java.util.Scanner;
public class BTVN_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Phương trình: ax + b = 0");
		System.out.print("Nhập vào hệ số a: ");
		double a = sc.nextDouble();
		System.out.print("Nhập vào hệ số b: ");
		double b = sc.nextDouble();
		
		double x;
		if(a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		}else if(a == 0 && b == 0) {
			System.out.println("Phương trình vô số nghiệm");
		}else {
			x = -b /a;
			System.out.println("Phương trình có nghiệm x = " + x);
		}
		sc.close();
	}

}
