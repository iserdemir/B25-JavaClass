package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
        //3 testers objects
        Tester tester1 = new Tester("Kerem", 19057, "SDET", 95000);
        Tester tester2 = new Tester("Halil", 190567, "QA", 135000);
        Tester tester3 = new Tester("Berkan", 190522, "Automation Tester", 150000);

        Tester [] testers = {tester1,tester2,tester3};
        //4 developer objects
        Developer dev1 = new Developer("Fatih", 19053, "FullStack", 195000);
        Developer dev2 = new Developer("Nando", 19051, "FullStack", 190500);
        Developer dev3 = new Developer("Selcuk", 19058, "Back-End", 190500);
        Developer dev4 = new Developer("Riera", 19053, "Front-End", 190500);

        Developer [] developers = {dev1,dev2,dev3,dev4};
        //1 Scrum team object

        ScrumTeam scrum = new ScrumTeam("Erman", "Emre", "Cagil", 21);
        scrum.addTester(tester1);
        scrum.addDeveloper(dev1);
        scrum.addDevelopers(developers);
        scrum.addTesters(testers);


    }
}
