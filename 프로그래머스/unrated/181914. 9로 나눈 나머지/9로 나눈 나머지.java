 class Solution {
    public int solution(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            sum += digit;
        }
        
        int remainder = sum % 9;
        return remainder;
    }
}