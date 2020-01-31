package Student1;

import java.util.*;

public class ListElements{
    public static void main(String args[]){
        ArrayList<Student> arr = new ArrayList<Student>();

        arr.add(new Student("Ayush","1MS17"));
        arr.add(new Student("Ujjwal","1MS18"));
        arr.add(new Student("Bakero","1MS19"));
        System.out.println("The array elements are:\n"+arr);

        Iterator<Student> iter = arr.iterator();
        System.out.println("The Student details are:");
        int i=1;
        while(iter.hasNext()){
            System.out.println("Student "+(i++)+" :"+iter.next());
        }
    for(Student x:arr){
        System.out.println(x);
    }
    }
}