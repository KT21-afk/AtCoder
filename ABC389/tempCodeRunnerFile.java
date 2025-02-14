import java.util.*;

class MainC {
  public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  int Q = sc.nextInt();

  int headIndex = 0;
  List<Long> queue = new ArrayList<>();

  for (int i = 0; i < Q; i++) {
    int type = sc.nextInt();
    if (type == 1) {
      long l = sc.nextLong();
      queue.add(l);
    } else if (type == 2) {
      headIndex++;
    } else if (type == 3) {
      int k = sc.nextInt();
      long result = 0;
      for (int j = headIndex; j < headIndex + k - 1; j++) {
        result += queue.get(j);
      }
      System.out.println(result);
    }
  }
  sc.close();
  }
}