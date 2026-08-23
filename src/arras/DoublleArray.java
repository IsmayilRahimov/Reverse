package arras;

public class DoublleArray {

    public static void main(String[] args) {

        int[][] numbers = {

                {1, 6, 7}, {5, 2, 3}, {4, 2, 3}
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i] + "A");
            }
        }
    }
}
