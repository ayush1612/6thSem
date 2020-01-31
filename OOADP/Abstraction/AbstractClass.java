package Abstraction;

abstract class AbstractClass{
    int id = 100;
    abstract void calculate();
    abstract void display();
    
    void check(){
        System.out.println("This method belongs to the abstract class");
    }
}