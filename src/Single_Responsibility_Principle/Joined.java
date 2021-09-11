package Single_Responsibility_Principle;

public class Joined
{
    String date="19th July 2021";
    private String name;

    void onboarding(String name, String n)
    {
        String company = "Knoldus Inc";
        int emp=1621;
        System.out.println("This is from Single Responsibility and here to let you that");
        System.out.println(name+" has joined "+company+" on "+date+" And his Employee ID is "+emp);
    }

     void setname(String name) {
        this.name=name;
    }

    public static void main(String[] args) {
        Intern I=new Intern();
        Employee_ID E=new Employee_ID();
        Joined J=new Joined();
        J.onboarding(I.getname(),E.getname());

    }
}
