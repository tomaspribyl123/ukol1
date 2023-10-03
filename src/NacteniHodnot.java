import java.util.InputMismatchException;
import java.util.Scanner;

public class NacteniHodnot {
     public static Scanner scanner = new Scanner(System.in);
    public static short nacti_short() throws NumberFormatException{
        System.out.println("Zadej krátké celé číslo");
        short value = scanner.nextShort();
        if(value < Short.MIN_VALUE || value > Short.MAX_VALUE){
            throw new InputMismatchException();
        }
        return value;
    }
    public static int nacti_int() throws NumberFormatException{
        System.out.println("Zadejte celé číslo (int): ");
        int value = scanner.nextInt();
        return value;
    }

    public static float nacti_float(){
        System.out.println("Zadejte desetinné číslo (float): ");
        float value = scanner.nextFloat();
        return value;
    }

    public static double nacti_double()throws NumberFormatException{
        System.out.println("Zadejte desetinné číslo (double:) ");
        double value = scanner.nextDouble();
        return value;
    }
    public static String nacti_string()throws NumberFormatException{
        System.out.println("Zadejte text (string) ");
        String value = scanner.next();
        return value;
    }

    public static char nacti_char()throws NumberFormatException{
        System.out.println("Zadejte znak (char) ");
        char value = scanner.next().charAt(0);
        return value;
    }

}
