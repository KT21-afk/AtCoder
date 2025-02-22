import java.util.*;

class ABC392_MainB01 {
  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int M = sc.nextInt();
  int[] bucket = new int[N+1];

  int counter = 0;
  for (int i = 0; i < M; i++) {
    int num = sc.nextInt();
    bucket[num] = 1;
  }

  System.out.println(N - counter);
  for (int i = 1; i <= N; i++) {
    if (bucket[i] == 0) {
      System.out.print(i + " ");
    }
  }

  sc.close();
  }
}