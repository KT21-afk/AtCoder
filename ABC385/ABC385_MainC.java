import java.util.*;

class ABC385_MainC {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] height = new int[N];
    for (int i = 0; i < N; i++) {
      height[i] = sc.nextInt();
    }
    sc.close();

    int maxLenght = 0;
    for (int w = 1; w <= height.length; w++) {
      for (int h = 0; h < w; h++) {
        int len = 0;
        int val = -1;
        for (int n = h; n < height.length; n += w) {
          if (val == height[n]) {
            len++;
          } else {
            len = 1;
            val = height[n];
          }
          maxLenght = Math.max(maxLenght, len);
        }
        
      }
    }

    System.out.println(maxLenght);
  }
}