// Last updated: 14/06/2026, 21:49:12
1class Solution {
2    public int sumOfSquares(int[] nums) {
3        int sum=0;
4        int n=nums.length;
5        for(int i=1;i<=n;i++){
6            int num=nums[i-1];
7            if(n%i==0){
8                sum+=num*num;
9            }
10        }
11        return sum;
12    }
13}