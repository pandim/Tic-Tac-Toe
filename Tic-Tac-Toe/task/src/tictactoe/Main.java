package tictactoe;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int[][] arr = {{6, 3, 0}, {7, 4, 1}, {8, 5, 2}};
    private static char[] pole = new char[] {'_', '_', '_', '_', '_', '_', '_', '_', '_'};

    public static void main(String[] args) {
//        init();
        char who = 'X';
        display();
        while (true) {
            strokeInput(who);
            display();
            if (test(who)) break;
            who = who == 'X' ? 'O' : 'X';
        }
    }

//    private static void init() {
//        System.out.print("Enter cells: ");
//        pole = scanner.nextLine().toCharArray();
//    }

    private static void strokeInput(char who) {
        while (true) {
            System.out.print("Enter the coordinates: ");
            try {
                int x = scanner.nextInt() - 1;
                int y = scanner.nextInt() - 1;
                if (x < 0 || x > 2 || y < 0 || y > 2) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else if (pole[arr[x][y]] != '_') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    pole[arr[x][y]] = who;
                    break;
                }
            } catch (Exception e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }
        }
    }

    public static boolean ifWin(char who) {
        return pole[0] == who && pole[1] == who && pole[2] == who ||
                pole[3] == who && pole[4] == who && pole[5] == who ||
                pole[6] == who && pole[7] == who && pole[8] == who ||
                pole[0] == who && pole[3] == who && pole[6] == who ||
                pole[1] == who && pole[4] == who && pole[7] == who ||
                pole[2] == who && pole[5] == who && pole[8] == who ||
                pole[0] == who && pole[4] == who && pole[8] == who ||
                pole[2] == who && pole[4] == who && pole[6] == who;
    }

    public static int counter(char sign) {
        return new String(pole).replaceAll("[^" + sign + "]", "").length();
    }

    private static boolean test(char who) {
        if (ifWin(who)) {
            System.out.println(who + " wins");
        } else if (counter('_') == 0) {
            System.out.println("Draw");
        } else {
            return false;
        }
        return true;
    }

    private static void display() {
        System.out.println("---------");
        for (int i = 0; i < pole.length; i += 3) {
            System.out.print("| " + pole[i] + " " + pole[i + 1] + " " + pole[i + 2] + " |\n");
        }
        System.out.println("---------");
    }
}
