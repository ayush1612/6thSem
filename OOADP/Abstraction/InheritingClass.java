package Abstraction;

class InheritingClass extends AbstractClass{
    public void calculate(){
        id = id + 600;
    }

    public void display(){
        System.out.println("The value of id ="+id);
    }

}