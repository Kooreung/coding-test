import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] str = my_string.split("");

        System.out.println(Arrays.toString(str));

        for (int i = 0; i < my_string.length(); i++) {
            answer += Integer.parseInt(str[i]);
        }
        
        return answer;
    }
}