package Lab2_7;

public class Euro extends Currency {
    private double rateToHryvnia;

    public Euro(double rateToHryvnia) {
        super("Євро");
        this.rateToHryvnia = rateToHryvnia;
    }

    @Override
    public double toHryvnia(double amount) {
        return amount * rateToHryvnia;
    }
}

