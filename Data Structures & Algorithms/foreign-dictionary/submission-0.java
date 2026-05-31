class Solution {
    public String foreignDictionary(String[] words) {
    // create an directed graph 
    // calcualte indegree
    // check for invalid case 
    //Khans BFS algo for finding loop 
    //return ans
        Map<Character,Set<Character>> adj = new HashMap<>();
        Map<Character,Integer> indegree = new HashMap<>();

        for(String word : words){
            for(char ch : word.toCharArray()){
                adj.putIfAbsent(ch,new HashSet<>());
                indegree.putIfAbsent(ch,0);
            }
        }

        for(int i =0; i < words.length - 1; i++){
            String w1 = words[i];
            String w2 = words[i+1];

            int minLen = Math.min(w1.length(),w2.length());

            if(w1.length() > w2.length() && w1.substring(0,minLen).equals(w2.substring(0,minLen))){
                return "";
            }

            for(int j =0; j < minLen; j++){
                if(w1.charAt(j) != w2.charAt(j)){
                    if( !adj.get(w1.charAt(j)).contains(w2.charAt(j))){
                        adj.get(w1.charAt(j)).add(w2.charAt(j));
                        indegree.put(w2.charAt(j),indegree.get(w2.charAt(j)) +1);
                    }

                    break;
                }
            }

            
          

        }

        Queue<Character> queue = new LinkedList<>();

            for(char ch : indegree.keySet()){
                if(indegree.get(ch) == 0){
                    queue.offer(ch);
                }
            }

            StringBuilder res = new StringBuilder();

            while(!queue.isEmpty()){
                char ch = queue.poll();
                res.append(ch);

                for(char nei : adj.get(ch)){
                    indegree.put(nei, indegree.get(nei) -1);
                    if(indegree.get(nei) == 0){
                        queue.offer(nei);
                    }
                }
            }

          if(res.length() != indegree.size() ){
                return "";
            }

            return res.toString();
    }
}
