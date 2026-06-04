package plcongg.ntu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		FileInputStream fInput = new FileInputStream("dssv.txt");
        

        InputStreamReader ipReader = new InputStreamReader(fInput);

        BufferedReader br = new BufferedReader(ipReader);
        String line;
        System.out.printf("%-5s %-25s %-10s %-10s\n",
                "STT", "Ho_Ten", "Nam_Sinh", "Gioi_Tinh");

        while ((line = br.readLine()) != null) {
            String[] arr = line.split(";");

            System.out.printf("%-5s %-25s %-10s %-10s\n",
                    arr[0].trim(),
                    arr[1].trim(),
                    arr[2].trim(),
                    arr[3].trim());
        }
        br.close();
	}

}
