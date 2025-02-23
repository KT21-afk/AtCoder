import java.util.*;

class ABC394_MainB02 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    List<String> words = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      words.add(sc.next());
    }
    sc.close();

    words.sort(Comparator.comparingInt(String::length));
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < words.size(); i++) {
      sb.append(words.get(i));
    }
    System.out.println(sb);
  }
}