class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        int answer = 0;
        
        if (arr1.length > arr2.length) {
            answer = 1;
            return answer;
        } else if (arr1.length < arr2.length) {
            answer = -1;
            return answer;
        } else if (arr1.length == arr2.length) {
            int sumArr1 = 0;
            int sumArr2 = 0;
            for(int i : arr1) {
                sumArr1 += i;
            }
            for(int i : arr2) {
                sumArr2 += i;
            }
            if(sumArr1 > sumArr2) {
                answer = 1;
                return answer;
            } else if(sumArr1 < sumArr2) {
                answer = -1;
                return answer;
            } else if (sumArr1 == sumArr2) {
                return answer;
            }
        }
        return answer;
    }
}