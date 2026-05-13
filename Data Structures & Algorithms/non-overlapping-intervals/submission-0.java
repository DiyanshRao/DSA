class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        int [] prev = intervals[0];

        int res = 0;

        for(int i =1; i < intervals.length; i++){
            int [] curr = intervals[i];
            if(prev[1] <= curr[0]){
                prev = curr;
            }else{
                res++;
                prev[1] = Math.min(prev[1],curr[1]);
            }

        } 

        return res;
    }
}
