import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        long answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for(String s : str) {
            sb.append(s);
        }
        answer = Long.parseLong(String.valueOf(sb));
        
        return answer;
    }
}