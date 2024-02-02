package seminars.first.Shop;

import java.util.List;
import java.util.ArrayList;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
        public static void main(String[] args) {
            Shop shop = new Shop();

            List<Product> products = new ArrayList<>();
            products.add(new Product("Хлеб ржаной", 46));
            products.add(new Product("Булка с повидлом", 25));
            products.add(new Product("Слойка", 29));
            products.add(new Product("Хлеб белый",41));
            products.add(new Product("Пирожок с картошкой", 20));
            products.add(new Product("Батон нарезной", 30));

            shop.setProducts(products);

            System.out.println(products);
            System.out.println(shop.getMostExpensiveProduct());
            System.out.println(shop.sortProductsByPrice());
        }

}