import java.util.*;
class Solution {
    public int solution(int[] array) {
        int count = 0;
        
        String A = Arrays.toString(array);
        
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '7') {
                count++;
            }
        }
        
        return count;
    }
}