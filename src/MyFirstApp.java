public class MyFirstApp {
    public static void main(String[] args) {
        int num1 = 200;
        int num2 = 300;
        int num3 = 100;
        int max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        System.out.println("The largest number of " + num1 + ", " + num2 + ", " + num3 +" is " + max);

    }
}
