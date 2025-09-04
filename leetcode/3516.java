//find the closest distance of the value ;


class Solution {
    public int findClosest(int x, int y, int z) {
        double d1 = Math.abs(x - z);
        double d2 = Math.abs(y - z);




        if(d1<d2){
            return 1;
        }
        else if(d2<d1){
            return 2;
        }
        else{
            return 0;
        }



    }
}