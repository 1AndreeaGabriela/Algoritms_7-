public class main {

    public static void main(String[] args) {

        System.out.println("****************************************************************************\n");

        String text = "Textul in care se cauta un tipar";
        String pattern = "cauta";

        String text1 = "Ana are mere si mai are si pere ";
        String pattern1="re";

        System.out.println("Cauta patternul = cauta\n");
        NaiveSearching.naiveSearching(text, pattern);

        System.out.println("Cauta patternul = re\n");
        NaiveSearching.naiveSearching(text1, pattern1);

        System.out.println("****************************************************************************\n");



        System.out.println("ex1\n");
        String text2 = "This is a sample text.";
        String pattern2 = "sample";
        int base = 10;
        int prime = 13;

        RabinKarpAlgorithm.searchPattern(text2, pattern2, base, prime);

        System.out.println("ex1\n");
        String text3 = "This is a sample text.";
        String pattern3= "sample";
        int base1 = 256;  // Împărțitorul setat la valoarea numărului total de caractere posibile
        int prime1 = 101;  // Număr prim ales

        RabinKarpAlgorithm.searchPattern(text3, pattern3, base1, prime1);

        System.out.println("****************************************************************************\n");
    }
}
