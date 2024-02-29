class Solution {
    public String solution(String my_string, String alp) {
        String answer = my_string;
        
        for (int i = 0 ; i < my_string.length(); i++) {
            if (my_string.charAt(i) == alp.charAt(0)) {
                alp = alp.toUpperCase();
                answer = my_string.replace(my_string.charAt(i), alp.charAt(0));
            }
        }
        
        return answer;
    }
}