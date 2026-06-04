// Last updated: 04/06/2026, 13:18:09
class Solution {
    public boolean isAnagram(String s, String t) {
    String a1=s.replaceAll("\\s","").toUpperCase(); 
    String a2=t.replaceAll("\\s","").toUpperCase(); 
    char[] c1=a1.toCharArray();
    char[] c2=a2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    return(Arrays.equals(c1,c2));  
    }
}