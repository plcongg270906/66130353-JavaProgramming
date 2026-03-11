
public class Main {

	public static void main(String[] args) {
		Diem A = new Diem(1, 2);  
        Diem B = new Diem();   
        Diem C = new Diem(3, 4);   
        Diem D = new Diem(3, 4);       
        
        System.out.println("Tọa độ A: (" + A.getX() + ", " + A.getY() + ")");
        System.out.println("Tọa độ B: " + B.toString());
        System.out.printf("Khoảng cách giữa A và B: %.2f", A.tinhKhoangCach(B));
        System.out.println("\nA có trùng với B không? ");
        if(A.kiemTraTrungNhau(B)) System.out.println("Có");
        else System.out.println("Không");
        System.out.println("C có trùng với D không? ");
        if(C.kiemTraTrungNhau(D)) System.out.println("Có");
        else System.out.println("Không");
        
        Diem ADoiXung = A.doiXungQuaGoc();
        System.out.println("Điểm đối xứng của A qua gốc tọa độ là: " + ADoiXung.toString());
	}

}
