import java.util.*;

public class Solution {
    public static String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new StringBuilder(new String(chars)).reverse().toString();
    }
}