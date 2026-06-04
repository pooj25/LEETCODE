// Last updated: 04/06/2026, 13:18:10
class Solution {
    public void sortColors(int[] a) {
       for(int i=0;i<a.length-1;i++){
	    for(int j=0;j<a.length-1;j++){
	        if(a[j]>a[j+1]){
	            int t=a[j];
	            a[j]=a[j+1];
	            a[j+1]=t;
	        }
	    }
	}
	    System.out.println(Arrays.toString(a));
	}
}
