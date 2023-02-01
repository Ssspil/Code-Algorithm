class Solution {
    public int solution(int[] sides) {
            int min=Math.min(sides[0], sides[1]);
            int max=Math.max(sides[0], sides[1]);
            int sum=sides[0]+sides[1];
            int answer = 0;

            for(int i=1;i<sum;i++) {
                if(i<=min||i<max){//i가 중간값 또는 최솟값 
                    if(max<min+i) {
                        answer++;
                    }
                }else if(i>=max) {//i가 가장 긴 변이면
                    answer++;
                }
            }
            return answer;
        }
    }
