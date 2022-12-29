import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		croatiaAlpabat();

	}
	
	public static void croatiaAlpabat() {
		BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
		BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		

		try {
			String str = br.readLine();
			
			String newStr = str.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", "x");
			
			System.out.println(newStr.length());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
	}
	
}
