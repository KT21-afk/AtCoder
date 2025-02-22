import java.util.*;

class ABC393_MainB {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String S = sc.nextLine();
  sc.close();

  int result = 0;
  List<Integer> a = new ArrayList<>();
  List<Integer> b = new ArrayList<>();
  List<Integer> c = new ArrayList<>();
  for (int i = 0; i < S.length(); i++) {
    char s = S.charAt(i);
    if (s == 'A') {
      a.add(i);
    } else if (s == 'B') {
      b.add(i);
    } else if (s == 'C') {
      c.add(i);
    }
  }

  for (int i = 0; i < a.size(); i++) {
      for (int j = 0; j < b.size(); j++) {
        if (a.get(i) > b.get(j)) continue;
        int interval = b.get(j) - a.get(i);
          if (c.contains(interval + b.get(j))) result++;
      }
  }

  
  System.out.println(result);
  }
}