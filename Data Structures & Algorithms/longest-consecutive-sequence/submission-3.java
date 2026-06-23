class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        int ans =0;

        for(int num : nums){
            set.add(num);
        }

        for(int num : nums){
            if(set.contains(num + 1)) continue;

            int count =1;
            int x = num;
            while(set.contains(x -1)){
                x -=1;
                count++;
            }

            ans = Math.max(ans,count);
        }

        return ans;
    }
}
