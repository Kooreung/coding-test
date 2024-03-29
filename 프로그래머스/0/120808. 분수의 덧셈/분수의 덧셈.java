class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int [2];

        int numerMultiply = (numer1 * denom2) + (numer2 * denom1);
        int denomMultiply = denom1 * denom2;

        for (int i = 1; i <= numerMultiply; i++) {
            if (numerMultiply % i == 0 && denomMultiply % i == 0) {
                answer[0] = numerMultiply / i;
                answer[1] = denomMultiply / i;
            }
        }


        return answer;
    }
}