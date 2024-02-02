package seminars.first.Shop;

import seminars.first.Calculator.Calculator;

import java.util.List;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

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

//            System.out.println(products);
//            System.out.println(shop.getMostExpensiveProduct());
//            System.out.println(shop.sortProductsByPrice());

            // Проверка на правильное количество продуктов (не должно быть пусто)
            test1(shop);

            // Проверка на верное содержимое корзины (наполение должно быть продуктами, тип Product)
            test2(shop.getProducts());

            // Проверка работы метода нахождения самого дорогого продукта getMostExpensiveProduct
            test3(shop);

            // Проверка работы метода сортировки по возрастанию sortProductsByPrice
            // каждый следующий в списке продукт должен быть дороже
            test4(shop);
        }

    private static void test1(Shop shop) {
        assertThat(shop.getProducts()).isNotEmpty();
    }

    private static <T> void test2(List<T> products) {
        for (Object item: products) {
            if (!(item instanceof Product))
                throw new AssertionError("Неверный тип продукта");
        }
    }

    private static void test3(Shop shop) {
        assertThat(shop.getMostExpensiveProduct().getCost()).isEqualTo(46);
    }

    private static void test4(Shop shop) {
        shop.sortProductsByPrice();
        List<Product> products = shop.getProducts();
        for (int i = 1; i < products.size(); i++) {
            if (products.get(i).getCost() < products.get(i-1).getCost()){
                throw new AssertionError("Не выполняется сортировка по возрастающей");
            }
        }
    }


}