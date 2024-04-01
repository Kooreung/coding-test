class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;

        for (int i = 1; i < k; i++) {
            index += 2;
        }
        answer = numbers[index % numbers.length];

        return answer;
    }
}