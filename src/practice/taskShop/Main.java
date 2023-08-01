package practice.taskShop;

import practice.taskShop.structure.Category;
import practice.taskShop.structure.Product;
import practice.taskShop.structure.Shop;
import practice.taskShop.structure.User;

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

        shop.getUsersList().add(new User("kirill", "TestPass"));

        books.getProductsList().addAll(Arrays.asList(
                new Product("Beginning", 100, 9.9),
                new Product("Life", 200, 8.1),
                new Product("JustDoIt", 163.9, 9.0)
        ));

        shop.menu();
    }
}
