       //Create a queue
        Queue<Integer> queue = new LinkedList<>();
        //Create a boolean to check visited or not for whole graph length
        boolean[] visited = new boolean[graph.length];
        //initialize ture for the first one 
        visited[start] = true;
        //start adding first element for first one
        queue.add(start);
        
        //while queue is not empty check for rooot
        while (!queue.isEmpty()) {
            //initialize a node
            int node = queue.poll();
            //print node
            System.out.print(node + " ");
            
            //Loop whle graph length
            for (int i = 0; i < graph.length; i++) {
                //graph node =1 check for exist or not
                if (graph[node][i] == 1 && !visited[i]) {
                    //if exist and not visited set true and queue
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }