class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        for(int i = 0; i < seoul.length; i++) {
            String s = seoul[i];
            if(s.contains("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        
        return answer;
    }
}