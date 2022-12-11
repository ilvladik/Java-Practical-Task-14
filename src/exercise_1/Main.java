package exercise_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Введите паттерн:");
        String pattern = scanner.nextLine();
        System.out.println(Arrays.toString(str.split(pattern)));
    }
}
