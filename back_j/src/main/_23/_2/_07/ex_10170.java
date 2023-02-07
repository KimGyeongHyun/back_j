package main._23._2._07;

public class ex_10170 {

    static String paddingString(String str, int pad){

        String pad_string = str;

        for (int i = 0; i < pad - str.length(); i++){
            pad_string += ' ';
        }

        return pad_string;
    }

    static String leftPaddingString(String str, int pad){
        String pad_string = "";

        for (int i = 0; i < pad - str.length(); i++){
            pad_string += ' ';
        }

        pad_string += str;

        return pad_string;
    }

    static void printString(String first, String second, String third, String forth)
    {
        System.out.print(paddingString(first, 15));
        System.out.print(paddingString(second, 3));
        System.out.print(leftPaddingString(third, 2));
        System.out.println(leftPaddingString(forth, 3));
    }

    static void seperator(){
        System.out.println("-----------------------");
    }

    public static void main(String[] args)
    {
        printString("NFC West", "W", "L", "T");
        seperator();
        printString("Seattle", "13", "3", "0");
        printString("San Francisco", "12", "4", "0");
        printString("Arizona", "10", "6", "0");
        printString("St. Louis", "7", "9", "0");

        System.out.println();

        printString("NFC North", "W", "L", "T");
        seperator();
        printString("Green Bay", "8", "7", "1");
        printString("Chicago", "8", "8", "0");
        printString("Detroit", "7", "9", "0");
        printString("Minnesota", "5", "10", "1");

    }
    
}
