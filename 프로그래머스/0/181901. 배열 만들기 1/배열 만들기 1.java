class Solution {
    public int[] solution(int n, int k) {
        int size = n / k;  // k의 배수 개수 계산
        int[] answer = new int[size];
        int o = 0;
        
        for (int i = k; i <= n; i += k) { // k의 배수만 반복
            answer[o++] = i; // 값 저장 후 인덱스 증가
        }
        
        return answer;
    }
}
