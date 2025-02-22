import java.util.*;

class ABC391_MainA02 {
  private static final Map<String, String> OPOSITE_DIRECTION = Map.of(
    "N", "S",
    "S", "N",
    "W", "E",
    "E", "W",
    "NE", "SW",
    "SW", "NE",
    "NW", "SE",
    "SE", "NW"
  );
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.println(OPOSITE_DIRECTION.get(sc.nextLine()));
  sc.close();
  }
}