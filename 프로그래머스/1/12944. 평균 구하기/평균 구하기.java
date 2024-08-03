import java.util.*;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        long sum = 0;
        
        for(int i : arr) {
            sum += i;
        }
        answer = (double) sum / arr.length;
        
        return answer;
    }
}