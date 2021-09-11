package Liskov_Substitution_principle;

public class Dog extends Cat
{
    void makeNoise()
    {
        Dog d=new Dog();
        System.out.println("Dog can eat veg as well as Non-veg.");
    }
}