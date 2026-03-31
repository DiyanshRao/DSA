class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       Deque<Integer>  queue = new LinkedList<>();
       int n = nums.length;
       int [] output = new int [n - k + 1];
        int l =0;
        int r = 0;

        while(r < n){

            //removing the smaller elements from the front of queue
            while(!queue.isEmpty() && nums[queue.getLast()] < nums[r]){
                queue.removeLast();
            }
            
            //add the element to the queue
            queue.addLast(r);


            //removing the element from starting of queue when window moves
            if(l > queue.getFirst()){
                queue.removeFirst();
            }

            if(r +1 >= k ){
                output[l]=nums[queue.getFirst()];
                l++;
            }

            r++;


        }

        return output;
    }
}
