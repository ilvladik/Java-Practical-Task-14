package exercise_3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = pattern.matcher(str);
        StringBuilder stringBuilder = new StringBuilder();
        while (m.find()){
            stringBuilder.append(m.group()).append(" ");
        }
        System.out.println(stringBuilder);
    }
}
