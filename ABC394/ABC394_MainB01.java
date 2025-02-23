// 実際に提出した回答

import java.util.*;

class ABC394_MainB01 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    String[] strings = new String[N+1];
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i = 1; i <= N; i++) {
      strings[i] = sc.next();
      hashMap.put(strings[i].length(), i);
    }
    sc.close();

    String ans = "";
    for (int i = 1; i <= 50; i++) {
      if (hashMap.containsKey(i)) {
        ans += strings[hashMap.get(i)];
      }
    }

    System.out.println(ans);
  }
}