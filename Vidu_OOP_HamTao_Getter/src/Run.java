
public class Run {

	public static void main(String[] args) {
		ChuNhat cn1 = new ChuNhat(); // Tạo HCN dai=10 rong=5
		ChuNhat cn2 = new ChuNhat(20,15); // Tạo HCN dai=20 rong =15
		ChuNhat hv = new ChuNhat(20,20); // Tạo HV cạnh=20
		
		double cn1_dai = cn1.getDai();
		double cn1_rong = cn1.getRong();
		
		double cn2_dai = cn2.getDai();
		double cn2_rong = cn2.getRong();
		System.out.print("Hình CN1 có chiều dài: " + cn1_dai);
		System.out.print("\nHình CN1 có chiều rộng: " + cn1_rong);
		
		cn1.setDai(50);
		cn1_dai = cn1.getDai();
		cn1_rong = cn1.getRong();
		System.out.print("\nSau khi thay đổi chiều dài\n");
		System.out.print("Hình CN1 có chiều dài: " + cn1_dai); 
		System.out.print("\nHình CN1 có chiều rộng: " + cn1_rong);
		
		System.out.print("\n" + cn2.toString());
	}

}
