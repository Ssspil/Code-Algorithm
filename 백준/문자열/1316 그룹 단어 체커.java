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

		groupCheck();

	}
	
	public static void groupCheck() {

		try {
			
			 
			int count = 0;
			int N = Integer.parseInt(br.readLine());
	 
			for (int i = 0; i < N; i++) {
				if (check()) {
					count++;
				}
			}
			System.out.print(count);			
			
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
	
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			
			
			if (prev != now) {		
				if (!check[now - 'a']) {
					check[now - 'a'] = true;
					prev = now;	
				}
				else {
					return false;	
				}
			}
		}    
		return true;
	}
}
