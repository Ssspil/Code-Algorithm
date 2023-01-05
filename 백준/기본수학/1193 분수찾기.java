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
			
			int n = Integer.parseInt(br.readLine());
			int count = 0;	
			int finish = 0;
			
			while(true) {
				count++;
				if(count % 2 == 1) {
					// 홀수 일 경우
					int num = count;
					for(int i = 1; i <= count; i++) {
						
						finish++;
						if(finish == n) {
							System.out.println(num + "/" +  i);
							return;
						}
						num--;
						
					}
					
				} else {
					// 짝수 일 경우
					int num = count;
					for(int i = 1; i <= count; i++) {
						
						finish++;
						if(finish == n) {
							System.out.println(i + "/" +  num);
							return;
						}
						num--;
					}
				}
				
				if(count == n) {
					return;
				}
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
	
