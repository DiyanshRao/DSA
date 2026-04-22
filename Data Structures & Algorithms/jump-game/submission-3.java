class Solution {
    public boolean canJump(int[] nums) {
        int reach=0;
        if(nums.length ==1 ){
            return true;
        }
        for(int i =0; i < nums.length; i++){
            reach = Math.max(reach, nums[i] +i );
            if(reach <= i ){
                return false;
            }
            if(reach >= nums.length -1){
                return true;
            }
        }

        return false;
    }
}
