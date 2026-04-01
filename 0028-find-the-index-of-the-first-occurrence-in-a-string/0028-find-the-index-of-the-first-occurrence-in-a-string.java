class Solution {

    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        int n = haystack.length();
        int m = needle.length();

        // Loop until remaining length is enough for needle
        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            // Compare characters
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // If all characters matched
            if (j == m) {
                return i;
            }
        }

        return -1;
    }
}