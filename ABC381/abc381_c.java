import java.util.*;

class abc381_c {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String str = sc.nextLine();
    sc.close();

    str = '$' + str + '$';
    n = str.length();

    int max = 1;
    for (int i = 0; i < n; i++) {
      if (str.charAt(i) == '/') {
        int x = 1;
        while (str.charAt(i-x) == '1' && str.charAt(i+x) == '2') x++;
        max = Math.max(max, x*2-1);
      }
    }

    System.out.println(max);
  }
}