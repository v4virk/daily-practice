class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        HashMap<Integer, List<Integer>> hp = new HashMap<>();

    // filling of the map

        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                int key = i+j;
                hp.putIfAbsent(key, new ArrayList<>()); //intialize the list declared above
                hp.get(key).add(mat[i][j]);
            }
        }


        List<Integer> li = new ArrayList<>();
        boolean flip = true;

        for(int i = 0; i<((mat.length) + (mat[0].length) - 1 ); i++){
            List<Integer> diagonal = hp.get(i); // this list stores the elements in a list retrieved from hashmap

            if(diagonal == null) continue;

            if(flip){
                Collections.reverse(diagonal);
            }
            li.addAll(diagonal);

            flip = !flip; // change since alternate needs to be updated 

        }

        //array 
        int[] result = new int[li.size()];
        for (int i = 0; i < li.size(); i++) {
            result[i] = li.get(i);
        }
        
        return result;
    }
        
}
