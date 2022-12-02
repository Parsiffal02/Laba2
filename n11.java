    import java.util.Scanner;
    public class n11 {
        public static void main(final String ar[]) {
            String password;
            Scanner in = new Scanner(System.in);
            System.out.print("Введите пароль: ");
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
                    if (Character.isLetter(x) ) {
    
                        hasLetter = true;
                    }
                    else if (Character.isUpperCase(x)) {
    
                        hasLetter1 = true;
                    
                    }
                    else if (Character.isLowerCase(x)) {
    
                        hasLetter2 = true;
                    
                    }
    
                    else if (Character.isDigit(x)) {
    
                        hasDigit = true;
                    
                    }
                    else if (x == o.charValue()) {
    
                        hasSymbol = true;
                    
                    }
    
                    if(hasLetter && hasDigit && hasLetter1 && hasLetter2 && hasSymbol){
    
                        break;
                    }
    
                }
                if (hasLetter && hasDigit && hasLetter1 && hasLetter2 && hasSymbol ) {
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

