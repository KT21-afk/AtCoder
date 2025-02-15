import java.util.*;

class MainB {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String S = sc.nextLine();
  sc.close();

  int result = 0;
  for (int i = 0; i < S.length(); i++) {
    if (S.charAt(i) == 'A') {
      for (int j = 1; j < S.length(); j++) {
        int interval = 1;
        if (i+j<S.length()) {
          if (S.charAt(i+j) == 'B') {
            if (i+j+interval < S.length()) {
              if (S.charAt(i+j+interval) == 'C') {
                result++;
              }
            }
          } else {
            interval++;
          }
        }
      }
    }
  }
  System.out.println(result);
  }
}