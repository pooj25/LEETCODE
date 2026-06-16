// Last updated: 16/06/2026, 14:02:26
class Solution {
    public boolean isPalindrome(String s) {
        String c = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                c += Character.toLowerCase(ch);
            }
        }
        int left = 0;
        int right = c.length() - 1;
        while (left < right) {
            if (c.charAt(left) != c.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}