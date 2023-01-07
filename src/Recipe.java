import java.util.Objects;

public class Recipe {
    private String name;
    private ProductList productList;
    private double totalCost;

    public Recipe(String name, ProductList productList, double totalCost) {
        this.name = name;
        this.productList = productList;
        this.totalCost = totalCost;
    }

    public String getName() {
        return name;
    }

    public ProductList getProductList() {
        return productList;
    }

    public double getTotalCost(double totalCost) {
        return getTotalCost(this.totalCost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", productList=" + productList +
                ", totalCost=" + totalCost +
                '}';
    }
}
