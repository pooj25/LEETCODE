// Last updated: 13/06/2026, 18:03:23
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
        return false;
        while(n%4==0){
            n/=4;
        }
        return n==1;
    }
}