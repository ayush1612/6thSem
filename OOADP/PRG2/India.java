class India extends Country{
    double taxrate = 15.0;

    public double calcTax(double price){
        return taxrate * price;
    }
}