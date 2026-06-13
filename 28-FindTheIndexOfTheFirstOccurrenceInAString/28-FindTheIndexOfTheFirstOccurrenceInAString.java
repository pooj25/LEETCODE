// Last updated: 13/06/2026, 18:03:42
class Solution {
    public int strStr(String haystack, String needle) {
        char[] a1=haystack.toCharArray();
        char[] a2=needle.toCharArray();
        for(int i=0;i<=a1.length-a2.length;i++){
            int j;
            for(j=0;j<a2.length;j++){
                if(a1[i+j]!=a2[j]){
                    break;
                }
            }
            if(j==a2.length){
                return i;
            }
        }
        return -1;
    }
}