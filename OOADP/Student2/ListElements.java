package Student2;
import java.util.*;

class ListElements{
    public static void main(String args[]){
        ArrayList<Student> arr = new ArrayList<Student>();
        arr.add(new Student("Kaneki","1MS17"));
        arr.add(new Student("Tanjirou","1MS18"));
        arr.add(new Student("Midoriya","1MS18"));
        arr.add(new Student("Bakugo","1MS18"));

        for(Student x:arr){
            System.out.println(x);
        }
        //made a new arrayList and then copied the elements from arr to arr2
        ArrayList<Student> arr2 = arr;

        //printing the elements in arr2
        System.out.println("\nArrayList 2 Elements:\n====================");
        System.out.println(arr2);

        //using index
        System.out.println("\nUsing get method:\n===================");
        System.out.println(arr2.get(0));

        System.out.println("\nUsing iterator:\n===================");
        Iterator<Student> iter = arr.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        // System.out.println("The student Tanjirou is  at array index :"+arr.indexOf(Student("Tanjirou","1MS18")));
        System.out.println("\nUsing for loop:\n==================");
        for(int i=0;i<arr.size();i++)
            System.out.println(arr.get(i));
    }
}