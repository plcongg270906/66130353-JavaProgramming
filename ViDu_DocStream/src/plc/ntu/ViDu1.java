package plc.ntu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViDu1 {

	public static void main(String[] args) throws IOException {
        InputStreamReader ipReader = new InputStreamReader(System.in);
        BufferedReader bufReader = new BufferedReader(ipReader);
        
        System.out.print("Nhập một chuỗi bất kỳ: ");
        String lineDocDuoc = bufReader.readLine();
        System.out.println(lineDocDuoc);

	}

}
