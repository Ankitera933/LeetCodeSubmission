
import java.util.*;

class Solution {
    public int[] maxPoints(int[][] grid, int[] queries) {
        int m = grid.length, n = grid[0].length;
        int[] res = new int[queries.length];
        boolean[][] visited = new boolean[m][n];

        // Min-heap based on grid value
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{grid[0][0], 0, 0});
        visited[0][0] = true;

        // Store queries with their original index
        int[][] sortedQueries = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            sortedQueries[i][0] = queries[i];
            sortedQueries[i][1] = i;
        }
        Arrays.sort(sortedQueries, Comparator.comparingInt(a -> a[0]));

        int index = 0, count = 0;
        int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        while (!pq.isEmpty()) {
            int[] top = pq.peek();

            // Process queries while the top of the queue is below the threshold
            while (index < queries.length && sortedQueries[index][0] <= top[0]) {
                res[sortedQueries[index++][1]] = count;
            }

            if (index == queries.length) break;

            pq.poll();
            count++;

            int x = top[1], y = top[2];

            // Explore neighbors
            for (int[] d : directions) {
                int nx = x + d[0], ny = y + d[1];
                if (nx >= 0 && ny >= 0 && nx < m && ny < n && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    pq.offer(new int[]{grid[nx][ny], nx, ny});
                }
            }
        }

        // Fill remaining results with count
        while (index < queries.length) {
            res[sortedQueries[index++][1]] = count;
        }

        return res;
    }
}