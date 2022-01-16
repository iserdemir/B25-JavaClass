package Tasks.Browser;

public class Test {
    public static void main(String[] args) {
        Chrome c = new Chrome("Chrome");
c.openBrowser();
        System.out.println(c);
Firefox f = new Firefox("Firefox");
        System.out.println(f);
        f.closeBrowser();

    }
}
