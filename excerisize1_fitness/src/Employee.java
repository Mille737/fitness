public class Employee extends Person /* super class for the two types of employees */ {

    private int hours;
    private int salary;

    public Employee() {
    }

    public Employee(int hours, int salary) {
        this.hours = hours;
        this.salary = salary;
    }

    public Employee(String name, String cpr, int hours, int salary) {
        super(name, cpr);
        this.hours = hours;
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
