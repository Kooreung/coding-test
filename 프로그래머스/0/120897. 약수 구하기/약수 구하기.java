class Solution {
    public int[] solution(int n) {
        int arr = 0;

        for (int i = n; i >= 1; i--) {
            if(n % i == 0) {
                arr++;
            }
        }
        int[] answer = new int [arr];
        arr = 0;

        for (int i = n; i >= 1; i--) {
            if(n % i == 0) {
                answer[arr] = i;
                arr++;
            }
        }
        java.util.Arrays.sort(answer);
        return answer;
    }
}