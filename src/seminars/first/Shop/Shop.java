package seminars.first.Shop;

import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * Метод сортировки по возрастанию по цене списка продуктов
     * @return отсортированный список продуктов
     */
    public List<Product> sortProductsByPrice() {
        products.sort(Comparator.comparing(Product::getCost));
        return products;
    }

    /**
     * Метод поиска самого дорогого продукта
     * @return самый дорогой продукт
     */
    public Product getMostExpensiveProduct() {
        return products.stream()
                .max((p1, p2)->{
                    return Integer.compare(p1.getCost(), p2.getCost());
                })
                .get();
    }

}