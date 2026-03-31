class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /* sort and compare them with the key in map  return the values from map */

        HashMap<String,ArrayList<String>> store = new HashMap<>();
        List<List<String>> ans =  new ArrayList<>();

        for(int i =0; i < strs.length; i++){
             String key = String.join("", Arrays.stream(strs[i].split(""))
                                               .sorted()
                                               .toArray(String[]::new));
            if(store.containsKey(key)){
                store.get(key).add(strs[i]);
            }else{
                store.put(key, new ArrayList<>(Arrays.asList(strs[i])));
            }

        }

        for(String key : store.keySet()){
            ans.add(store.get(key));
        }
        return ans;
        
    }
}
