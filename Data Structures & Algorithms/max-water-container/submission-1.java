class Solution {
    public int maxArea(int[] heights) {
        int left =0;
        int right = heights.length -1;
        int sol = 0;

        while(left < right){
            Integer height = heights[left] < heights[right] ? heights[left] : heights[right];
            Integer area = (right - left) * height;

            sol = Math.max(sol, area);

            if(heights[left] <=heights[right]){
                left++;
            }else{
                right--;
            }

        }
        return sol;
        
    }
}
