import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isUpperCase(c)) {
                String str = String.valueOf(c);
                answer += str.toLowerCase();
            } else if (Character.isLowerCase(c)) {
                String str = String.valueOf(c);
                answer += str.toUpperCase();
            }
        }
        System.out.print(answer);
    }
}
