// iteration 1 brute force

class Solution {
    public int numberOfPairs(int[][] points) {
        int count = 0;
        Ara

        // upper valid point     
        for(int i = 0; i<points.length; i++){

            int x1 = points[i][0];
            int y1 = points[i][1];

            //lower valid point
            for(int j = 0; j<points.length; j++){
                if(j == i){
                    continue;
                }

                int x2 = points[j][0];
                int y2 = points[j][1];

                if(x2 >= x1 && y1 >= y2){
                    boolean check = false;
                    
                    //checking condition
                    for(int k = 0; k < points.length; k++){
                        if(k == i || k ==j) continue;
                        int x3 = points[k][0];
                        int y3 = points[k][1];

                        if(x3 >= x1 && x3 <= x2 && y3 >= y2 && y3 <= y1) {
                            check =true;

                            break;
                        }
                    }
                    if(!check){
                        count++;
                    }
                }
            }
        }
        

        return count;
    }
}



// iteration 2 optimized 
import java.util.*;

class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;

        // Sort: x ascending, if x same then sort as y descending
        Arrays.sort(points, (point1, point2) -> {
            if (point1[0] == point2[0]) {
                return point2[1] - point1[1];
            }
            return point1[0] - point2[0];
        });

        int result = 0;

        for (int i = 0; i < n; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];   // upper left

            int bestY = Integer.MIN_VALUE;

            for (int j = i + 1; j < n; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];   // lower right

                // Condition: (x2, y2) must be above (x1, y1)
                if (y2 > y1) { //not lower right
                    continue;
                }

                if (y2 > bestY) {
                    result++;
                    bestY = y2;
                }
            }
        }

        return result;
    }
};