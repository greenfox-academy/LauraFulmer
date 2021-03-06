import java.util.ArrayList;
import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

         int[] squared = numbers.stream()
         .filter(number -> number > 0)
         .mapToInt(number -> number * number)
         .toArray();

        System.out.println(Arrays.toString(squared));
    }
}
