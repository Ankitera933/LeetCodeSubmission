import java.util.Arrays;

class Solution {
    private int[] parent, edgeCount, componentSize;

    private int findRoot(int node) {
        if (parent[node] == -1) return node;
        return parent[node] = findRoot(parent[node]); // Path compression
    }

    private void unionComponents(int node1, int node2) {
        int root1 = findRoot(node1), root2 = findRoot(node2);
        edgeCount[root1]++; // Increment edge count for the component

        if (root1 != root2) {
            parent[root2] = root1;
            edgeCount[root1] += edgeCount[root2]; 
            componentSize[root1] += componentSize[root2];
        }
    }

    public int countCompleteComponents(int n, int[][] edges) {
        parent = new int[n];
        edgeCount = new int[n];
        componentSize = new int[n];
        Arrays.fill(parent, -1);
        Arrays.fill(componentSize, 1);

        for (int[] edge : edges) {
            unionComponents(edge[0], edge[1]);
            unionComponents(edge[1], edge[0]); // Ensure bidirectional count
        }

        int completeComponents = 0;
        for (int i = 0; i < n; i++) {
            if (findRoot(i) == i) { // Check only the root of the component
                int nodes = componentSize[i];
                int expectedEdges = nodes * (nodes - 1) / 2;
                if (edgeCount[i] / 2 == expectedEdges) { // Correct edge counting
                    completeComponents++;
                }
            }
        }
        return completeComponents;
    }
}
