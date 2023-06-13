public class Solution {
    public static String solution(String myString, int[] indexList) {
        StringBuilder result = new StringBuilder();
        for (int i : indexList) {
            result.append(myString.charAt(i));
        }
        return result.toString();
    }
}
