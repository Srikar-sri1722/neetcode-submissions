class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro=1;
        int z=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                z++;
                continue;
            }
            pro*=nums[i];
        }
        int res[]=new int[nums.length];
        for(int i=0;i<n;i++){
            if(z>1){
                res[i]=0;
            }
            else if(z==1&&nums[i]!=0){
                res[i]=0;
            }else if (z==1&&nums[i]==0){
                res[i]=pro;
            }else{
                res[i]=pro/nums[i];
            }
        }
        return res;
    }
}  
