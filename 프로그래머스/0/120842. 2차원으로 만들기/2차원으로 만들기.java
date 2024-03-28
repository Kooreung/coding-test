import java.util.*;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][];
        int count1 = 0;
        int count2 = n;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Arrays.copyOfRange(num_list,count1,count2);
            count1 += n;
            count2 += n;
        }
        return answer;
    }
}