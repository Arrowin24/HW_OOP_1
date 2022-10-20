public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower(double cost) {
        this("Белый", "Россия", cost, 3);
    }

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerColor = flowerColor;
        this.country = country;
        setCost(cost);
        this.lifeSpan = lifeSpan;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country!=null){
            this.country = country;
        } else {
            country = "Россия";
        }

    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = (Math.ceil(cost * 100) / 100);
        }

    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        }
    }
}
