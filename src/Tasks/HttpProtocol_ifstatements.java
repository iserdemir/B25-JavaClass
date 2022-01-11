package Tasks;

import java.util.Scanner;

public class HttpProtocol_ifstatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your code");
        int code = scan.nextInt();
        if (code == 200) {
            System.out.println("OK");
        } else if (code == 201) {
            System.out.println("Created");
        } else if (code == 202) {
            System.out.println("Accepted");
        } else if (code == 301) {
            System.out.println("Moved Permanently");
        } else if (code == 303) {
            System.out.println("See Other");
        } else if (code == 304) {
            System.out.println("Not Modified");
        } else if (code == 400) {
            System.out.println("Bad Request");
        } else if (code == 401) {
            System.out.println("Unauthorized");
        } else if (code == 403) {
            System.out.println("Forbidden");
        } else if (code == 404) {
            System.out.println("Not Found");
        } else if (code == 410) {
            System.out.println("Gone");
        } else if (code == 500) {
            System.out.println("Internal Server Error");
        } else if (code == 503) {
            System.out.println("Service Unavailable");
        } else {
            System.out.println("Invalid Code Number");
        }


    }
}
