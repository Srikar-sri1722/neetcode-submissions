class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int longest=0;
        for(int i:set){
            if(!set.contains(i-1)){
                int count=1;
                int x=i;
                while(set.contains(x+1)){
                    count++;
                    x++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
