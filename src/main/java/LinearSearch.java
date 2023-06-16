public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 9, 3, 5, 4, 7};
        int key = 5;

        boolean found = linearSearch(numbers, key);

        if (found) {
            System.out.println("Key is found in the array.");
        } else {
            System.out.println("Key is not found in the array.");
        }
    }

    public static boolean linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }
}
