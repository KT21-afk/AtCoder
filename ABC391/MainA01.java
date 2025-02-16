import java.util.*;

class Main {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  String D = sc.nextLine();
  sc.close();

  if (D.equals("N")) {
    System.out.println("S");
  } else if (D.equals("S")) {
    System.out.println("N");
  } else if (D.equals("E")) {
    System.out.println("W");
  } else if (D.equals("W")) {
    System.out.println("E");
  } else if (D.equals("NE")) {
    System.out.println("SW");
  } else if (D.equals("SW")) {
    System.out.println("NE");
  } else if (D.equals("NW")) {
    System.out.println("SE");
  } else if (D.equals("SE")) {
    System.out.println("NW");
  }

  }
}