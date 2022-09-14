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
        a = a+b; //after this step, a = 5, b = 3
        b = a-b; // a = 5, b = 2
        a = a-b; // a = 3, b = 2
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
