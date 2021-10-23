import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {

    @Test
    public void test_monthPayment(){
        CreditCalculator calculator = new CreditCalculator();

        double sumCredit = 1000;
        double yearRate = 20;
        int countMonths = 12;
        double result = 92.63451;

        double expected = calculator.monthPayment(sumCredit, yearRate, countMonths);

        Assertions.assertTrue(Math.abs(expected - result) < 0.001);
    }

    @Test
    public void test_totalPayment(){
        CreditCalculator calculator = new CreditCalculator();

        double sumCredit = 1000;
        double yearRate = 20;
        int countMonths = 12;
        double result = 1111.614;

        double expected = calculator.totalPayment(sumCredit, yearRate, countMonths);

        Assertions.assertTrue(Math.abs(expected - result) < 0.001);
    }

    @Test
    public void test_overPayment(){
        CreditCalculator calculator = new CreditCalculator();

        double sumCredit = 1000;
        double yearRate = 20;
        int countMonths = 12;
        double result = 111.614;

        double expected = calculator.overPayment(sumCredit, yearRate, countMonths);

        Assertions.assertTrue(Math.abs(expected - result) < 0.001);
    }

}
