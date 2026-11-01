class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int i=0;
        int j=0;
        List<Integer>l=new ArrayList<>();
        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]){
                l.add(nums1[i]);
                i++;
            }else{
                l.add(nums2[j]);
                j++;
            }
        }
        while(i<m){
            l.add(nums1[i++]);
        }
        while(j<n){
            l.add(nums2[j++]);
        }
        double ans;
        int s=l.size();
        if(s%2!=0){
            ans=l.get(s/2);
        }else{
            ans=(l.get(s/2-1)+l.get(s/2))/2.0;
        }
        return ans;
    }
}
