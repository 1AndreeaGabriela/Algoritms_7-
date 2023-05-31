public class RabinKarpAlgorithm {
    public static void searchPattern(String text, String pattern, int base, int prime) {
        int m = pattern.length();
        int n = text.length();
        int h = 1;
        int patternHash = 0;
        int textHash = 0;

        // Calculating the hash value for pattern and the first window of text
        for (int i = 0; i < m - 1; i++)
            h = (h * base) % prime;

        for (int i = 0; i < m; i++) {
            patternHash = (base * patternHash + pattern.charAt(i)) % prime;
            textHash = (base * textHash + text.charAt(i)) % prime;
        }

        // Sliding the pattern over text one by one
        for (int i = 0; i <= n - m; i++) {
            // If the hash values of current window in text and pattern match
            if (patternHash == textHash) {
                // Check if all characters match
                int j;
                for (j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j))
                        break;
                }

                if (j == m)
                    System.out.println("Pattern found at position " + i + " in the text.");
            }

            // Calculate hash value for the next window of text
            if (i < n - m) {
                textHash = (base * (textHash - text.charAt(i) * h) + text.charAt(i + m)) % prime;

                if (textHash < 0)
                    textHash += prime;
            }
        }
    }


}
