class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = Integer.toString(n); // n을 문자열로 변환
        for (int i = 0; i < a.length(); i++) {
            answer += Character.getNumericValue(a.charAt(i)); // 각 문자를 숫자로 변환해 더함
        }
        return answer;
    }
}
