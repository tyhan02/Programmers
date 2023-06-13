class Solution {
    public int[] solution(int n) {
        int count = 1; 
        int temp = n; 
        
        while (temp != 1) {
            if (temp % 2 == 0) {
                temp = temp / 2;
            } else {
                temp = temp * 3 + 1;
            }
            
            count++; 
        }
        
        int[] answer = new int[count]; 
        temp = n; 
        
        for (int i = 0; i < count; i++) {
            answer[i] = temp;
            
            if (temp % 2 == 0) {
                temp = temp / 2;
            } else {
                temp = temp * 3 + 1;
            }
        }
        
        return answer;
    }
}

