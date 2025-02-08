class Solution {
    public int[] solution(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        int[] answer = new int[sum];
        int index = 0;
        
        for (int num : arr) {
            for (int j = 0; j < num; j++) {
                answer[index++] = num;
            }
        }
        
        return answer;
    }
}
