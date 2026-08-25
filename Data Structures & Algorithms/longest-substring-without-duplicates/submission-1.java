class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        Set<Character>set=new HashSet<>();
        int l=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}
