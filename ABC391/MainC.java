import java.util.*;

class MainC {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();

    int[] birds = new int[N+1];
    Map<Integer, Integer> hashMap =  new HashMap<>();
    for (int i = 1; i <= N; i++) {
      hashMap.put(i, 1);
      birds[i] = i;
    }

    int counter = 0;
    for (int i = 0; i < Q; i++) {
      int type = sc.nextInt();
      if (type == 1) {
        int p = sc.nextInt();
        int h = sc.nextInt();
        int prevNest = birds[p];
        hashMap.replace(prevNest, hashMap.get(prevNest)-1);
        hashMap.replace(h, hashMap.get(h)+1);
        birds[p] = h;

        if (hashMap.get(prevNest) == 1) {
          counter--;
        }

        if (hashMap.get(h) == 2) {
          counter++;
        }

      } else if (type == 2) {
        System.out.println(counter);
      }
    }
    
  }
}