class Solution {
    public int[] topKFrequent(int[] nums, int k) {


        int n = nums.length;
        int [] sol = new int[k];
        List<Integer> [] arr = new List[n+1];
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i =0; i< n; i++){
            int num = nums[i];
            map.put(num, map.getOrDefault(num,0) +1);
            arr[i] = new ArrayList<>();
        }

        arr[n] = new ArrayList<>();


    
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            arr[entry.getValue()].add(entry.getKey());
        }

        int i = n;
        int index =0;
        while(k > 0 && i >=0){
            List<Integer> a = arr[i];
            for(int j = 0; j < a.size() && k >0 ; j++){
                sol[index++] = a.get(j);
                k--;
            }
            
            i--;
        }

        return sol;
    }
}
