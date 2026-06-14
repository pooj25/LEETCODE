// Last updated: 14/06/2026, 21:43:10
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        long left = 0, right = (long) Math.sqrt(c);
4        while (left <= right) {
5            if (left * left + right * right == c) return true;
6            else if (left * left + right * right > c) right--;
7            else left++;
8        }
9        return false;
10    }
11}