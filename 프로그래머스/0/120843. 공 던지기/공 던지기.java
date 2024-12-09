class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        int i = 0;
        while(true){
            if(answer == k){
                return numbers[i];
            }
            else{
                i = (i+2)%numbers.length;
                answer++;
            }
        }
        
    }
}