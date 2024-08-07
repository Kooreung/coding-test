import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        
        for(char item : s.toCharArray()) {
            if(item == '(') {
                st.push('(');
            } else {
                if(!st.isEmpty()) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty() ? true : false;
    }
}