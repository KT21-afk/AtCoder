import java.util.*;

class ABC389_MainC {
  public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  int Q = sc.nextInt();

  int headIndex = 1;
  long queueLong = 0;
  List<Long> queue = new ArrayList<>();
  queue.add(0L);
  for (int i = 0; i < Q; i++) {
    int type = sc.nextInt();
    if (type == 1) {
      long l = sc.nextLong();
      queueLong += l;
      queue.add(queueLong);
    } else if (type == 2) {
      headIndex++;
    } else if (type == 3) {
      int k = sc.nextInt();
      long result = queue.get(headIndex + k - 2) - queue.get(headIndex - 1);
      System.out.println(result);
    }
  }
  sc.close();
  }
}