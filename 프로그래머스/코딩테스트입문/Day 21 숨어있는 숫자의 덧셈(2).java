class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] sArr = my_string.replaceAll("[^0-9]", " ").split(" ");
        
        for(int i = 0; i < sArr.length; i++){
            if(sArr[i].equals("")){
                continue;
            } else {
                answer += Integer.parseInt(sArr[i]) ;
            }
        }
            
        
        
        return answer;
    }
}
