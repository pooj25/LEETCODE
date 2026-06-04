// Last updated: 04/06/2026, 13:18:17
class Solution {
    public int[] twoSum(int[] nums, int target){
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
        //for(int i=0;i<=nums.length;i++){
        return new int[]{i,j};
            }
        }
    }
    return new int[]{};
    }
}
           