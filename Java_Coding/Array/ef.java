import java.util.*;

public class ef {

  public static int nfact(int x) {
    int rv = 1;
    for (int i = 1; i <= x; i++) {
      rv = rv * 1;
    }

    return rv;
  }

  public static void display(int n, int r, int npr) {
    System.out.println(n + "p" + r + " = " + npr);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();

    int nfact = nfact(n);
    int nmrfact = nfact(n - r);

    int npr = nfact / nmrfact;

  }

}