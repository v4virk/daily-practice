// iteration 1 brute force

class Solution {
    public int numberOfPairs(int[][] points) {
        int count = 0;

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