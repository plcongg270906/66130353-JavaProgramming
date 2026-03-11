
public class ChuNhat {
	private double dai;
	private double rong;
	
	public ChuNhat() {
		dai=10;
		rong=5;
	}
	public ChuNhat(double dai, double rong) {
		this.dai = dai;
		this.rong = rong;
	}
	
	double getDai() {
		return dai;
	}
	double getRong() {
		return rong;
	}
	
	void setDai(double daiM) {
		dai = daiM;
	}
	void setRong(double rongM) {
		rong = rongM;
	}
	public String toString() {
		String s = "Hình này có chiều dài = ";
		s+= dai;
		s+= " và chiều rộng = " + rong;
		return s;
	}
}
