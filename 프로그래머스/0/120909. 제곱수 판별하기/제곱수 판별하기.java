class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = n;
        
        while (n != i * i) {
            i--;
            if (n == i * i) {
                answer = 1;
                break;
            } else if (i <= 0) {
                answer = 2;
                break;
            }
        }
          
        return answer;
    }
}