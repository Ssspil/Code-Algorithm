import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		avg();
	}
	
	static void avg() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			for(int j = 0; j < cycle; j ++) {
			
				int sum = 0;
				double avg = 0.0;
				int count = 0;
				
				StringTokenizer stn = new StringTokenizer(br.readLine(), " ");
				
				int n = Integer.parseInt(stn.nextToken());
				int[] iArr = new int[n];
				
				for(int i = 0; i < n; i++) {
					iArr[i] = Integer.parseInt(stn.nextToken());
					sum += iArr[i];
				}
				
				avg = (double) sum / n;
				
				for(int i = 0; i < n; i++) {
					if(iArr[i] > avg) {
						count++;
					}
				}
				double result = ((double)count / n) * 100;
				
				System.out.printf("%.3f%%\n", result);
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
