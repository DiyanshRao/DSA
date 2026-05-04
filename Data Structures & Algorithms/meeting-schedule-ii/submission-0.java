/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals, (a,b) -> Integer.compare(a.start, b.start));

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(Interval curr : intervals){
            if(!heap.isEmpty() && heap.peek() <= curr.start){
                heap.poll();
            }
            heap.offer(curr.end);
        }

        return heap.size();
    }
}
