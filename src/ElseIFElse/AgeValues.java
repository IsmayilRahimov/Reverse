package ElseIFElse;

public class AgeValues {

    static String name = "Samir";


    static int corrctAge = 10;


    public void addMethod(String name, int age) {
        if (name.equals(AgeValues.name)) {
            System.out.println("Daxil etdiyiniz ad Dogrudur :" + name);
        } else {
            System.out.println("Daxil etdiyiniz ad dogru deyil:");
        }
        if (age == corrctAge) {
            System.out.println("Daxil etdiyiniz yasiniz dogrudur :");
        }
    }

    public static void main(String[] args) {

        AgeValues ageValues = new AgeValues();

        name = "Samir";
        int age = 10;
        ageValues.addMethod(name, age);
    }

}
