package Open_Closed_Principle;

public class Joined extends Employee_ID
{
    String date="19th July 2021";
    String name="Mohd Muzakkir Saifi";


    public void onboarding(String getname, String s, int n)
    {
        System.out.println("I am from Open Closed Responsibility Principle.");
        System.out.println(name+" has joined "+company+" on "+date+" his Employee ID is "+emp);
    }

    public static void main(String[] args) {
        Intern I= new Intern();
        Employee_ID E=new Employee_ID();
        Joined J=new Joined();
        J.onboarding(I.getname(),E.getname(),E.getemp());

    }
}
