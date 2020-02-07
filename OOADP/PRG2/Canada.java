class CanadaTax extends Country{
    double taxrate = 20.0;
    public double calcTax(double price){
        return taxrate * price;
    }
}