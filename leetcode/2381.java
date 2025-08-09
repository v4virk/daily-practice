class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        // difference array of srting size 

        int[] diff = new int[s.length()];

        for(int[] shift : shifts){
            int start = shift[0]; //starting index
            int end = shift[1]; //ending index
            int drn = shift[2]; //direction of moving the value

            // forward shift
            if(drn == 1){ 
                diff[start] += 1;
                if(end + 1 < s.length()){ //check if the last index doent goes out of bound
                    diff[end+1] -= 1; // since we will be doing a cummalitive sum at the end so the negative adition wil cancel out at the end 
                }
            }
            else{
                diff[start] -= 1;
                if(end + 1 < s.length()){
                    diff[end + 1] += 1; // sign reverses here 
                }
            }

        }

        // cummaltive sum value
        for(int i = 1; i < s.length(); i++){ // we need to add the form index 0 ; so if we start form 0 we would be accessind index -1 which is not possible
            diff[i] += diff[i-1];
        }

        StringBuilder result = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++){
            int shift = diff[i] % 26; // shift range is inside [0-25]

            if(shift<0){
                shift += 26; // backward values
            }


            char newC = (char) (((result.charAt(i) - 'a' + shift) % 26) + 'a'); // % 26 if  it goes out of bound value
            result.setCharAt(i, newC);
        }
        return result.toString();
    }
}