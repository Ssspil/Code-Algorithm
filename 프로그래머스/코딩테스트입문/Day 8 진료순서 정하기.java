import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int length = emergency.length;
        int[] answer = new int[length];
        int[] clone = emergency.clone();
        
        Arrays.sort(clone);
        
        for(int i = 0; i < length; i++){        // 정렬된 배열과
            for(int j = 0; j <length; j++){     // emergency 배열 
                if(clone[i] == emergency[j]){
                    answer[j] = length - i;
                }
            }
        }
        
        return answer;
    }
}
