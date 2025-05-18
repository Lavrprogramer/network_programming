package Lab2_7;

public class Pound extends Currency {
    private double rateToHryvnia;

    public Pound(double rateToHryvnia) {
        super("Англійський фунт");
        this.rateToHryvnia = rateToHryvnia;
    }

    @Override
    public double toHryvnia(double amount) {
        return amount * rateToHryvnia;
    }
}