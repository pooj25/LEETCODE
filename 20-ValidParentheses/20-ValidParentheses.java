// Last updated: 16/06/2026, 17:46:44
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        //Arrays.sort(nums);
4        //int square=1;
5        for(int i=0;i<nums.length;i++){
6            nums[i]=nums[i]*nums[i];
7        }
8        Arrays.sort(nums);
9        return nums;
10    }
11}