// Last updated: 16/06/2026, 14:01:55
class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int difference = nums[j] - nums[i];
                if(nums[j]>nums[i]){
                    difference=nums[j]-nums[i];
                    maxDiff = Math.max(maxDiff, difference);
                }
                
            }
        }
        return maxDiff;
    }
}