
public class Btap4 {
	
	public static void main(String args[]) {
		int soDien = 250;
		double tienDien = 0;
		
		if(soDien <= 50) {
			tienDien = 1.678 * soDien;
		}else if(soDien <= 100) {
			tienDien = 1.734 * (soDien - 50) + 50 * 1.678;
		}else if(soDien <= 200) {
			tienDien = 2.014 * (soDien - 100) + 50 * 1.734 + 50 * 1.678;
		}else if(soDien <= 300) {
			tienDien = 2.536 * (soDien - 200) + 100 * 2.014 + 50 * 1.734 + 50 * 1.678;
		}else {
			tienDien = 2.834 * (soDien - 300) + 100 * 2.536 + 100 * 2.014 + 50 * 1.734 + 50 * 1.678;
		}
		
		System.out.println("Số điện: " + soDien + " kWh");
		System.out.println("Tiền điện: " + tienDien + " đồng");
		System.out.println("Tiền điện (VND): " + String.format("%.0f", tienDien) + " đồng");
	}
	
}
