class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> arr = new ArrayList<>();

        for(int [] curr : intervals){

            if(newInterval == null || newInterval[0] > curr[1]){
                arr.add(curr);
            }else if(curr[0] > newInterval[1]){
                arr.add(newInterval);
                arr.add(curr);
                newInterval= null;
            }else{
                newInterval[0] = Math.min(newInterval[0],curr[0]);
                newInterval[1] = Math.max(newInterval[1], curr[1]);
            }

        }

        if(newInterval != null) arr.add(newInterval);
        return arr.toArray(new int[arr.size()][]);
    }
}
