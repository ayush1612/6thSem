class Item {
    String name;
    String category;
    double price;

    Item(String name, String category, double price){
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String toString(){
        return "\nItem Name:"+name+"\nCategory:"+category+"\nPrice:"+price;
    }
}