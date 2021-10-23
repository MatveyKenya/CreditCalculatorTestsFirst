public class Main {
    public static void main(String[] args) {

        CreditCalculator calculator = new CreditCalculator();

        System.out.println(calculator.monthPayment(1000, 20, 12));
        System.out.println(calculator.totalPayment(1000, 20, 12));
        System.out.println(calculator.overPayment(1000, 20, 12));

    }
}
