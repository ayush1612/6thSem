class USA extends Country{
    double taxrate = 18.0;
    public double calcTax(double price){
        return taxrate * price;
    }
}