package study.chap_5_arr;

public class ArrayPart {
    public static void main(String[] args) {
        // 1.
        // String[] coffees = new String[4];
        // 2.
        // String coffees[] = new String[4];
        // 3.
        // String[] coffees = new String[] {"a", "b", "c", "d"};
        // 4.
        String[] coffees = {"a", "b", "c", "d"};
        
        for (String coffee : coffees) System.out.println(coffee);
        
        String[] seatA = {"A1","A2","A3","A4"};
        String[] seatB = {"B1","B2","B3","B4"};
        String[] seatC = {"C1","C2","C3","C4"};

        String[][] seats = new String[][] {
            {"A1","A2","A3","A4"},
            {"B1","B2","B3","B4"},
            {"C1","C2","C3","C4"}
        };

        for (String[] seatsLine: seats) {
            for (String seat: seatsLine) System.out.print(seat + " ");
            System.out.println();
        }
        
    }
}
