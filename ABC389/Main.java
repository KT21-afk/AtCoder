import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        sc.close();

        int counter = 0;
        long r = R * R;
        double x = 0.5;

        for (int i = 1; i < R; i++) {
            long maxY = (long)Math.sqrt(r - (x+i) * (x+i));
            System.out.println(maxY);
            counter += maxY;
        }
        counter *= 4;
        counter++;

        System.out.println(counter);
    }
}
