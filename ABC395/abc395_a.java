import java.util.*;

class abc395_a {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    sc.close();

    String ans = "Yes";
    for (int i = 1; i < n; i++) {
      if (nums[i-1] >= nums[i]) {
        ans = "No";
        break;
      }
    }
    System.out.println(ans);
  }
}