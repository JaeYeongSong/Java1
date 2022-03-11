package JavaFlowControl;

public class EqualsApp {
    public static void main(String[] args) {
        int p1 = 1;
        int p2 = 1;
        System.out.println(p1 == p2); // true

        // 객체가 서로 다른 위치에 저장됨
        String o1 = new String("java");
        String o2 = new String("java");
        System.out.println(o1 == o2); // false
        System.out.println(o1.equals(o2)); // true

        String o3 = "java2";
        String o4 = "java2";
        System.out.println(o3 == o4); // true
    }
}
