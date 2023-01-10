class Solution{
    public int solution(int[] array) {
        int result = 0;
        int array_Max = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] > array_Max){
                array_Max = array[i];
            }
        }
        
        int[] count = new int[array_Max+1];
        
        for(int j = 0; j < array.length; j++){
            count[array[j]]++;
        }
        
        int count_Max = 0;
        
        for(int k = 0; k < count.length; k++){
            if(count_Max < count[k]){
                count_Max = count[k];
                result = k;
            }
        }
        
        int rep = 0;
        for(int q = 0; q < count.length; q++){
            if(count_Max == count[q]){
                rep++;
            }
        }
        
        if(rep != 1 ){
            result = -1;
        }
        
        return result;
    }                                                    
}
