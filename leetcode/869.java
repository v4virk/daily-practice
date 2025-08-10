class Solution {
    public String getSortedStr(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public boolean reorderedPowerOf2(int n) {
        String sortedStr = getSortedStr(n);

        // Check all powers of 2 up to 2^29
        for (int p = 0; p <= 29; p++) {
            if (sortedStr.equals(getSortedStr(1 << p))) {
                return true;
            }
        }

        return false;
    }
}
