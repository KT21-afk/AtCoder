import java.util.*;

class ABC392_MainB02 {
  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int M = sc.nextInt();
  // sc.nextLine();

  int[] nums = new int[M];
  for (int i = 0; i < M; i++) {
    nums[i] = sc.nextInt();
  } sc.close();

  Arrays.sort(nums);

  List<Integer> list = new ArrayList<>();
  int p = 0;
  for (int j = 1; j <= N; j++) {
    if (p >= nums.length || nums[p] != j) {
      list.add(j);
    } else {
      p++;
    }
  }

  System.out.println(list.size());
  for (int i : list) {
    System.out.print(i + " ");
  }
  }
}