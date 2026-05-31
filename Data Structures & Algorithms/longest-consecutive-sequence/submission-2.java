class Solution {
    public int longestConsecutive(int[] nums) {

        // create a set  && add all values
        // iterate through arry and try to find val +1 in set if contains then there exist a greater element 
        // if fails  caluclate for this element 
        // return max len
        Set<Integer> set = new HashSet<>();

        int res = 0;

        for(int num : nums){
            set.add(num);
        }

        for(int num : nums){
            if(set.contains(num +1)) continue;
            int x = num;
            int curr = 0;
            while(set.contains(x)){
                curr++;
                x--;
            }

            res = Math.max(res,curr);
        }

        return res;
    }
}
