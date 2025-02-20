import java.util.*;

class ABC391_MainB {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    sc.nextLine();
    
    char[][] gridA = new char[N][N];
    for (int i = 0; i < N; i++) {
      String line = sc.nextLine();
      for (int j = 0; j < N; j++) {
        gridA[i] = line.toCharArray();
      }
    }

    char[][] gridB = new char[M][M];
    for (int i = 0; i < M; i++) {
      String line = sc.nextLine();
      for (int j = 0; j < M; j++) {
        gridB[i] = line.toCharArray();
      }
    }
    sc.close();

    for (int h = 1; h <= N - M + 1; h++) {
      for (int w = 1; w <= N - M + 1; w++) {
        boolean isMatch = true;
        for (int i = 0; i < M; i++) {
          for (int j = 0; j < M; j++) {
            if (gridA[h+i-1][w+j-1] != gridB[i][j]) {
              isMatch = false;
              break;
            };
          }
        }
        if (isMatch) {
          System.out.println(h + " " + w);
        }
      }
    }
  }
}