import java.util.*;

class abc395_b {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.close();

    char[][] grid = new char[N][N];

    for (int l = 0; l < N; l++) {
      int r = N - 1 - l;
      if (l > r) break;
      for (int i = l; i <= r; i++) {
        char c  = (l % 2 == 0) ? '#' : '.';
        for (int j = l; j <= r; j++) {
          grid[i][j] = c;
        }
      }
    }
    
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < N; i++) {
      sb.append(grid[i]).append("\n");
    }
    System.out.println(sb);
  }
}