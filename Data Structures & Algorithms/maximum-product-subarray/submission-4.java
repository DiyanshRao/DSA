class Solution {
    public int maxProduct(int[] nums) {
        int currMax = 1;
        int currMin =1;
        int res = nums[0];
        for(int num : nums){
            int tmp = currMax * num;
            currMax = Math.max(Math.max(tmp,num * currMin), num);
            currMin = Math.min(Math.min(tmp,num * currMin), num);
            res = Math.max(res, currMax);
        }

        return res;
    }
}
