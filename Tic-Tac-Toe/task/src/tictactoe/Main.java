package tictactoe;

public class Main {
    public static void main(String[] args) {
        char[] pole = {'O', 'X', 'O', 'X', 'X', 'O', 'X', 'O', 'X'};
        for (int i = 0; i < pole.length; i += 3) {
            System.out.print(pole[i] + " " + pole[i + 1] + " " + pole[i + 2] + "\n");
        }
    }
}
