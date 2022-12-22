import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		wordStudy();
	}
    
    public static void wordStudy(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	try {
		
		// 영문자 26개
		int[] iArr = new int[26];
		// 입력한값 대문자로 바꿔주기
		String str = br.readLine().toUpperCase();
       		// 문자열 문자 하나하나 넣은 배열
           	char [] strChar = str.toCharArray();
            
            	for(int i = 0; i < str.length(); i++){
                	if('A'<= str.charAt(i) && str.charAt(i) <= 'Z') { //대문자 범위
				iArr[strChar[i] - 'A']++;
			} 
            	}

		int max = -1;
		char ch = '?';

		for(int i = 0; i < 26; i++){
			if (iArr[i] > max) {
				max = iArr[i];
				ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
			} else if (iArr[i] == max) {
				ch = '?';
			}
		}

		bw.write(String.valueOf(ch));

			
	    } catch (NumberFormatException e) {
	    	e.printStackTrace();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    } catch (Exception e){
	        e.printStackTrace();
	    } finally {
	    	try {
	    		bw.flush();
	    		bw.close();
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    	}
	    }
    }
}

