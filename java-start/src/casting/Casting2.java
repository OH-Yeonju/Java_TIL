package casting;

public class Casting2 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;
        long maxIntOver = 2147483648L;

        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println(intValue); // 2147483647

        intValue = (int) maxIntOver;
        System.out.println(intValue); // -2147483648 > int의 가장 작은 범위부터 다시 시작
    }
}
