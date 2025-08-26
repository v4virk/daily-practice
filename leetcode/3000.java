class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {

        // Map: diagonal length → max area for that diagonal
        HashMap<Double, Integer> max_d = new HashMap<>();

        for (int i = 0; i < dimensions.length; i++) {
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            double D = Math.sqrt(l * l + w * w);
            int area = l * w;

            // If diagonal already exists, keep the larger area
            max_d.put(D, Math.max(max_d.getOrDefault(D, 0), area));
        }

        // Get the largest diagonal
        double max_k = Collections.max(max_d.keySet());

        // Return the max area for that diagonal
        return max_d.get(max_k);
    }
}
