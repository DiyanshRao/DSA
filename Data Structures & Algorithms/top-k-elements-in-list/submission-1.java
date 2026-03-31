class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)-> a[0] - b[0]);

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) +1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            q.offer(new int[] {entry.getValue(),entry.getKey()});

            if(q.size() > k){
                q.poll();
            }
        }

        int[] res = new int[k];
        int i =0;
        while(!q.isEmpty()){
            int [] arr = q.poll();
            res[i++] = arr[1];
        }

        return res;


    }
}
