package MyApp;

public class AccountingMethodApp {
    private static double valueOfSupply;
    private static double vatRate;
    private static double expenseRate;

    public static void main(String[] args) {
        // double valueOfSupply = Double.parseDouble(args[0]);
        valueOfSupply = 10000.0;
        vatRate = 0.1;
        expenseRate = 0.3;
        print();
    }

    private static void print() {
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVat());
        System.out.println("Total : " + getTotal());
        System.out.println("Expense : " + getExpense());
        System.out.println("Income : " + getIncome());
        System.out.println("Dividend 1 : " + getDividend(0.5));
        System.out.println("Dividend 2 : " + getDividend(0.3));
        System.out.println("Dividend 3 : " + getDividend(0.2));
    }

    private static double getDividend(double dividend) {
        return getIncome() * dividend;
    }

    private static double getIncome() {
        return valueOfSupply - getExpense();
    }

    private static double getExpense() {
        return valueOfSupply * expenseRate;
    }

    private static double getTotal() {
        return valueOfSupply + getVat();
    }

    private static double getVat() {
        return valueOfSupply * vatRate;
    }
}
