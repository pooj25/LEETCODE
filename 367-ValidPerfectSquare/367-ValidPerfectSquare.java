// Last updated: 14/06/2026, 21:41:27
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        int left = 0;
4        int right = num;
5        while(left <= right){
6            int mid = left + (right - left) / 2;
7            long square = (long) mid * mid;
8            if(square == num){
9                return true;
10            }
11            else if(square > num){
12                right = mid - 1;
13            }
14            else{
15                left = mid + 1;
16            }
17        }
18        return false;
19    }
20}