class Solution {
    public int solution(int n) {
        int answer = 1;
        int piece = 1;

        while ((n * piece) % 6 != 0) {
            piece++;
        }
        answer = n * piece / 6;
        return answer;
    }
}