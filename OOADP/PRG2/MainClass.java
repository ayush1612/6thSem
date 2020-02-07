import java.util.*;
class MainClass {
    public static void main(String args[]){

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Basketball","BasketBall",6500.50));
        items.add(new Item("Football","Football",2500.50)); 
        items.add(new Item("Golfball","Golf",3500.75)); 
        items.add(new Item("Basebat","Baseball",650.50)); 
        
        Scanner sc = new Scanner(System.in);
        boolean again =true;
        while(again){

            System.out.println("1.To add items into the list.\n2.Display the cart.\n3.Exit.\n");
            int ch = sc.nextInt();
    
            switch(ch){
                case 1:
                System.out.println("Enter the name of the item");
                String name = sc.next();
                
                System.out.println("Enter the category of the item");
                String category = sc.next();
    
                System.out.println("Enter the price of the item");
                double price = sc.nextDouble();
    
                items.add(new Item(name,category,price));
                System.out.println("Added successfully");
                break;
    
            

                case 2:
                System.out.println("Cart:");

                for(Item itr:items)
                    System.out.println(itr);
                break;

                case 3:
                System.out.println("Thanks for shopping");
                again = false;
                break;

            }
        }
        //calculating the total bill
        // Iterator<Item> itr = items.iterator();
        System.out.println("Your Cart Has:");
        double total = 0;
        double tax = 0;
        String country;
        System.out.println("Enter the country");
        country = sc.next();
        for(Item itr:items){
            System.out.println(itr);
            total = total + itr.price;
            if(country.equalsIgnoreCase("India"))
                tax = tax + new India().calcTax(itr.price);
            else if(country.equalsIgnoreCase("USA"))
                tax = tax + new USA().calcTax(itr.price);
            else 
                tax = tax + new CanadaTax().calcTax(itr.price);
        }
        total = total + tax;
        System.out.println("Tax added = "+tax);
        System.out.println("Total Amount = "+total);
        sc.close();
    }


}