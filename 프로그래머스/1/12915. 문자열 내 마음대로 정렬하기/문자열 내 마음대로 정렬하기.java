import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String [strings.length];
        Arrays.sort(strings);
        Arrays.sort(strings, (a, b) -> a.charAt(n) - b.charAt(n));
        return answer = Arrays.copyOfRange(strings, 0, strings.length);
    }
}