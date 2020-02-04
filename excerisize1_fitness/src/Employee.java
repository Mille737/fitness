public class Employee extends Person{

    private int hours;
    private int salary;
    private int vacation;


    public Employee(String name, String cpr, int hours) {
        super(name, cpr);

        this.hours = hours;
        this.salary = 456 * hours;
    }


    public Employee(String name, String cpr) {
        super(name, cpr);
        this.hours = 37;
    }

    public int getHours() {

        return hours;
    }

    public int getSalary() {

        return salary;
    }

    public int getVacation() {

        return vacation;
    }
}
