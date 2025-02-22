import java.util.*;

public class ABC390_MainC {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();

    char[][] grid = new char[H][W];
    int ti = Integer.MAX_VALUE;
    int bi = Integer.MIN_VALUE;
    int lj = Integer.MAX_VALUE;
    int rj = Integer.MIN_VALUE;

    for (int i = 0; i < H; i++) {
      String line = sc.next();
      for (int j = 0; j < W; j++) {
        grid[i][j] = line.charAt(j);

        if (grid[i][j] == '#') {
          ti = Math.min(ti, i);
          bi = Math.max(bi, i);
          lj = Math.min(lj, j);
          rj = Math.max(rj, j);
        }
      }
    }
    sc.close();

    String result = "Yes";
    for (int i = ti; i <= bi; i++) {
      for (int j = lj; j <= rj; j++) {
        if (grid[i][j] == '.') result = "No";
      }
    }

    System.out.println(result);
  }
}

