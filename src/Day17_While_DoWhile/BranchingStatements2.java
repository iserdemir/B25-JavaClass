package Day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {
        for (char i = 'A'; i < 'Z'; i++) {
            if (i == 'F' || i == 'B'|| i == 'J' ){
                continue;
            }
            System.out.print(i + " ");

        }System.out.println("*********");
        for (int i = 0; i <=10 ; i++) {
            if (i%2==1){
                continue;
            }

            System.out.print(i + " ");
        }
    }
}
