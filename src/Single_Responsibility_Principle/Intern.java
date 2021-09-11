package Single_Responsibility_Principle;

public class Intern {
    String name;
    String company;

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public Intern() {
        setname("Mohd Muzakkir Saifi");
        setcompany("Knoldus Inc");
    }

    private void setcompany(String knoldus) {
    }

    private void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return  name;
    }
}
