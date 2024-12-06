class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c < 'l') {
                answer.append('l');
            } else {
                answer.append(c);
            }
        }
        return answer.toString();
    }
}