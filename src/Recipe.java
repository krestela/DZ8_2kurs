import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private String name;
    private ProductList productList;
    private int totalCost;

    public Recipe(String name, ProductList productList, int totalCost) {
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

    public int getTotalCost() {
        return totalCost;
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

}
