    import java.util.Scanner;
    public class n4 {
        public static void main(final String ar[]) {
            String password;
            Scanner in = new Scanner(System.in);
            System.out.println("Введите пароль");
            password = in.next();
            Character o = '_';
            boolean hasLetter = false;
            boolean hasLetter1 = false;
            boolean hasLetter2 = false;
            boolean hasDigit = false;
            boolean hasSymbol = false;
    
            if (password.length() >= 8) {
                for (int i = 0; i < password.length(); i++) {
                    char x = password.charAt(i);
                    if (Character.isLetter(x) & (Character.isUpperCase(x) || Character.isLowerCase(x) )) {
    
                        hasLetter = true;
                    }
    
                    else if (Character.isDigit(x)) {
    
                        hasDigit = true;
                    
                    }
    
                    if(hasLetter && hasDigit ){
    
                        break;
                    }
    
                }
                if (hasLetter && hasDigit  ) {
                    System.out.println("Сильный пароль");
                } else {
                    System.out.println("Пароль ненадежен. Повторите ввод");
                    
                }
            
            } 
            else {
                System.out.println("Нужно ввести 8 символов");
            }
        }
      
    }

