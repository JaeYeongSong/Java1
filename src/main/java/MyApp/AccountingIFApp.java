package MyApp;

public class AccountingIFApp {
    public static void main(String[] args) {
        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double VAT = valueOfSupply * vatRate;
        double total = valueOfSupply + valueOfSupply * vatRate;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - valueOfSupply * expenseRate;
        double dividend1;
        double dividend2;
        double dividend3;

        if (income > 10000.0) {
            dividend1 = income * 0.5;
            dividend2 = income * 0.3;
            dividend3 = income * 0.2;
        } else {
            dividend1 = income * 1;
            dividend2 = income * 0;
            dividend3 = income * 0;
        }

        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + VAT);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
        System.out.println("Dividend 1 : " + dividend1);
        System.out.println("Dividend 2 : " + dividend2);
        System.out.println("Dividend 3 : " + dividend3);
    }
}
