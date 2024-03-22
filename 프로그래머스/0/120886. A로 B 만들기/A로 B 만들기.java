import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        List<String> splitBefore = List.of(before.split(""));
        List<String> splitAfter = List.of(after.split(""));

        String sortedBefore = splitBefore.stream().sorted().reduce("", (a,b) -> a + b);
        String sortedAfter = splitAfter.stream().sorted().reduce("", (a,b) -> a + b);

        if (sortedBefore.equals(sortedAfter)) {
            answer = 1;
        }
        
        return answer;
    }
}