public class ZnakText {
    public static void TiskinfoZnak(char z){
        String info = DejInfoZnak(z);
        System.out.println(info);
    }

    public static String DejInfoZnak(char z ){
        int asciiKod = (int) z;
        String hexaKod = Integer.toHexString(asciiKod).toUpperCase();
        return "Znak" + z + "\nAscii kód (dekadicky): " + asciiKod + "\nASCII kód (hexadecimálně): Ox" + hexaKod;
    }

    public static void TiskASCII(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Dekadický ASCII | Hexadecimální ASCII | Dekadický ASCII |hexadecimální ASCII | \n");
        System.out.println("-------------------------------------------------------------------------");

        for(int i = 0; i < 26; i++){
            char velkePismeno = (char) ('A' + i);
            char malePismeno = (char) ('a' + i);
            char cislice = (char) ('0' + i);
            System.out.printf("| %15d | %19X | %15d | %19X |\n", (int) velkePismeno, (int) velkePismeno, (int) malePismeno, (int) malePismeno);
        }

        System.out.println("--------------------------------------------------------------------------");


    }

    public static String dejASCII(){
        StringBuilder asciiTable = new StringBuilder();

        asciiTable.append("------------------------------------------------------------------------------");
        asciiTable.append("Dekadický ASCII | Hexadecimální ASCII | Dekadický ASCII |hexadecimální ASCII | \n");
        asciiTable.append("------------------------------------------------------------------------------");

        for(int i = 0; i < 26; i++){
            char velkePismeno = (char) ('A' + i);
            char malePismeno = (char) ('a' + i);
            char cislice = (char) ('0' + i);
            asciiTable.append(String.format("| %15d | %19X | %15d | %19X |\n", (int) velkePismeno, (int) velkePismeno, (int) malePismeno, (int) malePismeno));
        }

        asciiTable.append("--------------------------------------------------------------------------");
        return asciiTable.toString();
    }
}
