package Data_and_operation;

public class Casting {
    public static void main(String[] args) {
        // int -> double은 값이 손실되지 않기 때문에 Casting이 필요 없음
        double a = 1.1;
        double b = 1;
        double b2 = (double) 1;
        System.out.println(b);

        // double -> int는 값이 손실되기 때문에 의도적인 Casting이 필요 함
        // int c = 1.1;
        double d = 1.1;
        int e = (int) 1.1;
        System.out.println(e);

        // 1 to String
        String f = Integer.toString(1); // String 1
        System.out.println(f);
        System.out.println(f.getClass());
        // Tip. .getClass는 Data의 Type을 볼 수 있음
    }
}
