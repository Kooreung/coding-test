class Solution {
    public int[] solution(int[] array) {
        int[] answer = {0, 0};
        
        for (int i = 0; i <= array.length - 1; i++) {
            if (answer[0] < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        
        return answer;
    }
}