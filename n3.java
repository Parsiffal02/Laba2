import java.util.Scanner;
public class n3 {
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("ВВедите пароль: ");
                String passwd = sc.nextLine();
        String pattern = "*[^a-zA-Z0-9 |_].*";
        System.out.println("Пароль:" +passwd.matches(pattern));
            }
       }
    }
