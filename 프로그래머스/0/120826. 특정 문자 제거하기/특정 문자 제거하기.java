import java.util.Objects;

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] my_stringArray = my_string.split("");

        for (int i = 0; i < my_string.length(); i++) {
            if (!Objects.equals(my_stringArray[i], letter)) {
                answer += my_stringArray[i];
            }
        }
        
        return answer;
    }
}