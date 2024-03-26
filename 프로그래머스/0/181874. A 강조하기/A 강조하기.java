class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] stringArr = myString.split("");
        int count = 0;

        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].equals("a")) {
                stringArr[i] = stringArr[i].toUpperCase();
            }
            if (stringArr[i].matches("[B-Z]")) {
                stringArr[i] = stringArr[i].toLowerCase();
            }
            answer += stringArr[count];
            count++;
        }
        return answer;
    }
}