// Last updated: 13/06/2026, 18:03:36
class Solution {
    public String reverseWords(String s) {
    String[] s1 = s.trim().split("\\s+");  
          String res="";
        for(int i=s1.length-1;i>=0;i--){
            res+=s1[i];
                if(i!=0){
                    res+=" ";
                }
            }
        return res; 
    }
}