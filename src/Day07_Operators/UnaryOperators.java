package Day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = 8238;
         ++num1;
        System.out.println("num1 = " + num1++);
        System.out.println("num1 = " + num1);
        num1 = 2 * num1;
        System.out.println("num1 = " + num1);
        System.out.println("num1 = " + num1);
        
        int gs = 433;
        System.out.println("++gs = " + ++gs);
        System.out.println("gs++ = " + gs++);
        System.out.println("gs = " + gs);
    }
}
