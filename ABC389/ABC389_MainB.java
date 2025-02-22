import java.util.*;

public class ABC389_MainB {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    sc.close();

    int N = 0;
    for (int i = 1; 1 < X; i++) {
      X /= i;
      N++;
    }
    System.out.println(N);
  }
}
