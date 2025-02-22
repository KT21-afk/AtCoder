import java.util.*;

class ABC392_MainC {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int[] P = new int[N+1];
    for (int i = 1; i <= N; i++) {
      P[i] = sc.nextInt();
    }

    int[] Q = new int[N+1];
    for (int i = 1; i <= N; i++) {
      Q[i] = sc.nextInt();
    }

    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int j = 1; j <= N; j++) {
      hashMap.put(Q[j], P[j]);
    }
    sc.close();

    for (int k = 1; k <= N; k++) {
      System.out.print(Q[hashMap.get(k)] + " ");
    }

  }
}