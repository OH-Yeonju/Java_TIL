package scanner;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫번째 숫자를 입력하세요 : ");
            int int1 = scanner.nextInt();

            System.out.print("두번째 숫자를 입력하세요 : ");
            int int2 = scanner.nextInt();

            if (int1 != 0 || int2 != 0) {
                System.out.println("두 숫자의 합은 : " + (int1 + int2));
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
