package thi.PhanLapCong;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) throws IOException {
		FileInputStream fInput = new FileInputStream("diem.txt");
        InputStreamReader ipReader = new InputStreamReader(fInput);
        BufferedReader br = new BufferedReader(ipReader);
        
        String line;
        System.out.println("Danh sach sinh vien doc duoc tu file: ");
        ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();
        while ((line = br.readLine()) != null) {
            String[] arr = line.split(";");

            SinhVien sv = new SinhVien(arr[0].trim(),Double.parseDouble(arr[1].trim()));
            dssv.add(sv);
        }
        br.close();
        for (SinhVien sv : dssv) {
        	System.out.println(sv.getHoTen() + " - " + sv.getDtb());
		}
        SinhVien svMax = dssv.get(0);
        for (SinhVien sv : dssv) {
        	if(sv.getDtb() > svMax.getDtb()) {svMax = sv;}
		}
        System.out.println("Sinh vien co diem trung binh lon nhat: ");
        System.out.println(svMax.getHoTen() + " - " + svMax.getDtb());
        
        FileOutputStream fOutput = new FileOutputStream("diemGioi.txt");
        OutputStreamWriter opWriter = new OutputStreamWriter(fOutput);
        BufferedWriter bw = new BufferedWriter(opWriter);
        System.out.println("Cac sinh vien co diem trung binh gioi(>=8): ");
        for (SinhVien sv : dssv) {
			if(sv.getDtb() >= 8) bw.write(sv.getHoTen() + " - " + sv.getDtb());
		}
	}

}
