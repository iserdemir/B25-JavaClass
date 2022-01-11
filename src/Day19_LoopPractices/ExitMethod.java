package Day19_LoopPractices;

public class ExitMethod {
    public static void main(String[] args) {
        for (int i = 0; i <8 ; i++) {
            if (i==5){
                System.exit(0);
            }
            System.out.println(i);

        }
        System.out.println("Wooden Spoon");
    }
}
