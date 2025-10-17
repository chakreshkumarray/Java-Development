package PassBy;

public class Reference {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        swap(x, y);
        System.out.println("After swap(x, y): x=" + x + ", y=" + y); // x=1, y=2
    }


    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
