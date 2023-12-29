package array;

public class Array1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // int형 변수를 5개 만든..

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        System.out.println("학생1 점수: " + students[0]);

        System.out.println(students); //[I@5b6f7412 참조값 나옴
    }
}
