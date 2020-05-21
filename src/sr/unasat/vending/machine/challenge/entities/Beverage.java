package sr.unasat.vending.machine.challenge.entities;

public class Beverage {
    private String naam;
    private Double price;

    public Beverage(String naam, Double price) {
        this.naam = naam;
        this.price = price;
    }

    public String getNaam() {
        return naam;
    }

    public Double getPrice() {
        return price;
    }
}
