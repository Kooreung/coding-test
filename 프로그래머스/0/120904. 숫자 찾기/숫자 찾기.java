class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String nums = String.valueOf(num);

        for (int i = 0; i < nums.length() ;i++) {
            if (Integer.valueOf(nums.substring(i,i+1)) == k) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}