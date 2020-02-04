public class Instructor extends Employee {

    public Instructor() {
    }

    public Instructor(int hours, int salary) {
        super(hours, salary);
    }

    public Instructor(String name, String cpr, int hours, int salary) {
        super(name, cpr, hours, salary);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(int salary) {
        salary = 456 * getHours();
        super.setSalary(salary);
    }

    @Override
    public int getHours() {
        return super.getHours();
    }

    @Override
    public void setHours(int hours) {
        super.setHours(hours);
    }
}
