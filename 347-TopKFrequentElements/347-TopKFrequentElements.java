// Last updated: 17/06/2026, 10:15:50
1class Solution {
2    public int firstUniqChar(String s) {
3        int fre[]=new int[26];
4        for(int i=0;i<s.length();i++){
5            fre[s.charAt(i)-'a']++;
6        }
7        for(int i=0;i<s.length();i++){
8            if(fre[s.charAt(i)-'a']==1){
9                return i;
10            }
11        }
12        return -1;
13    }
14}