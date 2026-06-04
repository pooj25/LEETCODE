// Last updated: 04/06/2026, 13:18:13
class Solution {
    public int removeDuplicates(int[] nums) {
    int count=1;
    for(int i=1;i<nums.length;i++){
        if (nums[i]!=nums[i-1]){
            nums[count]=nums[i];
            count++;
        }
    }
    return count;
    }
}        
    