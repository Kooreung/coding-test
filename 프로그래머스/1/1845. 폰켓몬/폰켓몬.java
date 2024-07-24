import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length / 2;
        
        HashSet<Integer> numsSet = new HashSet<>();
        
        for(int n : nums) {
            numsSet.add(n);
        }
        
        if(numsSet.size() > answer) {
            return answer;
        } else {
            answer = numsSet.size();
        }
        return answer;
    }
}