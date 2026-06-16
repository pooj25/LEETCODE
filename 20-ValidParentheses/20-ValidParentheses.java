// Last updated: 16/06/2026, 17:49:35
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        for (int i = 0; i < s.length(); i++) {
4            for (int j = i + 1; j < s.length(); j++) {
5                if ((s.charAt(i) == s.charAt(j)) !=
6                    (t.charAt(i) == t.charAt(j))) {
7                    return false;
8                }
9            }
10        }
11        return true;
12    }
13}