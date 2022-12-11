package exercise_6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~.]*@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]+");
        Matcher matcher = pattern.matcher(string);
        System.out.println(matcher.matches());
    }
}
