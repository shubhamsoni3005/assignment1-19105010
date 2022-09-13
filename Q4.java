public class Q4 {
    public static void main(String[] args) {
        int a = 2, b = 3;
        //swapping with temporary variable
        int temp = b;
        b=a;
        a=temp;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a = 2;
        b = 3;
        //swapping without temporary variable
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
