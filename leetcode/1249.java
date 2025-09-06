
// minimize parentheses removal // min removal

import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {

        ArrayList<Integer> li = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {       // use single quotes
                li.add(i);
            }
           else if (s.charAt(i) == ')') {
                if (li.size() == 0 || s.charAt(li.get(li.size() - 1)) != '(') {
                    // add unmatched ')' index to the list
                    li.add(i);
                } else {
                    li.remove(li.size() - 1);
                }
            }
        }

        if (li.size() == 0) {
            return s;
        } else {
            // Remove characters from the end to avoid messing up indices
            for (int i = li.size() - 1; i >= 0; i--) {
                int a = li.get(i);
                s = s.substring(0, a) + s.substring(a + 1);
            }
            return s;
        }
    }
}

