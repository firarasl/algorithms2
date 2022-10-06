package assignment9;

public class Commission extends Hourly {

    private double totalSales;
    private double commissionRate;


    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        totalSales=0;
        this.commissionRate=commissionRate;
    }


    public void addSales (double amountOfSales)
    {
        totalSales += amountOfSales;
    }

    @Override
    public double pay() {
        double commission=commissionRate*totalSales;
        double payment = super.pay() + commission;
        totalSales = 0;
        return payment;
    }


    @Override
    public String toString() {
        return  super.toString() +
                "\nTotal Sales: " + totalSales;
    }
}
