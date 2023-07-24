package taskShop;

import taskShop.structure.Category;
import taskShop.structure.Product;
import taskShop.structure.Shop;
import taskShop.structure.User;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop();

        Category books = new Category("Books");
        Category clothes = new Category("Clothes");
        Category devices = new Category("Devices");

        shop.getCategoriesList().addAll(Arrays.asList(
                books,clothes, devices
        ));

        shop.getUsersList().add(new User("kirill1", "TestPass"));

        books.getProductsList().addAll(Arrays.asList(
                new Product("Harry Potter", 100, 9.9),
                new Product("Unfuck yourself", 200, 8.1),
                new Product("Just do it", 163.9, 9.0)
        ));

        shop.menu();
    }
}
