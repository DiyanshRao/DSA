class KthLargest {
    int size;
    PriorityQueue<Integer> queue;
    public KthLargest(int k, int[] nums) {
        this.size = k;
        this.queue = new PriorityQueue<>((a,b) -> Integer.compare(a, b));
        
        for(int i =0; i < nums.length; i++){

            queue.offer(nums[i]);

            if(queue.size() > k ){
                queue.poll();
            }
        }
    }
    
    public int add(int val) {
        
        queue.offer(val);

        if(queue.size() > size){
            queue.poll();
        }

        return queue.peek();
    }
}
