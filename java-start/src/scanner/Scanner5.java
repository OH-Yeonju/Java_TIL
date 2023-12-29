package scanner;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력하세요. : ");
            int num = scanner.nextInt();

            if (num != 0) {
                sum += num;
                System.out.println("합계 : " + sum);
            } else {
                System.out.println("프로그램이 종료됩니다.");
                break;
            }
        }
    }
}
