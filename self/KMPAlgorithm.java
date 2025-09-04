public class KMPAlgorithm {
    public static int kmpSearch(String text, String pattern) {
        
        if (pattern.length() == 0) return 0;
        int[] lps = buildLPS(pattern);
        int i = 0, j = 0;

        while (i < text.length()) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == pattern.length()) {
                return i - j;  // found pattern
            } else if (i < text.length() && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return -1;  // pattern not found
    }

    private static int[] buildLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int length = 0; // length of the previous longest prefix suffix
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        String text = "abxabcabcaby";
        String pattern = "abcaby";
        System.out.println("Pattern found at index: " + kmpSearch(text, pattern));
    }
}

