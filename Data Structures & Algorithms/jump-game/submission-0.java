class Solution {
    public boolean canJump(int[] nums) {
        //dfs

        return dfs(nums,0);
    }

    private boolean dfs(int[] nums, int i){
        if(i > nums.length){
            return false;
        }
        if(i == nums.length -1){
            return true;
        }

        boolean bool = false;
        for(int idx=1; idx <= nums[i]; idx++ ){
            bool = bool || dfs(nums,i+idx);
        }

        return bool;
    }
}
