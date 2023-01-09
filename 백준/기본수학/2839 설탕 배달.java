import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {

		result();
	}
	
	public static void result() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			
			if (N == 4 || N == 7) {
				System.out.println(-1);
			}
			else if (N % 5 == 0) {
				System.out.println(N / 5);
			}
			else if (N % 5 == 1 || N % 5 == 3) {
				System.out.println((N / 5) + 1);
			}
			else if (N % 5 == 2 || N % 5 == 4) {
				System.out.println((N / 5) + 2);
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
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
