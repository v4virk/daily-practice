// n unique values such that they add up to 0


class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer> li = new ArrayList<>();
        int count = 1; // 

        if (n % 2 == 0) { // for even size array
            int i = 0;
            while (i < n) { 
                li.add(count);
                li.add(-count);
                count++;
                i += 2;
            }
        } else {
            li.add(0); // add single zero in case of odd size 

            int i = 1;
            while (i < n) {
                li.add(count);
                li.add(-count);
                count++;
                i += 2;
            }
        }

        int[] arr = li.stream().mapToInt(Integer::intValue).toArray();
        return arr;  
    }
}