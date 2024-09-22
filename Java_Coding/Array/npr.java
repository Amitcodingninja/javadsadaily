import java.util.*;

public class npr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter values for n and r
        System.out.println("Enter n and r: ");
        int n = sc.nextInt();
        int r = sc.nextInt();

        // Calculating n!
        int nfact = 1;
        for (int i = 1; i <= n; i++) {
            nfact *= i;
        }

        // Calculating (n - r)!
        int nmrfact = 1;
        for (int i = 1; i <= (n - r); i++) {
            nmrfact *= i;
        }

        // Calculating nPr
        int npr = nfact / nmrfact;
        System.out.println(n + "P" + r + " = " + npr);

        // Closing the Scanner
        sc.close();
    }
}
