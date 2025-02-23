import java.util.*;

class ABC394_MainA {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '2') {
        System.out.print('2');
      }
    }
  }
}