import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sSplit = s.split(" ");
        int[] iSplit = new int[sSplit.length];
        
        for(int i = 0; i < sSplit.length; i++) {
            iSplit[i] = Integer.parseInt(sSplit[i]);
        }
        
        Arrays.sort(iSplit);
        answer = String.valueOf(iSplit[0]) + " " + String.valueOf(iSplit[iSplit.length - 1]);
        
        return answer;
    }
}