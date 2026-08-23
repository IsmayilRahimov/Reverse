package ElseIFElse;

public class CaseDay {


    static int day = 11;

    public static void main(String[] args) {

        switch (day) {
            case 1:
                System.out.println("Bazar ertesi:");
                break;
            case 2:
                System.out.println("Cersenbe axsami:");
                break;
            case 3:
                System.out.println("Cersenbe:");
                break;

            default:
                System.out.println("Bele bir gun yoxdur:");
        }
    }

}
