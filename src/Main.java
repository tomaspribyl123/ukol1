import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //u_iv();
        ZnakText zt = new ZnakText();
        zt.TiskASCII();

        String asciiTable = zt.dejASCII();
        System.out.println(asciiTable);
    }
    public static void u_i(){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Zadejte celé číslo číslo (byte, int, nebo long): ");
            long integerInput = scanner.nextLong();
            System.out.println("Zadali jste číslo " + integerInput);

            System.out.println("Zadejte číslo s desetinnou částí (float nebo double)");
            double floatingInput = scanner.nextDouble();
            System.out.println("Zadali jste číslo s desetinnou čárkou " + floatingInput);

            System.out.println("Zadejte znak: ");
            char charInput = scanner.next().charAt(0);
            System.out.println("Zadali jste znak: " + charInput);

            System.out.println("Zadejte textový řetězec ");
            String stringInput = scanner.next();
            System.out.println("Zadali jste textový řetězec " + stringInput);
        }catch(java.util.InputMismatchException e){
            System.err.println("Neplatný vstupní formát");
        }
        catch(java.util.NoSuchElementException e){
            System.err.println("Vstupní hodnota chybí");
        }
        catch(Exception e){
            System.err.println("Neočekávaná chyba" + e.getMessage());
        }
        finally{
            scanner.close();
        }
    }

    public static void u_ii(){
        byte byteV = 10;
        int intV = 100;
        long longV = 1000L;
        float floatV = 3.14F;
        double doubleV = 2.71;
        char charV = 'A';
        String stringV = "něco";

        final int MAX_VALUE = 100;
        final double PI = 3.14;
        final String POZDRAV = "ahoj";

        System.out.println("Byte " + byteV);
        System.out.println("int " + intV);
        System.out.println("long " + longV);
        System.out.println("Float " + floatV);
        System.out.println("Double " + doubleV);
        System.out.println("Char " + charV);
        System.out.println("String " + stringV);
        System.out.println("Konstanta int " + MAX_VALUE);
        System.out.println("Konstanta double  " + PI);
        System.out.println("Konstanta string " + POZDRAV);
    }

    public static String u_iii(){
        Scanner scanner = new Scanner(System.in);
        String jmeno = scanner.next();
        String prijmeni = scanner.next();
        scanner.close();
        final char mezera = ' ';
        return jmeno + mezera + prijmeni;
    }

    public static void u_iv(){
        System.out.println("byte " + Byte.class.getName() + " " + Byte.SIZE / 8 + " " + Byte.SIZE + " " + Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
        System.out.println("short " + Short.class.getName() + " " + Short.SIZE / 8 + " " + Short.SIZE + " " + Short.MAX_VALUE + " " + Short.MIN_VALUE);
        System.out.println("Int " + Integer.class.getName() + " " + Integer.SIZE / 8 + " " + Integer.SIZE + " " + Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
        System.out.println("Long " + Long.class.getName() + " " + Long.SIZE / 8 + " " + Long.SIZE + " " + Long.MAX_VALUE + " " + Long.MIN_VALUE);

        System.out.println("Float " + Float.class.getName() + " " + Float.SIZE / 8 + " " + Float.SIZE + " " + Float.MAX_VALUE + " " + Float.MIN_VALUE);
        System.out.println("Double " + Double.class.getName() + " " + Double.SIZE / 8 + " " + Double.SIZE + " " + Double.MAX_VALUE + " " + Double.MIN_VALUE);

        System.out.println("Char " + Character.class.getName() + " " + Character.SIZE / 8 + " " + Character.SIZE + " " + (int)Character.MAX_VALUE + " " + (int)Character.MIN_VALUE);
    }

    public static void u_v(){
        System.out.println("Sčítání čísel matematicky " + 6 + 4);
        System.out.println("Ščítání čísel jako řetězec " +  6 + "" + 4);
    }
}