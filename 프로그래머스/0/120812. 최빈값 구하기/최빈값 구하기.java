import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : array) {
            if (map.containsKey(num)) {
                map.put(num,map.get(num) + 1);
            } else {
                map.put(num,1);
            }
        }

        int higher = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value > higher) {
                higher = value;
                answer = entry.getKey();
            } else if (value == higher) {
                answer = -1;
            }
        }

        
        return answer;
    }
}