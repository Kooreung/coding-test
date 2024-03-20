import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int length = 0;
        int index = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.substring(i,i+1).matches("\\d")) {
                length++;
            }
        }
        int[] answer = new int[length];

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.substring(i,i+1).matches("\\d")) {
                answer[index] = Integer.parseInt(my_string.substring(i,i+1));
                index++;
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}