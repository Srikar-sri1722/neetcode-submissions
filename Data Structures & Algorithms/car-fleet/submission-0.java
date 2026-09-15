class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] arr=new double[speed.length][2];
        for(int i=0;i<speed.length;i++){
            arr[i][0]=position[i];
            arr[i][1]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(arr,(a,b)->Double.compare(b[0],a[0]));
        Stack<Float>st=new Stack<>();
        int fleet=0;
        double prev=0;
        for(int i=0;i<arr.length;i++){
            double time=arr[i][1];
            if(time>prev){
                fleet++;
                prev=time;
            }
        }
        return fleet;
    }
}
