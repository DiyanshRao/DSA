class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> ans  = new ArrayList<>();

        for(String currentString : strs){
            int [] arr = new int[26];
            for(char x : currentString.toCharArray() ){
                int index = x - 'a';
                arr[index]++;
            }
            StringBuilder sb = new StringBuilder();
            for(int val : arr){
                sb.append(val).append('#');
            }

            String key = sb.toString();

            if(map.containsKey(key)){
                map.get(key).add(currentString);
            }else{
                List<String> valueArray = new ArrayList<>();
                valueArray.add(currentString);
                map.put(key,valueArray);
            }
        }

        for(List<String> angrams : map.values()){
            ans.add(angrams);
        }

        return ans;

    }
}
