class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> collection = new HashSet<>();
        for(int i =0; i< nums.length ;i++){
            if(collection.contains(nums[i])){
                return true;
            }
            collection.add(nums[i]);
        }
        return false;
    }
}
