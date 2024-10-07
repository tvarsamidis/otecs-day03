public class MyFirstApp {

    public static void sayStatus(String name){
        if (name.length() == 0){
            name = "nobody";
        }
        System.out.println("Check done by " + name);
    }


    public static void main(String[] args) {
        int num1 = 200;
        sayStatus("");
        int num2 = 800000000; // thomas
        int num3 = 100;
        int max = num1;
        if (max < num2) {
            max = num2;
        }
        sayStatus("Giota");
        if (max < num3) {
            max = num3;
        }
        System.out.println("The largest number of " + num1 + ", " + num2 + ", " + num3 +" is " + max);
        sayStatus("Dimitris");

    }
}
