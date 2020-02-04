public class Administration extends Employee {

    private int vacation = 5;

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(int salary) {
        salary = 23000;
        super.setSalary(salary);
    }

    @Override
    public int getHours() {
        return super.getHours();
    }

    @Override
    public void setHours(int hours) {
        hours = 37;
        super.setHours(hours);
    }

    public Administration() {
    }

    public Administration(int vacation) {
        this.vacation = vacation;
    }

    public Administration(int hours, int salary, int vacation) {
        super(hours, salary);
        this.vacation = vacation;
    }

    public Administration(String name, String cpr, int hours, int salary, int vacation) {
        super(name, cpr, hours, salary);
        this.vacation = vacation;
    }

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }
}
