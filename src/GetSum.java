import java.util.Scanner;

/**
 * Solution to lab 2 - exercise 7
 */
public class GetSum {

    public static int getUserInteger(String text){
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        int userResponse = sc.nextInt();
        return userResponse;
    }

    public static void main(String[] args) {
        int count = getUserInteger("How name numbers: ");
        int sum = getSum(count);
        showResults(sum);
    }

    private static void showResults(int sum) {
        System.out.println("The sum of all numbers is " + sum);
    }

    private static int getSum(int count) {
        int sum = 0;
        for (int i = 0 ; i < count; i++) {
            int number = getUserInteger("Give me number " + (i + 1) + ": ");
            sum += number;
        }
        return sum;
    }
}
