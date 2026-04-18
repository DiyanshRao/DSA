class MedianFinder {

    PriorityQueue<Integer> small;
    PriorityQueue<Integer> large;

    public MedianFinder() {
        this.small = new PriorityQueue<>(Collections.reverseOrder());
        this.large = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        
        small.offer(num);

        if(!large.isEmpty() && small.peek() > large.peek()){
            large.offer(small.poll());
        }

        if(small.size() > large.size() +1){
            large.offer(small.poll());
        }else if(large.size() > small.size()){
            small.offer(large.poll());
        }
    }
    
    public double findMedian() {
        if(small.size() > large.size()){
            return small.peek();
        }

        return (small.peek() + large.peek()) /2.0;
    }
}
