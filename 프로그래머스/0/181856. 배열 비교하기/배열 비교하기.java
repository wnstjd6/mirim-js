class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        
        // Step 1: 배열 길이 비교
        if (arr1.length > arr2.length) {
            return 1;
        } 
        else if (arr1.length < arr2.length) {
            return -1;
        }
        
        // Step 2: 배열의 합 비교 (길이가 같은 경우)
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }

        if (sum1 > sum2) {
            answer = 1;
        } 
        else if (sum1 < sum2) {
            answer = -1;
        } 
        else {
            answer = 0;
        }
        
        return answer;
    }
}
