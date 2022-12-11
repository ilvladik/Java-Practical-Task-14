package exercise_4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\d\\s?\\+");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
