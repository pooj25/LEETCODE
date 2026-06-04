// Last updated: 04/06/2026, 13:17:57
class Solution {
    public String[] sortPeople(String[] a, int[] h) {
	for(int i=0;i<h.length-1;i++){
	    for(int j=0;j<h.length-1;j++){
	        if(h[j]<h[j+1]){
	            int t=h[j];
	            h[j]=h[j+1];
	            h[j+1]=t;
	            String te = a[j];
                a[j] = a[j + 1];
                a[j + 1] = te;
	        }
	    }
    }
    return  a;    
	}
}