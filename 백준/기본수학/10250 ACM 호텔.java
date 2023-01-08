import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {

		result();
	}
	
	public static void result() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		try {
			
			int cycle = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < cycle; i++) {
				StringTokenizer stn = new StringTokenizer(br.readLine(), " ");
				
				int height = Integer.parseInt(stn.nextToken());		// 건물 층
				int room = Integer.parseInt(stn.nextToken());		// 건물 츰마다 객실 수 
				int customer = Integer.parseInt(stn.nextToken());	// 오는 손님
				
				if( (1 <= height && height <= 99) && (1 <= room && room <= 99) && (1<= customer && customer <= height* room ) ) {
					// 조건에 잘 입력했을 경우 실행
					
					// 배정된 층
					int layer = customer % height == 0 ? height : customer % height;
					// 배정된 방
					int ho =  (customer / height) > 0 && (customer % height) == 0 ? (customer / height) : (customer / height) + 1; 
					String ho2 = ho < 10? "0"+ho :String.valueOf(ho);
					
					sb.append(layer);
					sb.append(ho2);
					
					System.out.println(sb);
					sb.setLength(0);
					
				}else {
					return;
				}
			}

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
	
	
