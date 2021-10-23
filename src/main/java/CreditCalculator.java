public class CreditCalculator {
    /**
     * Кредитный калькулятор
     * @param sumCredit сумма кредита
     * @param yearRate годовая ставка в процентах
     * @param countMonths количество месяцев - срок кредита
     * @return
     */

    //расчет месячного платежа
    public double monthPayment(double sumCredit, double yearRate, int countMonths){
        double monthRate = yearRate / 12 / 100;
        return sumCredit * (monthRate + monthRate / (Math.pow(1 + monthRate, countMonths) - 1));
    }

    //расчет общей суммы возврата в банк
    public double totalPayment(double sumCredit, double yearRate, int countMonths){

        return monthPayment(sumCredit, yearRate, countMonths) * countMonths;
    }

    //Расчет переплаты за весь период
    public double overPayment(double sumCredit, double yearRate, int countMonths){

        return totalPayment(sumCredit, yearRate, countMonths) - sumCredit;
    }

}
