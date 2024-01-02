package fr.octocorn.demos.proxy.product;

public class Offer {
    private String name;
    private String description;
    private String code;
    private double priceExcludingTax;

    public Offer(
            String name,
            String description,
            String code,
            double priceExcludingTax
    ) {
        this.name = name;
        this.description = description;
        this.code = code;
        this.priceExcludingTax = priceExcludingTax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPriceExcludingTax() {
        return priceExcludingTax;
    }

    public void setPriceExcludingTax(double priceExcludingTax) {
        this.priceExcludingTax = priceExcludingTax;
    }
}
