public class CountDigits {
    public static void main(String[] args) {
        int theNumber = GetSum.getUserInteger("Give me a number");
        int numberOfDigits = countDigits(theNumber);
        System.out.println("Number " + theNumber + " has " + numberOfDigits + " digits");
    }

    public static int countDigits(int num) {
        String text = "" + num;
        int count = text.length();
        return count;
    }
}
