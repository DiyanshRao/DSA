class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int []> arr = new ArrayList<>();

        int [] prev = intervals[0];

        for(int i =1; i < intervals.length; i++){
            int [] curr = intervals[i];

            if(prev[1] >= curr[0]){
                if(prev[1] < curr[1]){
                    prev[1] = curr[1];
                }
                
            }else{
                arr.add(prev);
                prev = curr;
            } 
        }

        arr.add(prev); 
       
        int[][] ans = new int [arr.size()][];

        int i =0;
        for(int [] x : arr){
            ans[i++] = x;
        }    
        return ans;
    }
}
