package access;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("더 이상 더할 수 없습니다.");
            return;
        }
        count ++;
        System.out.println("현재값 : " + count);

    }

    public int getCount() {
        return count;
    }
}
