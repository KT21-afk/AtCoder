import java.util.*;

class MainB {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();

    int[] T = new int[N];
    int[] L = new int[N];

    for (int i = 0; i < N; i++) {
      T[i]= sc.nextInt();
      L[i] = sc.nextInt();
    }
    sc.close();
    
    for (int j = 1; j <= D; j++) {
      int max = Integer.MIN_VALUE;
      for (int k = 0; k < N; k++) {
        int num = T[k] * (L[k] + j);
        max = Math.max(max, num);
      }
      System.out.println(max);
    }
    
  }
}