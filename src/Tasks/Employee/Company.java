package Tasks.Employee;

public class Company {
    public static void main(String[] args) {
      BusinessAnalysis b = new BusinessAnalysis("Ime", "Coach", 47,50000,'M');
      Developer d = new Developer("Tatum", "7",24,120000,'M');
      Driver dr = new Driver("Dennis","71",27,71000,'M');
      ProductOwner p = new ProductOwner("jennifer", "00",41,1111111,'F');
      Tester t = new Tester("Robert","44",25,77000,'M');
        System.out.println(b+"\n" + d+"\n"+dr+"\n"+p+"\n"+t);
        b.work();
        d.work();
        dr.work();
        p.work();
        t.work();
    }
}
