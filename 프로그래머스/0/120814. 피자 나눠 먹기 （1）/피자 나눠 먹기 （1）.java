class Solution {
    public int solution(int n) {
        int answer = 1;
        
        if (n%7 != 0) {
            answer = 1 + n/7;
        } else if (n%7 == 0) {
            answer = n/7;
        }
        
        return answer;
    }
}