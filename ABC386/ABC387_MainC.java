import java.util.*;

class ABC387_MainC {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    String S = sc.next();
    String T = sc.next();
    sc.close();

    if (canMatch(S, T)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  private static boolean canMatch(String S, String T) {
    char[] s = new char[S.length()];
    char[] t = new char[T.length()];
    s = S.toCharArray();
    t = T.toCharArray();

    if (S.equals(T)) return true;

    if (s.length == t.length) {
      int count = 0;
      for (int i = 0; i < s.length; i++) {
        if (s[i] != t[i]) count++;
      }
      return count == 1;
    }
    if (Math.abs(s.length - t.length) != 1) return false;
    if (s.length < t.length) {
      char[] temp = new char[s.length];
      temp = s;
      s = t;
      t = temp;
    }
    int maxL = 0;
    int maxR = 0;
    for (int i = 0; i < t.length; i++) {
      if (s[i] != t[i]) break;
      maxL++;
    }
    for (int i = t.length - 1; i >= 0; i--) {
      if (s[i+1] != t[i]) break;
      maxR++;
    }

    return maxL + maxR >= s.length - 1;
  }
}