import java.util.*;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a == b) {
            answer = Math.min(a, b);
            return answer;
        } else {
            for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
                answer += i;
            };
        }
            
        return answer;
    }
}