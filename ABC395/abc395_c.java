import java.util.*;

class abc395_c {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int[] nums = new int[N];
    for (int i = 0; i < N; i++) {
      nums[i] = sc.nextInt();
    }
    sc.close();

    int r = 0;
    int mult = 0;
    int ans = Integer.MAX_VALUE;
    int[] count = new int[1_000_001];

    for (int l = 0; l < nums.length; l++) {
      while (r < nums.length && mult == 0) {
        count[nums[r]]++;
        if (count[nums[r]] == 2) mult++;
        r++;
      }
      if (mult > 0) ans = Math.min(ans, r-l);
      if (count[nums[l]] == 2) mult--;
      count[nums[l]]--;
    }
    if (ans == Integer.MAX_VALUE) ans = -1;
    System.out.println(ans);
  }
}