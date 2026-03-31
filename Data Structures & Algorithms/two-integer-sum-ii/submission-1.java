class Solution {
    public int[] twoSum(int[] numbers, int target) {

        /* Two Pointers start and end */
        int first = 0;
        int second = numbers.length -1;
        
        if(second < 1){
            return null;
        }

        while(first < second){
            int sum = numbers[first] + numbers[second];
            if( sum == target){
                return new int [] {first + 1, second +1};
            }
            if(sum < target ){
                first++;
            }else{
                second--;
            }

        }
        return null;
        
    }
}
