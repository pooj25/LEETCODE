// Last updated: 04/06/2026, 13:18:05
class Solution {
    public void reverseString(char[] s) {
    int i=0;
    int j=s.length-1;
    while(i<j){
    char temp=s[i];
    s[i]=s[j];
    s[j]=temp;
    i++;
    j--;        
    }  
}
}