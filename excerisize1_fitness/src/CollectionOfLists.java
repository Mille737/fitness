import java.util.ArrayList;
import java.util.Arrays;

public class CollectionOfLists {

    //list of all employees both admin and instructor
    public static void getAllEmployees() {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Instructor("Thea", "0202962134", 23));
        employees.add(new Administration("Andreas", "8875021995"));

        System.out.println("Name    CPR    Hours    Salary     Vacation");
        for (Employee employee : employees) {
            if (employee.getHours() == 37) {
                System.out.println("*********************************");
                System.out.print(employee.getName() + ',' + ' ');
                System.out.print(employee.getCpr() + ',' + ' ');
                System.out.print(employee.getHours() + "," + ' ');
                System.out.print(employee.getSalary() + "," + ' ');
                System.out.println(employee.getVacation());
            } else {
                System.out.println("*********************************");
                System.out.print(employee.getName() + ',' + ' ');
                System.out.print(employee.getCpr() + ',' + ' ');
                System.out.print(employee.getHours() + "," + ' ');
                System.out.println(employee.getSalary());
            }
        }
    }

    //List of all fitness members
    public static void getAllFitnessMembers() {

        ArrayList<Member> fitnessMembers = new ArrayList<>();

        fitnessMembers.add(new Member("camille", "1101962012", true));
        fitnessMembers.add(new Member("Christian", "2334329877", false));
        fitnessMembers.add(new Member("Nadia", "4478549022", true));

        System.out.println("Name    CPR    Type    Fee");
        for (Member members : fitnessMembers) {
            System.out.println("*********************************");
            System.out.print(members.getName()+ ',' + ' ');
            System.out.print(members.getCpr()+ ',' + ' ');
            System.out.print(members.getMemberType()+ ',' + ' ');
            System.out.println(members.monthlyFee());
        }
    }

    // list of all people related to the fitness center, employees and members
    public static String getAllFitnessPeople() {

        ArrayList<Person> allFitnessPeople = new ArrayList<>();

        allFitnessPeople.add(new Person("camille", "1101962012"));
        allFitnessPeople.add(new Person("Christian", "2334329877"));
        allFitnessPeople.add(new Person("Nadia", "4478549022"));
        allFitnessPeople.add(new Person("Thea", "0202962134"));
        allFitnessPeople.add(new Person("Andreas", "8875021995"));

        String list = Arrays.toString(allFitnessPeople.toArray()).replace(", *", "*").replace(", *", "*");

        System.out.println("Name        CPR");

        return list.substring(1,list.length()-1);
    }

}
