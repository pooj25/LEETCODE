// Last updated: 17/06/2026, 11:48:33
1class Solution {
2    public boolean isValid(String s) {
3        while(s.contains("()")||s.contains("[]")||s.contains("{}")){
4           s=s.replace("()","");
5           s=s.replace("[]","");
6           s=s.replace("{}","");
7        }
8        return s.length()==0;
9    }
10}