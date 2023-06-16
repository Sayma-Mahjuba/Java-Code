import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 9, 3, 5, 4, 7};
        int key = 5;
        Arrays.sort(numbers);


        boolean found = binarySearch(numbers, key);
        if (found) {
            System.out.println("Key found in the array");
        } else {
            System.out.println("Key not found in the array");
        }
    }


    public static boolean binarySearch(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == key) {
                return true;
            } else if (array[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;

    }

}
