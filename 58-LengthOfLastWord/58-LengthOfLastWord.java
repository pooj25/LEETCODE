// Last updated: 13/06/2026, 18:03:41
class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int count = 0;
        while(i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while(i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
}