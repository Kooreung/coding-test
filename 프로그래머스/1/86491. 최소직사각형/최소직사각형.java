import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] size1 = new int [sizes.length];
        int[] size2 = new int [sizes.length];
        
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] > sizes[i][1]) {
                size1[i] = sizes[i][0];
                size2[i] = sizes[i][1];
            } else {
                size1[i] = sizes[i][1];
                size2[i] = sizes[i][0];
            }
        }
    
        Arrays.sort(size1);
        Arrays.sort(size2);
        
        answer = size1[size1.length - 1] * size2[size2.length - 1];
        
        return answer;
    }
}