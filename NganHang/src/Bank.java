
public class Bank {
	String soTaiKhoan;
    String tenChuTaiKhoan;
    double soDu;
    
    void guiTien(double soTien) {
        soDu+=soTien;
        System.out.println("Bạn đã gửi thành công " + soTien + " VND");
    }
    
    boolean rutTien(double soTien) {
        if(soDu<soTien) return false;
        else {
        	soDu-=soTien;
        	return true;
        }
    }
    
    void chuyenTien(Bank taiKhoanKhac, double soTien) {
    	if(soTien > soDu) {
    		System.out.println("Số dư của bạn không đủ để chuyển tiền");
    		return;
    	}
    	else {
    		soDu-=soTien;
    		taiKhoanKhac.soDu += soTien;
    		System.out.println("Bạn đã chuyển tiền thành công đến tài khoản " + taiKhoanKhac.soTaiKhoan);
    	}
    	
    }
    
    void hienThiSoDu() {
    	System.out.println("Số dư hiện tại: " + soDu + " VND");
    }
}
