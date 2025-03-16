import java.util.*;

class abc397_c {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    sc.close();

    Set<Integer> seen = new HashSet<>();
    int uniqueCount = 0;
    int[] l = new int[n];
    for (int i = 0; i < n; i++) {
      if (seen.add(a[i])) {
        uniqueCount++;
      }
      l[i] = uniqueCount;
    }

    seen.clear();
    uniqueCount = 0;
    int[] r = new int[n];
    for (int i = n-1; i >= 0; i--) {
      if (seen.add(a[i])) {
        uniqueCount++;
      }
      r[i] = uniqueCount;
    }

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n-1; i++) {
      max = Math.max(max, l[i] + r[i+1]);
    }
    System.out.println(max);
  }
}