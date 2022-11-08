// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		array();
	}
	
	static void array() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try {
            int n = Integer.parseInt(br.readLine());
            int[] IArr = new int[n];
            
            StringTokenizer stn = new StringTokenizer(br.readLine());
            
            for(int i = 0; i < n; i++){
                IArr[i] = Integer.parseInt(stn.nextToken());
            }
            
            int max = IArr[0];
            int min = IArr[0];
            
            for(int i = 0; i < n; i++){
                if(IArr[i] < min){
                    min = IArr[i];
                }
                
                if(max < IArr[i]) {
                    max = IArr[i];
                }
            }
            
            bw.write(min + " " + max);
          
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
