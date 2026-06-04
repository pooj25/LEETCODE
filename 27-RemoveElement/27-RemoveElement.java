// Last updated: 04/06/2026, 13:18:12
class Solution {
    public int removeElement(int[] nums, int val) {
    int k=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
            nums[k]=nums[i];
            k++;
        }
    }
    return k;
    }
}