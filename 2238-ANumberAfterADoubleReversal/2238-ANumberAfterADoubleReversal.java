// Last updated: 04/06/2026, 13:17:55
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0){
            return true;
        }
        if(num%10==0){
            return false;
        }
        return true;
    }
}