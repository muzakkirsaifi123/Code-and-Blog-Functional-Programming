package Open_Closed_Principle;

public class Intern {
    String name;
    String company;

    public String getname() {
        return name;
    }

    public String getcompany() {
        return company;
    }

    public Intern() {
        setname("Mohd Muzakkir Saifi");
        setcompany("Knoldus Inc");
    }

    public void setcompany(String company)
    {
        this.company=company;
    }

    public void setname(String name)
    {
        this.name = name;
    }
}
