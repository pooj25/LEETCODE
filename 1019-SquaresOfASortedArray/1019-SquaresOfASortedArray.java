// Last updated: 16/06/2026, 17:50:25
class Solution {
    public int[] sortedSquares(int[] nums) {
        //Arrays.sort(nums);
        //int square=1;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}