// Last updated: 24/06/2026, 11:26:29
1class Solution {
2    public void sortColors(int[] nums) {
3        int zero=0;
4        int one=0;
5        int two=0;
6        for(int i=0;i<nums.length;i++){
7            if(nums[i]==0){
8                zero++;
9            }
10            else if(nums[i]==1){
11                one++;
12            }
13            else{
14                two++;
15            }
16        }
17        int i=0;
18        while(zero>0){
19            nums[i]=0;
20            i++;
21            zero--;
22        }
23        while(one>0){
24            nums[i]=1;
25            i++;
26            one--;
27        }
28        while(two>0){
29            nums[i]=2;
30            i++;
31            two--;
32        }
33
34    }
35}