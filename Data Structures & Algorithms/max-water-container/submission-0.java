class Solution {
    public int maxArea(int[] heights) {
        int max=Integer.MIN_VALUE;
        int curr=0;
        int l=0;
        int r=heights.length-1;
        while(l<r){
            int height=Math.min(heights[l],heights[r]);
            int width=r-l;
            curr=height*width;
            max=Math.max(curr,max);
            if(heights[l]>heights[r]){
                r--;
            }else{
                l++;
            }
        }
        return max;
    }
}
