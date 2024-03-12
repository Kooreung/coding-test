class Solution {
    public int[] solution(int n, int[] numlist) {
        int list = 0;
        int j = 0;

        for (int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                list++;
            }
        }
        int[] answer = new int[list];

        for (int i = 0; i < numlist.length; i++) {
                if(numlist[i] % n == 0) {
                    answer[j] = numlist[i];
                    j++;
                }
        }
        return answer;
    }
}