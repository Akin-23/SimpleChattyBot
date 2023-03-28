import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        int S = N*M;

        if ( K<=S && (K%N == 0 || K%M ==0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }
}