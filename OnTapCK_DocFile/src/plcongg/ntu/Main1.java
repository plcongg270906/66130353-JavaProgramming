package plcongg.ntu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fInput = new FileInputStream("dssv.txt");
        InputStreamReader ipReader = new InputStreamReader(fInput);
        BufferedReader br = new BufferedReader(ipReader);
        
        String line;
        System.out.printf("%-5s %-25s %-10s %-10s\n",
                "STT", "Họ_Tên", "Năm_Sinh", "Giới_Tính");
        ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();
        while ((line = br.readLine()) != null) {
            String[] arr = line.split(";");

            SinhVien sv = new SinhVien(Integer.parseInt(arr[0].trim()),arr[1].trim(),Integer.parseInt(arr[2].trim()),arr[3].trim());
            dssv.add(sv);
        }
        br.close();
        for (SinhVien sv : dssv) {
        	System.out.printf("%-5d %-25s %-10d %-10s\n", sv.getStt(),sv.getHoTen(), sv.getNamSinh(), sv.getGioiTinh());
		}
        System.out.printf("\nSố lượng sinh viên: %d", dssv.size());
        System.out.println("\nDanh sách các sv sinh năm 2006:");
        System.out.printf("%-5s %-25s %-10s %-10s\n",
                "STT", "Họ_Tên", "Năm_Sinh", "Giới_Tính");
        for (SinhVien sv : dssv) {
			if(sv.getNamSinh() == 2006) {
				System.out.printf("%-5d %-25s %-10d %-10s\n", sv.getStt(),sv.getHoTen(), sv.getNamSinh(), sv.getGioiTinh());
			}
		}
        System.out.println("\nDanh sách các sv sinh nữ:");
        System.out.printf("%-5s %-25s %-10s %-10s\n",
                "STT", "Họ_Tên", "Năm_Sinh", "Giới_Tính");
        for (SinhVien sv : dssv) {
			if(sv.getGioiTinh().toLowerCase().equals("nữ")) {
				System.out.printf("%-5d %-25s %-10d %-10s\n", sv.getStt(),sv.getHoTen(), sv.getNamSinh(), sv.getGioiTinh());
			}
		}
        dssv.sort((a,b) -> {
        	String[] arrA = a.getHoTen().trim().split(" ");
        	String[] arrB = b.getHoTen().trim().split(" ");
        	
        	String tenA = arrA[arrA.length - 1];
        	String tenB = arrB[arrB.length - 1];
        	
        	return tenA.compareToIgnoreCase(tenB);
        });
        System.out.println("\nDanh sách các sv sắp xếp tăng dần theo tên:");
        System.out.printf("%-5s %-25s %-10s %-10s\n",
                "STT", "Họ_Tên", "Năm_Sinh", "Giới_Tính");
        for (SinhVien sv : dssv) {
        	System.out.printf("%-5d %-25s %-10d %-10s\n", sv.getStt(),sv.getHoTen(), sv.getNamSinh(), sv.getGioiTinh());
		}
	}

}
