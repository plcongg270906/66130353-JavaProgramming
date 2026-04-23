package thigk2.PhanLapCong;

import java.io.*;
import java.util.*;

public class DocFile {
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

    }
}
