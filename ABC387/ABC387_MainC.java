import java.util.*;

class ABC387_MainC {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    long L = sc.nextLong();
    long R = sc.nextLong();
    sc.close();

    long ans = f(R) - f(L-1);
    System.out.println(ans);
  }

  private static long f(long r) {
    r++;
    char[] chars = Long.toString(r).toCharArray();
    int[] digits = new int[chars.length];
    for (int i = 0; i < chars.length; i++) {
      digits[i] = chars[i] - '0';
    }
    int n = digits.length;

    long res = 0;
    for (int k = 1; k < n; k++) {
      for (int h = 1; h <= 9; h++) res += powInt(h, k-1);
    }

    for (int h = 1; h < digits[0]; h++) res += powInt(h, n-1);
    
    int h = digits[0];
    for (int i = 1; i < n; i++) {
      if (digits[i] >= h) {
        res += powInt(h, n-i);
        break;
      }
      res += powInt(h, n-i-1) * digits[i];
    }

    return res;
  }

  private static long powInt(long a, long b) {
    long result = 1;
    for (int i = 0; i < b; i++) {
      result *= a;
    }
    return result;
  }
}