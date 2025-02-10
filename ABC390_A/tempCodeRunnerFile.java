package ABC390_A;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String  A = sc.nextLine();
    sc.close();

    // 全パターン列挙
    String p1 = "1 2 3 4 5";
    String p2 = "2 1 3 4 5";
    String p3 = "1 3 2 4 5";
    String p4 = "1 2 4 3 5";
    String p5 = "1 2 3 5 4";

    String result = "No";
    if (A.equals(p1) || A.equals(p2) || A.equals(p3) || A.equals(p4) || A.equals(p5)) {
      result = "Yes";
    }
    System.out.println(result);

  }
}