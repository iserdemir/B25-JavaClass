package Day11_SwitchScanner;

public class BrowserName {
    public static void main(String[] args) {
        String browserName = "Chrome";
        if (browserName.matches("chrome|safari|edge|opera|firefox|Chrome|Safari|Edge|Opera|Firefox")) {
            if (browserName.equals("chrome") || browserName.equals("Chrome")) {
                System.out.println(browserName + " browser is selected.");
            } else if (browserName.equals("safari") || browserName.equals("Safari")) {
                System.out.println(browserName + " browser is selected.");
            } else if (browserName.equals("edge") || browserName.equals("Edge")) {
                System.out.println(browserName + " browser is selected.");
            } else if (browserName.equals("opera") || browserName.equals("Opera")) {
                System.out.println(browserName + " browser is selected.");
            } else if (browserName.equals("firefox") || browserName.equals("Firefox")) {
                System.out.println(browserName + " browser is selected.");
            }

        } else
            System.out.println("Invalid Browser Name");
    }
}
