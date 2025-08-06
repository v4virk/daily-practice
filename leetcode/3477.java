//left most availble basket 

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;
        for(int i : fruits){
            boolean placed = false;
            for(int j = 0; j<baskets.length; j++){
                if(i <= baskets[j]){
                    placed = true;
                    baskets[j] = -1;
                    break; 
                }
            }
            if(!placed){
                count++;
            }

        }

        return count;
        
    }
}