import java.util.*;

class abc397_b {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();

    int ans = 0;
    StringBuilder sb = new StringBuilder(s);

    for (int i = 0; i < sb.length(); i++) {
      if (i % 2 == 0) {
        if (sb.charAt(i) != 'i') {
          sb.insert(i, 'i');
          ans++;
        }
        if (i+1 == sb.length()) ans++;
      } else {
        if (sb.charAt(i) != 'o') {
          sb.insert(i, 'o');
          ans++;
        }
      }
    }
    
    System.out.println(ans);
  }
}