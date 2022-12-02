import java.util.Scanner;
import java.util.regex.*;


public class n111 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");

        while (true) {
            if (scanner.hasNextLine()){
                String date = scanner.nextLine();
                String pattern1 = "((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[0-9a-zA-Z_]{8,})";
                Pattern p1 = Pattern.compile(pattern1);
                Matcher match1 = p1.matcher(date);
                if (match1.matches()) {
                    System.out.println("Пароль надёжный");
                    System.exit(0);
                }
                else {

                    System.out.println("Пароль ненадёжный");

                }
            }
            else {

                System.out.println("Введите пароль: ");
                scanner.nextLine();

            }

        }

    }
}