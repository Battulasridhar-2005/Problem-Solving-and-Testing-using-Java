class Solution {

    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        // Try every possible substring length
        for (int len = 1; len <= n / 2; len++) {

            // Length must divide full string length
            if (n % len == 0) {

                String sub = s.substring(0, len);
                StringBuilder sb = new StringBuilder();

                int repeat = n / len;

                for (int i = 0; i < repeat; i++) {
                    sb.append(sub);
                }

                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }
}