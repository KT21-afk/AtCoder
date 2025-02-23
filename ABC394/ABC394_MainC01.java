import java.util.*;

class ABC394_MainC01 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();

    StringBuilder sb = new StringBuilder(s);

    int i = 0;
    while ((i = sb.indexOf("WA", i-1)) != -1) {
      sb.replace(i, i+2, "AC");
    }

    System.out.println(sb);
  }
}