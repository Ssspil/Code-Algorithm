public class Main{
	public static void main(String[] args) {
		boolean[] result = new boolean[10001];	// 1~10000 이기때문에 result[0]을 빼고 하기 때문에 10001까지 생성
		
		for(int i = 1; i < 10001; i++) {
			int n = selfNum(i);
			
			if(n < 10001) {
				result[n] = true;
			}
		}
		
		for(int i = 1; i < 10001; i++) {
			if(result[i] == false) {
				System.out.println(i);
			}
		}
	}
	
	static int selfNum(int num) {
		int sum = num;		// 원래 수
		
		while(num != 0) {
			sum += num % 10;	// 각 자리 수 더해주기
			num = num / 10;		// 자리수 줄여주기
		}
		
		return sum;	// 원래수와 각 자리수 더한거 리턴
	}
}
