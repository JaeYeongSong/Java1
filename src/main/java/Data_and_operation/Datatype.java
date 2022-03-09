package Data_and_operation;

public class Datatype {
    public static void main(String[] args) {
        System.out.println(6); // Number
        System.out.println("six"); // String
        
        // 숫자형 6과 문자형 '6'은 다르다
        System.out.println('6'); // String 6

        // Data Type 에 따라 연산자가 다르다
        // 필요한 목적에 맞는 Data Type 을 사용하자
        System.out.println(6 + 6); // 12
        System.out.println("6" + "6"); // 66
        
        System.out.println(6 * 6); // 36
        // System.out.println("6" * "6");

        System.out.println("1111".length());
        // System.out.println(1111.length());
    }
}
