public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1, 2, 4, 5, 6, 4};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Duplicate value: " + numbers[i] + " at index " + j);
                }
            }
        }
    }
}
