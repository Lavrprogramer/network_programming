package Lab2_7;

public abstract class Currency {
    private String name;

    public Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayCurrencyName() {
        System.out.println("Назва валюти: " + getName());
    }

    public abstract double toHryvnia(double amount);
}