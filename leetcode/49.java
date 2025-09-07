// Reorganize String

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());// check if the new sorted array is present or not 
                
            }

            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }
}

