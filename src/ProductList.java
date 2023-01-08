import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProductList {
    private final Map<Product, Integer> products = new HashMap<>();

    public void main(String[] args) {
        products.put(new Product("Банан", 15), 2);


    }

    public double countTotalCost() {
        double total = 0.0;
        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            total += product.getKey().getPrice() * product.getValue();
            System.out.println("Продукт: " + product.getKey().getName() + " - " + product.getValue() + " kg. Cтоимость: " + total + " рублей.");
        }
        return total;
    }

    public void checkProduct(String name) {
        boolean isBought = false;
        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            if (product.getKey().getName().equals(name)) {
                System.out.println(name + " продукт куплен");
                isBought = true;
                break;
            }
        }
        if (!isBought) {
            System.out.println(name + "не куплен");
        }
    }

    public void addProductToList(Product product) {
        if (product == null) {
            return;
        }
        if (this.products.containsKey(product)) {
            Integer productCount = this.products.get(product);
            this.products.put(product, ++productCount);
        } else {
            this.products.put(product, 1);
        }
    }
}
