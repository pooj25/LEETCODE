// Last updated: 04/06/2026, 13:17:52
class Solution {
    public int minCostToMoveChips(int[] pos) {
        int even=0;
        int odd=0;
        for(int i=0;i<pos.length;i++){
            if(pos[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        return Math.min(odd,even);
    }
}