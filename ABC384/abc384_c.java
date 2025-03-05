import java.util.*;

class abc384_c {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int[] points = new int[5];
    for (int i = 0; i < 5; i++) {
      points[i] = sc.nextInt();
    }
    sc.close();

    List<Map.Entry<String, Integer>> standings = new ArrayList<>();
    for (int bit = 1; bit < 32; bit++) {
      int score = 0;
      StringBuffer name = new StringBuffer();

      for (int digit = 0; digit < 5; digit++) {
        if ((bit & (1 << digit)) != 0) {
          score += points[digit];
          name.append("ABCDEF".charAt(digit));
        }
      }
      standings.add(new AbstractMap.SimpleEntry<>(name.toString(), score));
    }

    standings.sort((e1, e2) -> {
      int scoreCompare = Integer.compare(e2.getValue(), e1.getValue());
      if (scoreCompare != 0) return scoreCompare;
      return e1.getKey().compareTo(e2.getKey());
    });

    for (Map.Entry<String, Integer> entry : standings) {
      System.out.println(entry.getKey());
    }
  }
}