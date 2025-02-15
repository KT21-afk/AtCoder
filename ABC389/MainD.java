import java.util.*;

class MainD {
  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);
  int R = sc.nextInt();
  sc.close();

  int ans = 0;

  for (int x = 1; x < R; x++) {
    for (int y = R; y > 0; y--) {
      double dx = Math.pow((x*2 + 1), 2);
      System.out.println("dx : " + dx);
      double dy = Math.pow((y*2 + 1), 2);
      System.out.println("dy : " + dy);
      double r = Math.pow((R * 2), 2);
      if (dx + dy <= r) {
        ans += y;
      }
    }
    System.out.println(ans);
  } 
  ans *= 4;
  ans++;
  System.out.println(ans);
  }
}