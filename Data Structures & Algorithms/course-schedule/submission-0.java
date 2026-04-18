class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        int [] indegree = new int[numCourses];

        for(int [] course : prerequisites){
            int key = course[1];
            int val = course[0];

            adj.computeIfAbsent(key,k -> new ArrayList<>()).add(val);
            indegree[val]++;
        }

        for(int i =0; i< numCourses;i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            int index = queue.poll();
            List<Integer> arr = adj.getOrDefault(index, new ArrayList<>());

            for(int pre : arr){
                indegree[pre]--;
                if(indegree[pre] == 0) queue.offer(pre);
            }
        }

        for(int i =0; i < numCourses; i++){
            if(indegree[i] != 0){
                return false;
            }
        }

        return true;

        
    }
}
