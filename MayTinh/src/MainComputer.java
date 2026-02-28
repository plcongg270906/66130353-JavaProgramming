
public class MainComputer {

	public static void main(String[] args) {
		Computer mtinh = new Computer();
		mtinh.hang = "Lenovo";
		mtinh.ram = 16;
		mtinh.oCung = 512;
		mtinh.gia = 25990000;
		
		System.out.println("Kiểm tra cấu hình");
		mtinh.kiemTraCauHinh();
		
		if(mtinh.coTheChoiGame()) System.out.println("Máy tính này có thể chơi game");
		else System.out.println("Máy tính này không thể chơi game");
		
		System.out.println("Tiền thuế: " + mtinh.tinhThue() + " Đồng");
	}

}
