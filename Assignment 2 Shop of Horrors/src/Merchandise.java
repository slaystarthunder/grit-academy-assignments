public class Merchandise {
    // attribute variables needed for merchandise
    protected String productName;
    protected double price;
    protected int unitsLeft;

    // merchandise constructor
    public Merchandise(String productNameIn, double priceIn, int unitsLeftIn) {

        productName = productNameIn;
        price = priceIn;
        unitsLeft = unitsLeftIn;
    }

    // method activated when product is sold to subtract from total number
    // and return the price for totalCost in Customer
    public double soldUnit() {
        this.unitsLeft--;
        return this.price;
    }

    // get methods to show parameter values in the menu
    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public int getUnitsLeft() {
        return unitsLeft;
    }
}
