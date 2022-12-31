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

		economic();

	}
	
	public static void economic() {

		try {
			
			StringTokenizer stn = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(stn.nextToken());
			int b = Integer.parseInt(stn.nextToken());
			int c = Integer.parseInt(stn.nextToken());
			long count = 0;
			
			if(b < c) {
				count = (a / (c - b)) + 1;

			}else {
				count = -1;
			}

			bw.write(String.valueOf(count));
			
			
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
