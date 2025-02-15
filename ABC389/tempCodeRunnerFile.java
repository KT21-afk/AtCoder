import java.util.*;

class MainD {
  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);
  int R = sc.nextInt();
  sc.close();

  double x = 0.5 * 2;
  double y = 0.5 * 2;
  int counter = 0;
  double r = Math.pow(R*2, 2);
  for (int i = 0; i < R; i++) {
    for (int j = 0; j < R; j++) {
      double dx = Math.pow((x+i)*2, 2);
      // System.out.println("dx : " + dx);
      double dy = Math.pow((y+j)*2, 2);
      // System.out.println("dy : " + dy);
      if (dx + dy <= r) counter++;
    }
  } 
  counter *= 4;
  counter++;
  System.out.println(counter);
  }
}