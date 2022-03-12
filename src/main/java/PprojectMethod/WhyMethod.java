package PprojectMethod;

public class WhyMethod {
    public static void main(String[] args) {
        // Code...
                      // 인자, argument
        printTwoTimes("a", "-");
        // Code...
        printTwoTimes("a", "*");
        // Code...
        printTwoTimes("a", "&");
        printTwoTimes("b", "!");
    }

                                     // 매개변수, parameter
    public static void printTwoTimes(String text, String delimiter) {
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }
}
