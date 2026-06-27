// Last updated: 27/06/2026, 11:34:39
1class Solution {
2    public int countPrimes(int n) {
3        boolean[] prime=new boolean[n];
4        int count=0;
5        for(int i=2;i<n;i++){
6            prime[i]=true;
7        }
8        for(int i=2;i<n;i++){
9            if(prime[i])
10            count++;
11            for(int j=i*2;j<n;j+=i){
12                prime[j]=false;
13            }
14        }
15     return count;
16    }
17}