import java.util.*;

class abc383_c {
  static int H, W, D;
  static int[] dx = {0,0,-1,1}; // 上下左右
  static int[] dy = {-1,1,0,0}; // 上下左右
  static char[][] grid;
  static boolean[][] visited;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    H = sc.nextInt();
    W = sc.nextInt();
    D = sc.nextInt();
    sc.nextLine();

    grid = new char[H][W];
    for (int i = 0; i < H; i++) {
      grid[i] = sc.nextLine().toCharArray();
    }
    sc.close();

    visited = new boolean[H][W];
    Queue<int[]> queue = new ArrayDeque<>();
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (grid[i][j] == 'H') {
          queue.offer(new int[]{i,j,0});
          visited[i][j] = true;
        }
      }
    }

    int count = bfs(queue);
    System.out.println(count);
  }

  static int bfs(Queue<int[]> queue) {
    int count = 0;
    while (!queue.isEmpty()) {
      int[] cur = queue.poll();
      int y = cur[0], x = cur[1], d = cur[2];

      if (grid[y][x] == '.' || grid[y][x] == 'H') {
        count++;
      }

      if (d < D) {
        for (int i = 0; i < 4; i++) {
          int yi = y + dy[i];
          int xj = x + dx[i];
          if (yi >= 0 && xj >= 0 && yi < H && xj < W && (!visited[yi][xj]) && grid[yi][xj] != '#') {
            queue.offer(new int[]{yi, xj, d + 1});
            visited[yi][xj] = true;
          }
        }
      }
    }
    return count;
  }
}