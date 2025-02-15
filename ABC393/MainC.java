import java.util.*;

class MainC {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int M = sc.nextInt();
  Set<String> hashSet = new HashSet<>();

  for (int i = 0; i < M; i++) {
    int a = 0;
    int b = 0;
    for (int j = 0; j < 2; j++) {
      a = sc.nextInt();
      b = sc.nextInt();
      if (a > b) {
        int temp = a;
        a = b;
        b = temp;
      }
      String str = a + " " + b;
      hashSet.add(str);
    }
  }
  sc.close();
  }
}