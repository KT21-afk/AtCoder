import java.util.*;

class ABC388_MainC {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] m = new long[N];
    for (int i = 0; i < N; i ++) {
      m[i] = sc.nextLong();
    }
    sc.close();
    
    int count = 0;
    for (int i = 0; i < N; i++) {
      long num = m[i] / 2;
      int mxIndex = binarySerch(m, num, i);
      count += mxIndex;
    }
    System.out.println(count);
  }

  private static int binarySerch(long[] m, long num, int high) {
    int low = 0;
    int mid = 0;
    while (low < high) {
      mid = (low + high) / 2;
      if (m[mid] <= num) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return low;
  }
}