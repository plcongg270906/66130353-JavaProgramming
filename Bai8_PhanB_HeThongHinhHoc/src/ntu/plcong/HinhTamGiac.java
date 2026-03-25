package ntu.plcong;

public class HinhTamGiac extends HinhHoc{
	private double canhA;
	private double canhB;
	private double canhC;
	public double getCanhA() {
		return canhA;
	}
	public void setCanhA(double canhA) {
		this.canhA = canhA;
	}
	public double getCanhB() {
		return canhB;
	}
	public void setCanhB(double canhB) {
		this.canhB = canhB;
	}
	public double getCanhC() {
		return canhC;
	}
	public void setCanhC(double canhC) {
		this.canhC = canhC;
	}
	public HinhTamGiac(String ten, String mauSac, double canhA, double canhB, double canhC) {
		super(ten, mauSac);
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
	}
	public boolean kiemTraHopLe() {
		return canhA+canhB>canhC && canhA+canhC>canhB && canhC+canhB>canhA; 
	}
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Canh A: " + canhA);
		System.out.println("Canh B: " + canhB);
		System.out.println("Canh C: " + canhC);
		System.out.println("3 canh co tao thanh tam giac khong? " + kiemTraHopLe());
	}
}
