class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int divisorCount = countDivisors(i);

            if (divisorCount % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    private int countDivisors(int num) {
        int count = 0;
        for (int j = 1; j * j <= num; j++) {
            if (j * j == num) {
                count++;
            } else if (num % j == 0) {
                count += 2;
            }
        }
        return count;
    }
}
