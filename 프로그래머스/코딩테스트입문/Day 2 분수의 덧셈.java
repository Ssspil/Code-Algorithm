class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        
        int bunja = denum1 * num2 + num1 * denum2;
        int bunmo = num1 * num2;
        
        for(int i = 2; i <= Math.min(bunja, bunmo); i++){
            if( (bunja % i == 0) && (bunmo % i == 0) ){
                bunja = bunja / i;
                bunmo = bunmo / i;
                i = 1;
            }
        }
        
        answer[0] = bunja;
        answer[1] = bunmo;
        
        return answer;
    }
}
