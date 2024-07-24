class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] chars = s.toLowerCase().toCharArray();
        int pCount = 0;
        int yCount = 0;
        
        for(char c : chars) {
            if(c == 'p') {
                pCount++;
            } else if (c == 'y') {
                yCount++;
            }
        }
        if(pCount == yCount) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}