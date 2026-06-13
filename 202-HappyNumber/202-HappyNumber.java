// Last updated: 13/06/2026, 18:03:33
class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum=sum+digit*digit;
        n/=10;
        }
        n=sum;
    }
        return n==1;
    }
}