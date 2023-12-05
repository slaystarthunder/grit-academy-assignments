public class Customer {

    private double totalCost;
    private int numberOfUnits;

    // constructor for customer object
    public Customer() {

        // when a customer starts a session cost and # of unites are always zero
        totalCost = 0;
        numberOfUnits = 0;
    }

    // set method to add totalCost and numberOfUnits to the current object
    public void addTotalCost(double totalCost) {
        this.totalCost += totalCost;
        this.numberOfUnits ++;
    }

    // get method for totalCost
    public double getTotalCost() {
        return totalCost;
    }

    // get method for numberOfUnits
    public int getNumberOfUnits() {
        return numberOfUnits;
    }

}
