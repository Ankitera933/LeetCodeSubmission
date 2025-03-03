import java.util.*;

public class Solution {
    
    
    public int findReachableCities(int startCity, int n, List<int[]>[] graph, int distanceThreshold) {
        // Distance array, initialized to a large number
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[startCity] = 0;
        
        // Min-heap for Dijkstra's algorithm
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{startCity, 0});
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0], d = curr[1];
            
            if (d > dist[u]) continue;
            
            for (int[] neighbor : graph[u]) {
                int v = neighbor[0], weight = neighbor[1];
                int newDist = d + weight;
                if (newDist < dist[v]) {
                    dist[v] = newDist;
                    pq.offer(new int[]{v, newDist});
                }
            }
        }
        
       
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (dist[i] <= distanceThreshold) {
                count++;
            }
        }
        return count;
    }

    // Main method to find the city with the smallest number of reachable cities
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        // Build the adjacency list
        List<int[]>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int from = edge[0], to = edge[1], weight = edge[2];
            graph[from].add(new int[]{to, weight});
            graph[to].add(new int[]{from, weight});
        }
        
        int minReachableCities = Integer.MAX_VALUE;
        int cityWithMinReachableCities = -1;
        
        
        for (int i = 0; i < n; i++) {
            int reachableCities = findReachableCities(i, n, graph, distanceThreshold);
            if (reachableCities < minReachableCities) {
                minReachableCities = reachableCities;
                cityWithMinReachableCities = i;
            } else if (reachableCities == minReachableCities) {
                
                cityWithMinReachableCities = Math.max(cityWithMinReachableCities, i);
            }
        }
        
        return cityWithMinReachableCities;
    }
}
