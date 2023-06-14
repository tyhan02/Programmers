class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] tokens = binomial.split(" ");
        int a = Integer.parseInt(tokens[0]);
        String operator = tokens[1];
        int b = Integer.parseInt(tokens[2]);

        switch (operator) {
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        return answer;
    }
}

