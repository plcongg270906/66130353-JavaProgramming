package plc.ntu;
import java.io.*;
public class DtoS {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\testUnicode.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while((s = br.readLine()) != null)
        {
            System.out.println(s);
        }
        fr.close();
	}

}
