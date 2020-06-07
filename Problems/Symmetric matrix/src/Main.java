import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] n = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                n[i][j] = scanner.nextInt();
            }
        }
        boolean rez = true;
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n[i].length; j++) {
                if (n[i][j] != n[j][i]) {
                    rez = false;
                }
            }
        }
        System.out.println(rez ? "YES" : "NO");
    }
}