class Solution {
    public int[] solution(int[] numlist, int n) {
		int[] answer = new int[numlist.length];
		int[] serve = new int[numlist.length];
		
		// 가까운 수를 찾기위해 배열에 들어있는 값에서 n값을빼줬다.
		for (int i = 0; i < numlist.length; i++) {
			serve[i] = numlist[i] - n;
		}

		// 정렬을 위해 2중 for문
		for (int i = 0; i < serve.length - 1; i++) {
			for (int j = i + 1; j < serve.length; j++) {
				int a = Math.abs(serve[i]);
				int b = Math.abs(serve[j]);

				// 오름차순으로 만들기 위해
				if (a > b) {
					int temp = serve[i];
					serve[i] = serve[j];
					serve[j] = temp;
					// 거리가 같을 경우
				} else if (a == b) {
					// 진짜 수를 판단 (높은수를 앞으로 오게)
					if (serve[i] < serve[j]) {
						int temp = serve[i];
						serve[i] = serve[j];
						serve[j] = temp;
					}
				}
			}
		}

		for (int i = 0; i < serve.length; i++) {
			answer[i] = serve[i] + n;
		}

		return answer;
    }
}
