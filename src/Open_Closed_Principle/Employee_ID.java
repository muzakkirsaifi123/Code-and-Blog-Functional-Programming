package Open_Closed_Principle;

public class Employee_ID extends Intern
{
    int emp;
    String salary;

    public int getemp() {
        return emp;
    }
    public void setemp(int emp) {
        this.emp=emp;
    }
    public Employee_ID() {
        setemp(1621);
    }

}