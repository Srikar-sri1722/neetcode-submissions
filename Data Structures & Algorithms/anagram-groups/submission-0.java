class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char[] a=s.toCharArray();
            Arrays.sort(a);
            String key=new String(a);
            if(!map.containsKey(key)){
                List<String> ans=new ArrayList<>();
                map.put(key,ans);
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}