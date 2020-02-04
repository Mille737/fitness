public class Administration extends Employee{

    private int vacation;
    private int salary;

    public Administration(String name, String cpr) {
        super(name, cpr);
        this.salary = 23000;
        this.vacation = 5;
    }


    public int getVacation() {

        return vacation;
    }

    public int getSalary() {


        return salary;
    }
}
