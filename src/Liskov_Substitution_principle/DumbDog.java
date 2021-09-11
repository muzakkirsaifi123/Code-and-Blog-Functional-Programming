package Liskov_Substitution_principle;

public class DumbDog extends Dog
{
    public static void main(String[] args) {
        {
            System.out.println("I am from Liskov_Substitution");
            Cat c=new Cat();
            Dog d= new Dog();
            Animal.makeNoise();
             c.makeNoise();
             d.makeNoise();

        }
    }
}
