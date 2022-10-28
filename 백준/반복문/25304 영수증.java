// 준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다. 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다! 
// 준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
// 영수증에 적힌,
// 구매한 각 물건의 가격과 개수
// 구매한 물건들의 총 금액을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		hap();
	}
	
	static void hap() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
		    int myMoney = Integer.parseInt(br.readLine());
		    int n = Integer.parseInt(br.readLine());
		    int sum = 0;

		    for(int i = 0; i < n; i++){
			StringTokenizer stn = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(stn.nextToken());
			int b = Integer.parseInt(stn.nextToken());

			sum += (a*b);
		    }

		    if(myMoney == sum) {
			bw.write("Yes");
		    } else {
			bw.write("No");
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
