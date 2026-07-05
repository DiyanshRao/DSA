class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1); 
        }

        for(int c : map.values()){
            ans += c * (c -1) /2;
        }

        return ans;
    }
}