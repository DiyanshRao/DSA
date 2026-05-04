class Solution {
    public int countComponents(int n, int[][] edges) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int [] edge : edges){
            int key = edge[0];
            int val = edge[1];
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(val);
            map.computeIfAbsent(val, k -> new ArrayList<>()).add(key);
        }

        for(int i =0; i < n; i++){
            if(set.contains(i)) continue;
            count++;
            set.add(i);
            dfs(i,map,set);
        }

        return count;

    }

    private void dfs(int curr, HashMap<Integer,List<Integer>> map, HashSet<Integer> set){

        for(int nei : map.getOrDefault(curr,new ArrayList<>())){
            if(set.contains(nei)) continue;
            set.add(nei);
            dfs(nei,map,set);
            
        }
    }
}
