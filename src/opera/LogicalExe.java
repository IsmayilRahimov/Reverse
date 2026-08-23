package opera;

public class LogicalExe {


    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        System.out.println(a == b && b == a || b != a && a != b);


        int age = 17;
        boolean active = true;

        System.out.println(age < 16 && age < 15 || active);


        System.out.println(!active);

        System.out.println(false && true);

        System.out.println(false || true);


    }
}
