package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값=" + dataA); // Data@2f4d3709
        System.out.println("dataB 참조값=" + dataB); // Data@2f4d3709
        System.out.println("dataA.value =" + dataA.value); // 10
        System.out.println("dataA.value =" + dataB.value); // 10

        // dataA 변경
        dataA.value = 20;
        System.out.println("dataA 참조값=" + dataA); // Data@2f4d3709
        System.out.println("dataB 참조값=" + dataB); // Data@2f4d3709
        System.out.println("dataA.value =" + dataA.value); // 20
        System.out.println("dataA.value =" + dataB.value); // 20
    }


}
