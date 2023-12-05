public class OnSaleMerchandise extends Merchandise {

    // variable to set discount as parameter
    private double discountPercentage;

    // constructor taking in parameters from top class and adding discountPercentage
    public OnSaleMerchandise(String productNameIn, double priceIn, int unitsLeftIn, double discountPercentageIn) {

        super(productNameIn, priceIn, unitsLeftIn);
        this.discountPercentage = discountPercentageIn;

    }

    // method to subtract from unitsLeft and return discounted price when unit sold
    public double soldUnit() {
        this.unitsLeft--;
        return this.price * (1-discountPercentage);
    }

    // get method for discounted price to print in menu
    public double getPrice() {
        return this.price * (1-discountPercentage);
    }

}
