package ProjectOOP;

class Accounting {
    public static double valueOfSupply; // 공급가액
    public static double vatRate = 0.1; // 부가가치세율

    public static double getVat() {
        return valueOfSupply * vatRate;
    }

    public static double getTotal() {
        return valueOfSupply + getVat();
    }
}

public class AccountingApp {
    public static void main(String[] args) {
        Accounting.valueOfSupply = 10000.0;
        System.out.println("Value of supply : " + Accounting.valueOfSupply);
        System.out.println("VAT : " + Accounting.getVat());
        System.out.println("Total : " + Accounting.getTotal());
    }
}
