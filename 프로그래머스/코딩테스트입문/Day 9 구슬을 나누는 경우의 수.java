class Solution {
    public long solution(int balls, int share) {
        share = Math.min(balls - share, share);

        if (share == 0)
            return 1;

        long result = solution(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
    }
}


/*
    result 1
    result = result * balls = 1 * 5 = 5
    result = result / share = 5 / 1 = (5/1)
    
    result (5/1)
    result = result * balls = (5/1) * 6 = 5 * 6
    result = result / share = 5*6 / 1*2 = (5*6) / (1*2)

    result ((5*6)/(1*2))
    result = result * balls = ((5*6)/(1*2)) * 7 =  5 * 6 * 7
    result = result / share = (5*6*7) / 1*2*3 = (5*6*7)/(1*2*3)

*/
