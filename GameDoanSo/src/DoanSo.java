import java.util.Scanner;
import java.util.Random;
public class DoanSo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String choiTiep;
		do {
			int soMayChon = rd.nextInt(100) + 1;
			int soLanToiDa = 10;
			int diem = 0;
			boolean doan = false;
			System.out.println("Máy đã chọn số từ 1-100");
			System.out.println("Bạn có 10 lần để đoán");
			
			for(int i = 1;i <= soLanToiDa;i++) {
				System.out.print("Lần đoán thứ "+ i+": ");
				int soBanDoan = sc.nextInt();
				
				if(soBanDoan == soMayChon) {
					System.out.println("Bạn đã đoán đúng");
					diem = (soLanToiDa - i + 1) * 10;
					System.out.println("Điểm của bạn: " + diem);
					doan = true;
					break;
				}else if(soBanDoan < soMayChon) {
					System.out.println("Lớn hơn");
				}else {
					System.out.println("Nhỏ hơn");
				}
			}
			if(doan == false) {
				System.out.println("Bạn đã hết số lần đoán");
				System.out.println("Điểm của bạn: " + diem);
				System.out.println("Số mà máy đã chọn: " + soMayChon);
			}
			System.out.println("Bạn có muốn chơi lại không (y/n):");
			choiTiep = sc.next();
		}while(choiTiep.equalsIgnoreCase("y"));
		System.out.println("Trò chơi đã kết thúc");
		sc.close();
	}

}
