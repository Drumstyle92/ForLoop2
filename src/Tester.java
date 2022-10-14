/**
 * @author Drumstyle92
 * class that contains the heart of the system.
 */
public class Tester {
    /**
     * @param args main parameter.
     * main method that contains a for loop that prints the fibonacci sequence.
     */
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;

        System.out.println("-----------FibonacciSequence-----------------");

        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

        System.out.println(num1);

        for(int i = 2; i <= 10; ++i){
            int sum = num1 + num2;
            num2 = num1;
            num1 = sum;
            System.out.println(sum);
        }

        System.out.println("------------------Finish---------------------");
    }
}
