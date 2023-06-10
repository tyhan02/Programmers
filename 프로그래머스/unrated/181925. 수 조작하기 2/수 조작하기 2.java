class Solution {
    public String solution(int[] log) {
        String result = "";
        
        for (int i = 0; i < log.length; i++){
           
            if (i != 0) {

                int num = log[i-1];
                
         
                if (log[i] == num + 1){
                 result += "w";
                }
    
                else if(log[i] == num - 1){
                    result += "s";
                }
                else if (log[i] == num + 10){
                    result += "d";}
           
                else{
                    result += "a";}
            }
        }
        return result;
    }
}
