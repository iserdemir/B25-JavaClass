package Day21_ForEachLoop;

public class Items {
    public static void main(String[] args) {
        String[]players = {"Tatum", "Brown", "Schroder", "Freedom"};
        int[] numbers = {0,7,71,13};
        double []average = {30.2,10.5,17.8,4.2};
      /*  for (int i = 0; i < players.length ; i++) {
            String player = players[i];
            int num = numbers[i];
            double av = average[i];
            System.out.println(player + ", " + num+ ", " + av);*/
        for (int i = 0; i < players.length ; i++) {
            String pl = players[i];
            int num = numbers[i];
            double av = average[i];
            System.out.println(pl + ", " + num + ", " + av);


        }
        }
    //}
}
