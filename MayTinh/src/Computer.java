
public class Computer {
	String hang;
	int ram;
	int oCung;
	int gia;
	
	void kiemTraCauHinh(){
		System.out.println("Hãng: " + hang);
		System.out.println("RAM: " + ram + " GB");
		System.out.println("Ổ cứng: " + oCung + " GB");
		System.out.println("Giá: " + gia + " Đồng");
	}
	
	boolean coTheChoiGame() {
		if(ram>=8) return true;
		else return false;
	}
	
	float tinhThue() {
		return gia * ((float) 10/100);
		
	}
}
