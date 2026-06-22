// Last updated: 22/06/2026, 13:48:59
1class Solution {
2    public long zeroFilledSubarray(int[] nums) {
3        long ans=0;
4        long count=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==0){
7                count++;
8                ans+=count;
9            }
10            else{
11                count=0;
12            }
13        }
14        return ans;
15    }
16}