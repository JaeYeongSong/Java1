package ProjectMethod;

public class AccountingApp {
    public static double valueOfSupply; // 공급가액
    public static double vatRate; // 부가가치세율

    public static double getVAT() {
        return valueOfSupply * vatRate;
    }

    public static double getTotal() {
        return valueOfSupply + getVAT();
    }

    public static void main(String[] args) {
        valueOfSupply = 10000.0;
        vatRate = 0.1;
        // double VAT = valueOfSupply * vatRate; // 부가세
        // double total = valueOfSupply + VAT; // 합계

        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
    }
}
