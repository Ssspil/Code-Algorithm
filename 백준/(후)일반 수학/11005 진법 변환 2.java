import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] cArr = new char[36];
        StringBuilder sb = new StringBuilder();
        StringTokenizer stn = new StringTokenizer(br.readLine(), " ");
        
        int num = Integer.parseInt(stn.nextToken());
        int slice = Integer.parseInt(stn.nextToken());
        int i = 0;
        
        while(num > 0){
            int strNum = num % slice;
            if(strNum < 10){
                cArr[i] = ((char) (strNum + '0'));
            } else {
                cArr[i] = ((char) (strNum - 10 + 'A'));
            }
            
            num /= slice;
            i++;
        }
        
        for (int j = i; j >= 0; j--) {
            sb.append(cArr[j]);
        }
 
        System.out.println(sb.toString().trim());
    }
}
