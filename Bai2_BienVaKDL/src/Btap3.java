
public class Btap3 {

	public static void main(String[] args) {
		double height = 1.72;
		double weight = 60.5;
		
		double bmi = weight / (height*height);
		
		System.out.println("Chiều cao: " + height + " m");
		System.out.println("Cân nặng: " + weight + " kg");
		System.out.println("Chỉ số BMI: " + bmi);
		
		if(bmi < 18.5)
			System.out.println("Phân loại: Thiếu cân");
		else if(bmi < 25)
			System.out.println("Phân loại: Bình thường");
		else if(bmi <30)
			System.out.println("Phân loại: Thừa cân");
		else
			System.out.println("Phân loại: Béo phì");
	}

}
