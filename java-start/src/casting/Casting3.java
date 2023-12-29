package casting;

public class Casting3 {
    public static void main(String[] args) {
        int div1 = 3 / 2; // int int
        System.out.println(div1); // int 1

        double div2 = 3 / 2; // int int
        System.out.println(div2); // int -> double 1.0

        double div3 = 3.0 / 2; // double int
        System.out.println(div3); // double 1.5

        double div4 = (double) 3 / 2; // double 3 / double 2 = double
        System.out.println(div4); // double 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println(result); // 1.5
    }
}
