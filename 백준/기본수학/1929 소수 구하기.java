import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[end+1];

        arr[0] = true;
        arr[1] = true;

        for(int i = 2; i <= Math.sqrt(end); i++){
            if(arr[i]) continue;
            for(int j = i*i; j <= end; j+=i){
                arr[j] = true;
            }
        }
        for(int i = start; i <= end; i++){
            if(!arr[i]) bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
