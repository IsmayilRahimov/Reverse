package operators;

public class Arithmetic {

    int a = 7;
    int b = 8;

    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();


        int num = 10;
        int num2 = 5;


        System.out.println(num % num2);


        System.out.println(arithmetic.add(10, 20));
    }


}
