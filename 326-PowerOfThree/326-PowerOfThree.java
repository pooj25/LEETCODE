// Last updated: 13/06/2026, 18:03:25
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)
        return false;
        while(n%3==0){
        n/=3;
        }
        return n==1;
    }
}