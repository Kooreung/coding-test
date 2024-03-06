class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String number = Integer.toString(n);
        String[] number2 = number.split("");

        for (int i = 0; i < number.length(); i++) {
            answer += Integer.parseInt(number2[i]);
        }
        return answer;
    }
}