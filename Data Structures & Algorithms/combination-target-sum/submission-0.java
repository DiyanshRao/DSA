class Solution {
    List<List<Integer>> sol = new ArrayList<>();
    Integer target;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        this.target = target;
        Arrays.sort(nums);
        dfs(nums,new ArrayList<>(),0,0);
        return sol;
    }

    private void dfs(int[] nums, List<Integer> arr, int index,int sum){
        if(sum == target){
            sol.add(new ArrayList<>(arr));
            return;
        }

        for(int i = index; i < nums.length; i++){
            if(nums[i] + sum  > target) break;
            arr.add(nums[i]);
            dfs(nums,arr,i,sum + nums[i]);
            arr.remove( arr.size()-1); 
          
        }
        return;
    }
}
