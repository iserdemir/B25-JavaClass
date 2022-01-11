package Day08_IfStatements;

public class SwapTwoVariablesWithTemporaryVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        int c = b;

        b = a;
        a = c;
        c = b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
