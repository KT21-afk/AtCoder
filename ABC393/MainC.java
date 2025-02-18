import java.util.*;

class MainC {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int M = sc.nextInt();
  Set<String> hashSet = new HashSet<>();
  
  int ans = 0;
  for (int i = 0; i < M; i++) {
    int u = sc.nextInt();
    int v = sc.nextInt();

    if (u == v) {
      ans++;
      continue;
    }
    int smaller = Math.min(u,v);
    int bigger  = Math.max(u,v);
    
    String str = smaller + " " + bigger;

    if (hashSet.contains(str)) {
      ans++;
      continue;
    } else {
      hashSet.add(str);
    }
  }
  sc.close();

  System.out.println(ans);
  }
}