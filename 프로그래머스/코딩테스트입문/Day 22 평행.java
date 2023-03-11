class Solution {
    public static int solution(int[][] dots) {
        int answer = 0;
        for(int i = 0; i < dots.length; i++) {

            float temp = dxdy(dots[i], dots[(i+1) % 4]);
            float temp2 = dxdy(dots[(i+2) % 4],dots[(i+3) % 4]);

            if(temp == temp2) {
                answer = 1;
            }

        }
        return answer;
    }


    public static float dxdy(int[] a1, int[] a2) {
        float bunmo,bunja;

            bunmo= a1[0]-a2[0];
            bunja= a1[1]-a2[1];

        return bunja/bunmo;
    }
}
