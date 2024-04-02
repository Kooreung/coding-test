class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = 0;
        int count = 0;

        if (num_list.length % n == 0) {
            size = num_list.length / n;
        } else {
            size = num_list.length / n + 1;
        }

        int[] answer = new int[size];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[count];
            count += n;
        }
        return answer;
    }
}