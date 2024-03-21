class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr = String.valueOf(order);

        for (int i = 0; i < orderStr.length(); i++) {
            char orderChar = orderStr.charAt(i);
            if (orderChar == '3' || orderChar == '6' || orderChar == '9') {
                answer++;
            }
        }
        return answer;
    }
}