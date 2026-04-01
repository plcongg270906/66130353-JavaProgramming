package ntu.plcong;

public class HocSinh {
	private String tenHS;
	private short tuoiHS;
	private String lopHS;
	public String getTenHS() {
		return tenHS;
	}
	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}
	public short getTuoiHS() {
		return tuoiHS;
	}
	public void setTuoiHS(short tuoiHS) {
		this.tuoiHS = tuoiHS;
	}
	public String getLopHS() {
		return lopHS;
	}
	public void setLopHS(String lopHS) {
		this.lopHS = lopHS;
	}
	public HocSinh() {
		
	}
	public HocSinh(String tenHS, short tuoiHS, String lopHS) {
		super();
		this.tenHS = tenHS;
		this.tuoiHS = tuoiHS;
		this.lopHS = lopHS;
	}
	@Override
	public String toString() {
		return String.format("Họ Tên: %s\nTuổi: %d\nLớp: %s", tenHS,tuoiHS,lopHS);
	}
	
}
