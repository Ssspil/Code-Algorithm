import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
	static BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) {

		result();

	}
	
	public static void result() {

		try {
			
			int[][] apart = new int[15][15];
			
			for(int i = 1; i < 15; i++) {
				apart[0][i] = i;
			}
			
			int cycle = Integer.parseInt(br.readLine());
			for(int q = 0; q < cycle; q++) {
				
				int k = Integer.parseInt(br.readLine());
				int n = Integer.parseInt(br.readLine());
				
				for(int i = 1; i < 15; i++) {	
					for(int j = 1; j < 15; j++) {		
						apart[i][j] = apart[i-1][j] + apart[i][j-1];
						
					}
				}
				
				bw.write(String.valueOf(apart[k][n])+"\n");
			}
			

			
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
