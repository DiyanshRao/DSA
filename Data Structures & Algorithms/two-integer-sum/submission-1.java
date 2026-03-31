class Solution {
    public int[] twoSum(int[] nums, int target) {
        /* store the values target - nums[i] in map and check if it contains the key */
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    

        for(int i =0; i < nums.length; i++){
            // put the target - values in the map after comapring
            int key = target - nums[i];
            if(map.containsKey(key)){
               return new int[] {map.get(key),i};
            }else{
                map.put(nums[i] ,i);
            }

        }
        
        return null;
        
    }
}
