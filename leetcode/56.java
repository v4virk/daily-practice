// merge the intevals ;


class Solution2 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // Sort based on start point
        
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        
        for (int i = 1; i < intervals.length; i++) {
            int curr_start = intervals[i][0];
            int curr_end = intervals[i][1];
            
            // If no overlap
            if (curr_start > result.get(result.size() - 1)[1]) {
                result.add(intervals[i]);
            } else {
                // There is an overlap
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], curr_end);
            }
        }
        
        return result.toArray(new int[result.size()][]);
    }
}
