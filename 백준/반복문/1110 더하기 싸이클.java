// 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 
// 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 
// 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
// 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
// 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
// N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		cycle();
	}
	
	static void cycle() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try {
        	int count = 1;  // 사이클 횟수
        	int a = 0;
        	int b = 0;
        	
        	String number = br.readLine();		// 값 입력받기 (문자형)
        	int result = Integer.parseInt(number);	// 입력받은 값 숫자형으로 저장해두기

        	while (true) {
        		if(Integer.parseInt(number) < 10) {		// 한자리 수 입력했으면 앞에 0을 붙이기 위한것.
        			number = "0" + Integer.parseInt(number);	// 싸이클 도중 03(문자형) 이런식으로 나온거 숫자처리하고 다시 0붙이기 
            	}
        		
        		int n = Integer.parseInt(number);	

        		a = n / 10;		// 10의 자리 
        		b = n % 10;		// 1의 자리

        		int ten = b;		// 1의자리가 10의 자리수로
        		int one = (a+b)%10;		// 각 수 더한 값이 1의 자리 수로
        		
        		number = "" + ten + one ;	// 각가 숫자 붙이고 문자열처리

        		if(result == Integer.parseInt(number)) {
        			break;		
        		}
        		
        		count++;

        	}
        	bw.write(String.valueOf(count));

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
