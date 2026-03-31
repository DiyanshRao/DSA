class Solution {
    public int longestConsecutive(int[] nums) {
        int sol = 0;

        HashSet<Integer> set = new HashSet<>();

        for ( int i = 0; i < nums.length; i++ ) {
            set.add(nums[i]);
        }

        for ( int i = 0; i < nums.length; i++ ) {

            if(set.contains(nums[i] -1)){
                continue;
            }

            int x = nums[i];
            int count =1;
            while(set.contains(x + 1)){
                x++;
                count++;
            }

            sol = Math.max(sol,count);

        }

        return sol;
    }
}
