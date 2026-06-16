// Last updated: 16/06/2026, 17:50:35
class Solution {
    public boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if ((s.charAt(i) == s.charAt(j)) !=
                    (t.charAt(i) == t.charAt(j))) {
                    return false;
                }
            }
        }
        return true;
    }
}