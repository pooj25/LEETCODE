// Last updated: 16/06/2026, 13:49:16
1class Solution {
2    public boolean isPalindrome(String s) {
3        String c = "";
4        for (int i = 0; i < s.length(); i++) {
5            char ch = s.charAt(i);
6
7            if (Character.isLetterOrDigit(ch)) {
8                c += Character.toLowerCase(ch);
9            }
10        }
11        int left = 0;
12        int right = c.length() - 1;
13        while (left < right) {
14            if (c.charAt(left) != c.charAt(right)) {
15                return false;
16            }
17
18            left++;
19            right--;
20        }
21        return true;
22    }
23}