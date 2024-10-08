public class MySecondApp {


    public static void demo1(){
        int from = 1;
        int to = 1;
        int divisor = 11;

        for (int i = from; i <= to; i++){
            boolean result = isDivisible(i, divisor);
            if (result == true) {
                System.out.println(i + " is divisible by " + divisor);
            }
        }
    }

    public static void main(String[] args) {
        demo1();
        demo2();
    }
    public static void demo2(){
        int count = checkSentence("i am standing at the edge of  the aaaaaaaaaaaaaaaaah!", 'a');
        System.out.println(count);
    }

    public static int checkSentence(String sentence, char letter) {
        int count = 0;
        for (int i = 0; i < sentence.length() ; i++ ){
            char c = sentence.charAt(i);
            if (c == letter){
                count++;
            }
        }
        return count;
    }

    public static boolean isDivisible(int number, int divisor) {
        int div1 = number / divisor;
        double div2 = (double) number / divisor;
        return div1 == div2;
    }
}
