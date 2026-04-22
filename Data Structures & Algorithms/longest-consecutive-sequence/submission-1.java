class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count =1, sol=0;
        for(int num : nums){
            set.add(num);
        }

        for(int num : set){
            if(set.contains(num -1)){
                continue;
            }

            int curr  = num;
            while(set.contains(curr+1)){
                count++;
                curr++;
            }

            sol = Math.max(sol, count);
            count =1;
        }

        return sol;

    }
}
