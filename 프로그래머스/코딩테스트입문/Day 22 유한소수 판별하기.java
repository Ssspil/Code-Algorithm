class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        // 최대 공약수
        int n = gcd(a,b);
        // 약분된 분모
        int newB = b / n;

        while(true){
            if(newB % 2 == 0){
               newB = newB / 2; 
            } else if(newB % 5 == 0){
                newB = newB / 5;
            } else if(newB % 2 != 0 || newB % 5 != 0){
                if(newB == 1){
                    answer = 1;
                } else {
                    answer = 2;
                }
                break;
            }
        }
        return answer;
    }

    // 최대 공약수 구하기
    public int gcd(int a, int b){
        if(b == 0){
            return a;
        } else {
            return gcd(b, a%b);
        }
    }
}
