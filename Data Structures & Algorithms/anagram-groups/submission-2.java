class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(int i =0; i < strs.length; i++){
            
            String val = sort(strs[i]);

            map.computeIfAbsent(val,k -> new ArrayList<>()).add(strs[i]);
        }


        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;

    }

    private String sort(String str){
        char [] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
     }
}
