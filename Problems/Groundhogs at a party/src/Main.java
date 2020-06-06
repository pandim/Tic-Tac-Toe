import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cup = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        System.out.println(cup >= 10 && cup <= 20 && !isWeekend || cup >= 15 && cup <= 25 && isWeekend);
        // put your code here
    }
}