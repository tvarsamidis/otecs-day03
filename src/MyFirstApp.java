public class MyFirstApp {

    public static void sayStatus(String name){
        if (name.length() == 0){
            name = "nobody";
        }
        System.out.println("Check done by " + name);
    }

    public static void sayStatus(double i) {
        System.out.println("The double status code is " + i);
    }


    public static void sayStatus(int i) {
        System.out.println("The int status code is " + i);
    }

    public static int sayAbsolute(int x) {
        int absoluteX = x;
        if (x < 0) {
            absoluteX = -x;
        }
        System.out.println("absolute of " + x + " = " + absoluteX);
        return absoluteX;
    }



    public static void main(String[] args) {
        int num1 = 200;
        int num2 = 800000000; // thomas
        int num3 = 100;

        int max = maxOf3(num1, num2, num3);

        System.out.println("The largest number of " + num1 +
                           ", " + num2 + ", " + num3 +" is " + max);

        String initials = nameInitals("Kate","Zed");
        System.out.println(initials);

    }

    public static String nameInitals(String firstName, String lastName) {
        char f = firstName.charAt(0);
        char l = lastName.charAt(0);
        return "" + f + l;
    }

    /**
     * This method returns the largest of 3 integers
     * @param a the first integer
     * @param b the second integer
     * @param c the third integer
     * @return the largest integer. If two or more integers are both
     * the largest, any one of them is returned.
     */
    public static int maxOf3(int a, int b, int c){
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }
}
