class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String sum = String.valueOf(a) + String.valueOf(b);
        int mul = 2 * a * b;

        if (Integer.parseInt(sum) >= mul) {
            answer = Integer.parseInt(sum);
        } else {
            answer = mul;
        }
        
        return answer;
    }
}