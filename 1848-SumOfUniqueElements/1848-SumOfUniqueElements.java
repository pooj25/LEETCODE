// Last updated: 13/06/2026, 18:03:20
class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
       // int cnt=0;
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                cnt++;
            }
            }
        if(cnt==1){
        sum+=nums[i];
        }
    }
        return sum;
    }
}