// merge two strings alternately

class Solution {
    public String mergeAlternately(String word1, String word2) {

        int w1_s = word1.length();
        int w2_s = word2.length();

        int size =  Math.min(w1_s, w2_s);

        StringBuilder sb = new StringBuilder();




        for(int i = 0; i < size; i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));

        }
        if(w1_s > size){
            sb.append(word1.substring(size));
        }
        else{
            sb.append(word2.substring(size));
        }


        return sb.toString();
    
    }
}