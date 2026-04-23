package thigk2.PhanLapCong;

import java.io.*;
import java.util.*;

public class DocFile {
	//Tóm tắt cách giải:
	//1. khởi tạo 1 ds array list kiểu Double
	//2. sử dụng các lớp cần thiết để đọc file "so.txt"
	//3. sử dụng vòng lặp để đọc tất cả các dòng trong file, thêm từng dòng đọc được vào ds và chuyển từ
	//string thành kiểu double thông qua phương thức Parse của lớp Double
	//4. sử dụng for-each để in ra ds số thực
	//5. khởi tạo biến X, biến timThay rồi duyệt từng phần tử x trong ds số với điều kiện x == X, nếu đúng
	//thì chuyển biến timThay thành true rồi break
	//6. xét biến timThay nếu true thì in ra có giá trị còn false thì ngược lại
	
    public static void main(String[] args) throws Exception {

        ArrayList<Double> ds = new ArrayList<Double>();
        
        FileInputStream fInput = new FileInputStream("so.txt");
        InputStreamReader ipReader = new InputStreamReader(fInput);

        BufferedReader br = new BufferedReader(ipReader);
        String line;

        while ((line = br.readLine()) != null) {
            ds.add(Double.parseDouble(line));
        }
        br.close();

        System.out.println("Danh sách số thực:");
        for (double x : ds) {
            System.out.println(x);
        }
        
        double X = 27;

        boolean timThay = false;

        for (double x : ds) {
            if (x == X) {
                timThay = true;
                break;
            }
        }

        if (timThay)
            System.out.println("Có giá trị " + X + " trong danh sách");
        else
            System.out.println("Không có giá trị " + X + " trong danh sách");
    }
}
