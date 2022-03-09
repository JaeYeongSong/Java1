package Data_and_operation;

public class StringOperation {
    public static void main(String[] args) {
        System.out.println("Hello World".length()); // 1

        System.out.println("Hello, [[[name]]]... bye.".replace("[[[name]]]", "egoing")); // 해당 문자열 변경
        // Tip. replace target을 [[[undefind]]] 사용하여 오류를 방지하자.
    }
}
