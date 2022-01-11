package Day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int s = 50;
        String result = (s >= 0 && s <= 100) ? (s >= 60) ? "Passed" : "Failed" : "Invalid Number";
        System.out.println(result);
    }
}
