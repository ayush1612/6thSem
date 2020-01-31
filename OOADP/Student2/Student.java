package Student2;

class Student{
    String name,usn;
    Student(String name,String usn){
        this.name = name;
        this.usn = usn;
    }
    public String toString(){
        return "\nName :"+name+"\nUSN :"+usn;
    }
}