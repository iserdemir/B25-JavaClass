package day31_Constructors;

public class Offer {
    public String location,companyName,jobTitle;
    public int salary;
    public boolean hasBenefit,hasPTO,isWFH,isFullTime;


    public Offer(String location, String companyName, String jobTitle, int salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "location = '" + location + '\'' +
                ", companyName = '" + companyName + '\'' +
                ", jobTitle = '" + jobTitle + '\'' +
                ", salary = $" + salary +
                ", hasBenefit = " + hasBenefit +
                ", hasPTO = " + hasPTO +
                ", isWFH = " + isWFH +
                ", isFullTime = " + isFullTime +
                '}';
    }
}
