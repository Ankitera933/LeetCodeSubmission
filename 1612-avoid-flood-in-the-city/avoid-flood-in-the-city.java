

class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Map<Integer, Integer> fullLake = new HashMap<>(); // lake -> last day it was filled
        TreeSet<Integer> dryDays = new TreeSet<>();       // store days where rains[i] == 0

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                // Can dry a lake today
                dryDays.add(i);
                ans[i] = 1; // temporary, will be updated later if needed
            } else {
                ans[i] = -1; // raining day
                int lake = rains[i];

                if (fullLake.containsKey(lake)) {
                    // Lake is already full — find a dry day after last rain
                    Integer dryDay = dryDays.higher(fullLake.get(lake));
                    if (dryDay == null) {
                        // No available dry day — flood happens
                        return new int[0];
                    }
                    // Use this dry day to dry the lake
                    ans[dryDay] = lake;
                    dryDays.remove(dryDay);
                }
                // Mark this lake as filled today
                fullLake.put(lake, i);
            }
        }
        return ans;
    }
}
