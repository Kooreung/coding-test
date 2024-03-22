import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<String> list = List.of(my_string.split(""));

        answer = list.stream()
                .distinct()
                .reduce("", (a, b) -> a + b);
        
        return answer;
    }
}