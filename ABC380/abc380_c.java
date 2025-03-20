import java.util.*;

class abc380_c {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    sc.close();

    List<String> list = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    sb.append(s.charAt(0));
    for (int i = 1; i < n; i++) {
      if (s.charAt(i-1) != s.charAt(i)) {
        list.add(sb.toString());
        sb.setLength(0);
      }
      sb.append(s.charAt(i));
    }
    list.add(sb.toString());

    int index = (s.charAt(0) == '0') ? 2*k-1 : 2*k-2;
    Collections.swap(list, index - 1, index);

    StringBuilder ans = new StringBuilder();
    for (String str : list) {
      ans.append(str);
    }
    System.out.println(ans);
  }
}