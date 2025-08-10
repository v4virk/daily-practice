import java.util.*;
import java.lang.StringBuilder;



class Solution {
    public int reverse(int x) {
        
        boolean isN = x<0;
        x = Math.abs(x);

        StringBuilder s = new StringBuilder(String.valueOf(x));
        s.reverse();

        try{
            int rev = Integer.parseInt(s.toString());
            return isN ? -rev : rev;
        }catch(NumberFormatException e){
            return 0;
        }


        
    }
}