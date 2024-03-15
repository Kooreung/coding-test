class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        myString = myString.replaceAll("x+"," ");
        myString = myString.replaceAll("^ ","");
        answer = myString.split("\\s");
        java.util.Arrays.sort(answer);
        
        return answer;
    }
}