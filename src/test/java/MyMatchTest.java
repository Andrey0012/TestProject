import org.junit.Test;

public class MyMatchTest {
    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldTrowsException() {
       MyMatch.divide(1,0);
    }
}
