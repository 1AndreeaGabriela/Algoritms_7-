public class NaiveSearching {


    public static void naiveSearching(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int inequality = 0;
            for (int j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    inequality = 1;
                    break;
                }
            }

            if (inequality == 0) {
                System.out.println("S-a gasit o aparitie a tiparului care incepe la pozitia " + i + " in text");
            }
        }
    }
}
