class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer,Integer> freq = new TreeMap<>();

        for(int num : arr1){
            freq.merge(num, 1, Integer::sum);
        }

        int idx = 0;

        for(int i =0; i < arr2.length; i++){

            int key = arr2[i];
            int count = freq.get(key);
            freq.remove(key);
            while(count > 0) {
                arr1[idx++] = key;
                count--;
            }
        }

        for(Map.Entry<Integer,Integer> key : freq.entrySet()){
            int count = key.getValue();

            while(count > 0){
                count--;
                arr1[idx++] = key.getKey();
            }
        }

        return arr1;


    }
}