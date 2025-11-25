class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        if (k <= 0 || s == null || s.length() < k) {
            return false; // Invalid input or string too short
        }

        for (int i = 0; i <= s.length() - k; i++) {
            // i is the starting index of the potential substring
            // The substring is s.substring(i, i + k)
            // All characters in this substring must be the same
            char commonChar = s.charAt(i);
            boolean allSame = true;
            for (int j = 1; j < k; j++) {
                if (s.charAt(i + j) != commonChar) {
                    allSame = false;
                    break;
                }
            }

            if (allSame) {
                // Check the character before the substring
                boolean prevCharCondition = true;
                if (i > 0) { // If there is a character before
                    if (s.charAt(i - 1) == commonChar) {
                        prevCharCondition = false;
                    }
                }

                // Check the character after the substring
                boolean nextCharCondition = true;
                if (i + k < s.length()) { // If there is a character after
                    if (s.charAt(i + k) == commonChar) {
                        nextCharCondition = false;
                    }
                }

                if (prevCharCondition && nextCharCondition) {
                    return true; // Found a special substring
                }
            }
        }
        return false; // No special substring found
    }
}