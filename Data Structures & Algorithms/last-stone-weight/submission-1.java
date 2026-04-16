class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> Integer.compare(b,a) );

        for(int i =0; i< stones.length; i++){
            queue.offer(stones[i]);
        }

        Integer val = queue.poll();

        while(!queue.isEmpty()){

            val = Math.abs(val - queue.poll());
            queue.offer(val);
            val = queue.poll();
        }

        return val;
    }
}
