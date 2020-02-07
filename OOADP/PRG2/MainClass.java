import java.util.*;
class MainClass {
    public static void main(String args[]){

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Basketball","India",6500.50));
        items.add(new Item("Football","US",2500.50)); 
        items.add(new Item("Cricket","Canada",3500.75)); 
        items.add(new Item("Baseball","India",650.50)); 

        //calculating the total bill
        // Iterator<Item> itr = items.iterator();
        System.out.println("List Of items");
        double total = 0;
        double tax = 0;
        for(Item itr:items){
            System.out.println(itr);
            total = total + itr.price;
            if(itr.category.equalsIgnoreCase("India"))
                tax = tax + 0.18 * itr.price;
            else if(itr.category.equalsIgnoreCase("USA"))
                tax = tax + 0.20 * itr.price;
            else 
                tax = tax + 0.15 * itr.price;
        }
        total = total + tax;
        System.out.println("Tax added = "+tax);
        System.out.println("Total Amount = "+total);
    }
}