import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        long x = (long) Math.sqrt(n);
        if(x * x == n) {
            answer = (long) Math.pow((x + 1), 2);
        } else {
            answer = -1;
        };
        return answer;
    }
}