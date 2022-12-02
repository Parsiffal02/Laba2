import java.util.Scanner;
public class n1 {
    
public static final int PASSWORD_LENGTH = 8;
public static void main(String[] args) {
    Character o = '_';
        Scanner input = new Scanner(System.in);
        System.out.print("Введите пароль : ");
        
        String s = input.nextLine();
        if (is_Valid_Password(s)) {
            System.out.println("Пароль надежен: " + s);
        } else {
            System.out.println("Пароль ненадежен " + s);
        }
    }
    public static boolean is_Valid_Password(String password) {
        if (password.length() < PASSWORD_LENGTH) return false;
        int charCount = 0;
        int numCount = 0;
        int symCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else if (is_Symbol(ch)) symCount++;
            else return false;
        }
        return (charCount >= 1 && numCount >= 1 && symCount > 1);
    }
    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >='A' && ch <='Z');
    }
    public static boolean is_Numeric(char ch) {
        return (ch >='0' && ch <='9');
    }
    public static boolean is_Symbol(char ch) {
        Character o = '_';
        return (ch == o);
    }
}