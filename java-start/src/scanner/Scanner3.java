package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자를 입력하세요 : ");
            String word = scanner.nextLine();

            if (word.equals("exit")) {
                break;
            } else {
                System.out.println(word);
            }
        }
    }
}
