class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> r = new ArrayList<String>();

        for(int h = 0; h < 12; h++){ // hours 
            for(int m = 0; m < 60; m++){ //minutes
                if(Integer.bitCount(h) + Integer.bitCount(m) == turnedOn){
                    
                    if(m<10){
                        r.add(String.format("%d:0%d",h,m));
                    }
                    else{
                        r.add(String.format("%d:%d",h,m));

                    }
                }
            }
        }



        return r;
        
    }
}