import java.util.*;

class abc382_c {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    int[] B = new int[M];
    for (int i = 0; i < M; i++) {
      B[i] = sc.nextInt();
    }
    sc.close();

    for (int i = 0; i < N-1; i++) {
      A[i+1] = Math.min(A[i], A[i+1]);
    }

    for (int i = 0; i < M; i++) {
      int index = binarySearch(A, B[i]);
      System.out.println(index == N ? -1 : index + 1);
    }
  }

  static int binarySearch(int[] A, int i) {
    int l = 0;
    int r = A.length;

    while (l < r) {
      int mid = (l + r) / 2;
      if (A[mid] <= i) {
        r = mid;
      } else {
        l = mid + 1;
      }
    }
    return l;
  }
}