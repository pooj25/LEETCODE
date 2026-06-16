// Last updated: 16/06/2026, 12:24:45
1class Solution {
2    public int maximumDifference(int[] nums) {
3        int maxDiff=-1;
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                int difference = nums[j] - nums[i];
7                if(nums[j]>nums[i]){
8                    difference=nums[j]-nums[i];
9                    maxDiff = Math.max(maxDiff, difference);
10                }
11                
12            }
13        }
14        return maxDiff;
15    }
16}