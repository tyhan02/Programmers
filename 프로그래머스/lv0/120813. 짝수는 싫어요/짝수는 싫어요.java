class Solution {
    public int[] solution(int n) {
        int oddCount = (n + 1) / 2; 
        int[] answer = new int[oddCount];
        
        for (int i = 0; i < oddCount; i++) {
            answer[i] = (i * 2) + 1;  
        }
        
        return answer;
    }
}
