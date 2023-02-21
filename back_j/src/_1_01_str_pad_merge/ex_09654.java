package _1_01_str_pad_merge;

public class ex_09654 {

    static String paddingString(String str, int pad){

        String pad_string = str;

        for (int i = 0; i < pad - str.length(); i++){
            pad_string += ' ';
        }

        return pad_string;
    }

    static void printString(String first, String second, String third, String forth)
    {
        System.out.print(paddingString(first, 15));
        System.out.print(paddingString(second, 15));
        System.out.print(paddingString(third, 11));
        System.out.println(paddingString(forth, 10));        
    }

    public static void main(String[] args)
    {
        printString("SHIP NAME", "CLASS", "DEPLOYMENT", "IN SERVICE");
        printString("N2 Bomber", "Heavy Fighter", "Limited", "21");
        printString("J-Type 327", "Light Combat", "Unlimited", "1");
        printString("NX Cruiser", "Medium Fighter", "Limited", "18");
        printString("N1 Starfighter", "Medium Fighter", "Unlimited", "25");
        printString("Royal Cruiser", "Light Combat", "Limited", "4");

    }
    
}
