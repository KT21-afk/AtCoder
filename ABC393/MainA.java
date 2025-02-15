import java.util.*;

class MainA {
  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);
  String[] strings = sc.nextLine().split(" ");
  sc.close();

  if (strings[0].equals("fine") && strings[1].equals("fine")) {
    System.out.println("4");
  } else if (strings[0].equals("fine") && strings[1].equals("sick")){
    System.out.println("3");
  } else if (strings[0].equals("sick") && strings[1].equals("fine")){
    System.out.println("2");
  } else if (strings[0].equals("sick") && strings[1].equals("sick")){
    System.out.println("1");
  }
  }
}