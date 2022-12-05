import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		pro();
	}
	
	static void pro() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = 0;
		
		try {
			num = Integer.parseInt(br.readLine());
			
			for(int j = 0; j < num; j++) {
				int sum = 0;
				String str = br.readLine();
				
				StringTokenizer stn = new StringTokenizer(str, "X");
	
				while (stn.hasMoreElements()) {
					String auth =  stn.nextToken();
					
					int score = auth.length();
					
					for(int i = 1; i <= score; i++) {
						sum += i;
					}
				}
				
				bw.write(String.valueOf(sum + "\n"));
			}
			
	    } catch (NumberFormatException e) {
	    	e.printStackTrace();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    } catch (Exception e){
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
