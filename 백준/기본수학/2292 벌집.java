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
			
			int goal = Integer.parseInt(br.readLine());
			int count = 1; // 겹 수 (최소 루트)
			int range = 2; // 범위 (최솟값 기준)
			
			if(goal == 1) {
				System.out.println(1);
				return;
			}else {
				while (range <= goal) {	// 범위가 N보다 커지기 직전까지 반복 
					range = range + (6 * count);
					count++;
				}
				System.out.print(count);
			}

			/*
			 * 2 : 2~7
			 * 3 : 8~19
			 * 4 : 20~37
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
