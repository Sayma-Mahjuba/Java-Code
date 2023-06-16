import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int[] numbers = generateRandomNumbers(10);

        System.out.println("Generated Numbers: " + Arrays.toString(numbers));
        int maxNumber = numbers[0];
        int minNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }

            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }

        System.out.println("Maximum Number: " + maxNumber);
        System.out.println("Minimum Number: " + minNumber);
    }

    public static int[] generateRandomNumbers(int count) {
        int[] numbers = new int[count];
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt();
        }

        return numbers;
    }
}
