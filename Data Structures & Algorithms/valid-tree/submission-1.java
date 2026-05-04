class Solution {
    public boolean validTree(int n, int[][] edges) {
        HashSet<Integer> visited = new HashSet<>();
        List<Integer> [] adj = new List[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for(int [] edge : edges){
            int v = edge[0];
            int k = edge[1];

            adj[v].add(k);
            adj[k].add(v);            
        }

        if(!dfs(adj,visited,0,-1)) return false;

        return visited.size() == n;
    }

    private boolean dfs(List<Integer> [] adj, HashSet<Integer> visited, int curr, int parent){
        
        if(visited.contains(curr)) return false;

        visited.add(curr);

        for(int arr : adj[curr]){
            if(arr == parent) continue;
             if (!dfs(adj, visited, arr, curr)) {
                return false;
            }
            
        }

        return true;
    }
}
