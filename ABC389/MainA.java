import java.util.*;

class MainA {
  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);
  String s = sc.nextLine();
  sc.close();

  int num1 = s.charAt(0) - '0';
  int num2 = s.charAt(2) - '0';
  System.out.println(num1 * num2);
  }
}