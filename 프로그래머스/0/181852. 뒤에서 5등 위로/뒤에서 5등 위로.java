import java.util.Arrays;


class Solution {
    public int[] solution(int[] num_list) {
        int[] sorted = Arrays.stream(num_list).sorted().toArray();
        int[] answer = new int [sorted.length - 5];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = sorted[i + 5];
        }
        
        return answer;
    }
}