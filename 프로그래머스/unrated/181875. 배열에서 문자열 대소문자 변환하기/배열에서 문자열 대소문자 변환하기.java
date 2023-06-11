import java.util.*;


class Solution {
    public String[] solution(String[] strArr) {
        
     
        for(int i = 0; i < strArr.length; i++){
            int a = i;
            
          
            if (a % 2 == 0){
                strArr[i] = strArr[i].toLowerCase();
            }

            else
                strArr[i] = strArr[i].toUpperCase();

        }
        
        return strArr;
    }
}
