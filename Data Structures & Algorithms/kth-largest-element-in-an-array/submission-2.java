class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> Integer.compare(a,b));

        for(int num : nums){
            queue.offer(num);

            if(queue.size() > k ){
                queue.poll();
            }
        }

        return queue.peek();
    }
}
