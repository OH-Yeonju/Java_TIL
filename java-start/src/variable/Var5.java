package variable;

public class Var5 {
    public static void main(String[] args) {
        // 1. 변수 선언, 초기화 각각 따로
        int a;
        a = 1;
        System.out.println(a); // 1

        // 2. 변수 선언, 초기화 동시에
        int b = 2;
        System.out.println(b); // 2

        // 3. 여러 변수 선언ㄴ과 초기화를 한번에
        int c = 3, d = 4;
        System.out.println(c); // 3
        System.out.println(d); // 4
    }
}
