class Solution {
    public char findTheDifference(String s, String t) {
       //xor
      int x = 0;

      for(char ch : s.toCharArray()){
        x^=ch;
      }
      for(char ch2: t.toCharArray()){
        x^=ch2;
      }

      return (char) x;
        
    }
}