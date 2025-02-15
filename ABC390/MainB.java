// package ABC390_B;
import java.util.*;

public class MainB {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    long[] A = new long[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    sc.close();

    String result = "Yes";
    for (int i = 1; i < N; i++) {
      if (A[1] * A[i-1] != A[0] * A[i]) {
        result = "No";
        break;
      }
    }

    System.out.println(result);
  }
}
