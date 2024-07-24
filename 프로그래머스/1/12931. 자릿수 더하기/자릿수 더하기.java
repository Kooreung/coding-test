import java.util.*;

public class Solution {
    public int solution(int n) {
        String[] s = String.valueOf(n).split("");
        int answer = 0;
        
        for(int i = 0; i < s.length; i++) {
            answer += Integer.parseInt(s[i]);
        }

        return answer;
    }
}