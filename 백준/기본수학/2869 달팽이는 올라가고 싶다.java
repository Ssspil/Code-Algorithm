import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
	static BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) {

		result();

	}
	
	
	public static void result() {

		try {
			
			StringTokenizer stn = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(stn.nextToken());
			int b = Integer.parseInt(stn.nextToken());
			int v = Integer.parseInt(stn.nextToken());
			
			double calc = Math.ceil(  (double)(v - b) / (a - b));
			
			System.out.println((int)calc);

			

			/*
			 * 1 : 2 - 1  1
			 * 2 : 3 - 1 2
			 * 3 : 4 - 1 3 
			 * 4 : 5      
			 */
			
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
