package plcong.ntu;

public class Run {
	public static void main(String[] args) {
        
        // In ra tên trường của sinh viên NTU
        System.out.println(SinhVienNTU.TEN_TRUONG);
        // In ra Hi, ...
        SinhVienNTU.sayHi();
        
        SinhVienNTU sv1 = new SinhVienNTU("Mai Cường Thọ", "KHMT-13");
        SinhVienNTU sv2 = new SinhVienNTU("Phan Lập Công", "66.CNTT-1");
        
        sv1.sayHello();
        sv2.sayHello();
        
    }
}
