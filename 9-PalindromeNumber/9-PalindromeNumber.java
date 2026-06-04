// Last updated: 04/06/2026, 13:18:15
class Solution {
    public boolean isPalindrome(int x) {
    int num=x;
    int rev=0;
    while(x>0){
        int digit=x%10;
        rev=rev*10+digit;
        x/=10;
    }
    if(num==rev){
        return true;
    }
    else{
        return false;
    }
    }
}