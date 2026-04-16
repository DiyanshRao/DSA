class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(
            (a,b) -> 
            Integer.compare(
                distance(b[0],b[1]) , distance(a[0],a[1])
                )
        );

        
        for(int i=0 ;i < points.length; i++){
            int [] arr = points[i];
                queue.offer(new int[] {arr[0], arr[1]});

                if(queue.size() > k) {
                    queue.poll();
                }
        }

        int [][] sol = new int[queue.size()][2];
        int i =0;
        while(!queue.isEmpty()){
            sol[i++] = queue.poll();
        }

        return sol;


    }

    private int distance(int x,int y){
        return x*x + y*y;
    }
}
