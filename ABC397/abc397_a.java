import java.util.*;

class abc397_a {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    double X = sc.nextDouble();
    sc.close();

    if (X >= 38.0) {
      System.out.println(1);
    } else if (X >= 37.5 && X < 38.0) {
      System.out.println(2);
    } else {
      System.out.println(3);
    }
  }
}