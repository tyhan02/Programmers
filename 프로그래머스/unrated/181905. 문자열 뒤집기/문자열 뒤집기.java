public class Solution {
    public static String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);

       
        String reversedSubstring = sb.substring(s, e + 1);
        reversedSubstring = new StringBuilder(reversedSubstring).reverse().toString();

   
        sb.replace(s, e + 1, reversedSubstring);

        return sb.toString();
    }
}