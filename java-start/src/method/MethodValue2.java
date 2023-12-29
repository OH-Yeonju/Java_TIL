package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("changeNumber 호출 전, number : " + number); // 5
        changeNumber(number);
        System.out.println("changeNumber 호출 후, number : " + number); // 5
    }

    public static void changeNumber(int number) {
        System.out.println("변경 전 number :" + number); // 5
        number = number * 2;
        System.out.println("변경 후 number : " + number); // 10
    }
}
