package Liskov_Substitution_principle;

class Cat implements Animal
{
    void makeNoise()
    {
        Cat c=new Cat();
        System.out.println("Cat can eat Non-veg.");
    }
}