import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        Map<Integer,Integer> list = new HashMap<>();
        int k = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    System.out.println(i + " | " + j);
                    k++;
                    list.put(i,k);
                }
            }
            k = 0;
        }

        for (int value : list.values()) {
            if (value >= 3) {
                answer++;
            }
        }
        
        return answer;
    }
}