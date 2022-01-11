package Tasks;

public class ReturnTheNumber_array {
    public static void main(String[] args) {
        String [] str ={"java", "Abc", "python" , "python", "python", "c++", "enough" };
        int count = 0;
        int count1 =0;
        for (String s : str) {
            if (s.equals("java")){
                count++;
            } if (s.equals("python")){
                count1++;
            }


        }System.out.println("java = " + count);
        System.out.println("python = " + count1);
    }
}
