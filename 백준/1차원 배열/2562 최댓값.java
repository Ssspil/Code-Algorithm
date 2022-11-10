// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
// 예를 들어, 서로 다른 9개의 자연수
// 3, 29, 38, 12, 57, 74, 40, 85, 61
// 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

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
            int[] IArr = new int[9];
            
            for(int i = 0; i < 9; i++){
                IArr[i] = Integer.parseInt(br.readLine());
            }
            
            int index = 1;            
            int max = IArr[0];
            
            for(int i = 0; i < 9; i++){
                if(max < IArr[i]){
                    max = IArr[i];
                    index = i + 1;
                }
            }
            
            bw.write(String.valueOf(max)+"\n");
            bw.write(String.valueOf(index));

          
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
