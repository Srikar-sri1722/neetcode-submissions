class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int i:stones){
            pq.add(i);
        }
        while(!pq.isEmpty()&&pq.size()!=1){
            int x=pq.poll();
            int y=pq.poll();
            if(y<x){
                pq.add(x-y);
            }
        }
        return pq.size()==0?0:pq.poll();
    }
}
