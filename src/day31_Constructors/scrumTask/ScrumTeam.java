package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO, PA, SM;
    public ArrayList<Tester> testersList = new ArrayList<>();
    public ArrayList<Developer> devList = new ArrayList<>();
    public int daysOfSpirit;

    public ScrumTeam(String PO, String PA, String SM,  int daysOfSpirit) {
        this.PO = PO;
        this.PA = PA;
        this.SM = SM;
     //   this.testersList = testersList;
      //  this.devList = devList;
        this.daysOfSpirit = daysOfSpirit;
    }

    public void addTester(Tester tester) {
        testersList.add(tester);
    }

    public void addTesters(Tester[] testers) {
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer) {
        devList.add(developer);
    }

    public void addDevelopers(Developer[] devs) {
        devList.addAll(Arrays.asList(devs));
    }

    public void removeTester(int employeeID) {
        testersList.removeIf(p -> p.employeeID == employeeID);
    }

    public void removeDeveloper(int employeeID) {
        devList.removeIf(p -> p.employeeID == employeeID);
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO = '" + PO + '\'' +
                ", PA = '" + PA + '\'' +
                ", SM = '" + SM + '\'' +
                ", testersList = " + testersList +
                ", devList = " + devList +
                ", daysOfSpirit = " + daysOfSpirit +
                '}';
    }
}
