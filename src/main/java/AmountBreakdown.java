import java.util.Scanner;
public class AmountBreakdown {
    public static void main(String[] args) {

            int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the amount: ");
            int amount = scanner.nextInt();
            scanner.close();


            System.out.println("Output:");
            for (int note : notes) {
                int count = amount / note;
                if (count > 0) {
                    System.out.println(note + " " + count);
                    amount = amount % note;
                }
            }

        }
    }

