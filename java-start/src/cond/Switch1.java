package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 2;

        // 강화된 switch 표현식
        int coupon = switch (grade) {
            // 조건에 따른 값이 같다면 case 1, 2 처럼 , 로 구별 가능하다
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println(coupon);
    }
}
