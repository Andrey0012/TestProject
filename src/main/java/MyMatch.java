public class MyMatch {
    public static double divide (int number, int number1) {
        if (number1==0) {
            throw new  ArithmeticException("деелние на ноль");
        }
        return (number/number1);
    }
}
