import java.util.*;

class Solution {
    public long maximumImportance(int n, int[][] roads) {
        // Step 1: Count the frequency of each city in the roads
        int[] cityFrequency = new int[n];
        for (int[] road : roads) {
            int cityA = road[0];
            int cityB = road[1];
            cityFrequency[cityA]++;
            cityFrequency[cityB]++;
        }

        // Step 2: Create a list of cities with their frequencies
        List<int[]> cityWithFrequency = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cityWithFrequency.add(new int[]{cityFrequency[i], i});
        }

        // Step 3: Sort the cities by frequency in descending order
        cityWithFrequency.sort((a, b) -> b[0] - a[0]);

        // Step 4: Assign values from n to 1 based on frequency
        int[] cityValues = new int[n];
        for (int i = 0; i < n; i++) {
            cityValues[cityWithFrequency.get(i)[1]] = n - i;
        }

        // Step 5: Calculate the total importance of all roads
        long totalImportance = 0;
        for (int[] road : roads) {
            int cityA = road[0];
            int cityB = road[1];
            totalImportance += cityValues[cityA] + cityValues[cityB];
        }

        return totalImportance;
    }

    
}
