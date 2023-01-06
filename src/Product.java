import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private float weight;

    public Product(String name, double price, float weight) {
        setName(name);
        setPrice(price);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null && name.isEmpty() && name.isBlank()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        this.price = price;

    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {

        this.weight = weight;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString() {
        return name + price + weight;
    }

}
