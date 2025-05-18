package Lab2_7;

public class Dollar extends Currency {
    private double rateToHryvnia;

    public Dollar(double rateToHryvnia) {
        super("Долар США");
        this.rateToHryvnia = rateToHryvnia;
    }

    @Override
    public double toHryvnia(double amount) {
        return amount * rateToHryvnia;
    }
}
