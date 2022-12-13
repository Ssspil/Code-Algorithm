import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 int cycle;
		 int count = 0;
		try {
			cycle = Integer.parseInt(br.readLine());	// 내가 수 입력하기
			
			for(int i = 1; i <= cycle; i++){
				if( true == hansu(i)) {
					count++;
				}
			}
			
			System.out.println(count);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean hansu(int num) {
		
		int[] iArr = new int[4];
		int i = 3;
		boolean result = false;
		
		while(true) {
			iArr[i--] = num % 10;
			num = num /10;
			
			if(num == 0) {
				break;
			}
		}
		
		if( (iArr[0] == 0) && (iArr[1] == 0) || ( (iArr[0] == 0) && (iArr[1] == 0) &&(iArr[2] == 0)) ) {	// 한자리 수 나 두자리 수는 한수가 바로 된다.
			result = true;
		} else if (iArr[0] == 1 && ( (iArr[1] == 0) && (iArr[2] == 0) &&(iArr[3] == 0)) ) {
			
		} else {
			int n1 = iArr[1] - iArr[2];
			int n2 = iArr[2] - iArr[3];
			
			if(n1 == n2) {
				result = true;
			}
			
		}
		
		return result; 
		
	}
}
