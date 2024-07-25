import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> range = new ArrayList<>();
        List<Integer> collect = new ArrayList<>();
        
        for(int i = 0; i < commands.length; i++) {
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                range.add(array[j]);
            }
            Collections.sort(range);
            collect.add(range.get(commands[i][2] - 1));
            range.clear();
        }
        int[] answer = new int [collect.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = collect.get(i);
        }
        
        return answer;
    }
}