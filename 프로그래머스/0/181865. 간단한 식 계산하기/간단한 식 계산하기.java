class Solution {
    public int solution(String binomial) {
        String[] parts = binomial.split(" ");
        
        int a = Integer.parseInt(parts[0]); 
        char operator = parts[1].charAt(0); 
        int b = Integer.parseInt(parts[2]); 
        
        int answer = 0;
        switch (operator) {
            case '+':
                answer = a + b;
                break;
            case '-':
                answer = a - b;
                break;
            case '*':
                answer = a * b;
                break;
            case '/':
                answer = a / b;
                break;
        }
        
        return answer;
    }
}
