package arras;

public class ArrayForInput {


    public static void main(String[] args) {


        int[] age = {1, 9, 5, 7, 8};

        System.out.println(age[0]);

        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
//        System.out.println(age.length - 1);


        System.out.println(age[age.length - 1]);


        for (int ages : age) {
            System.out.println(ages);
        }


    }
}
