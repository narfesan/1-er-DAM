package compilador26_34;

public class compi29 {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;

        System.out.println(num1);
        System.out.println(num2);

        for (int fib = num1 + num2; fib < 1000; fib = num1 + num2) {
            System.out.println(fib);

            num1 = num2;
            num2 = fib; 
        }
    }
}
