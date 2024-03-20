class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] stringArr = my_string.split("");

        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].matches("[a-z]")) {
                answer += stringArr[i].toUpperCase();
            } else {
                answer += stringArr[i].toLowerCase();
            }
        }
        return answer;
    }
}