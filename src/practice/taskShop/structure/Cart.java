package practice.taskShop.structure;

import support.Utilities;
import practice.taskShop.structure.exceptions.WrongProductNameException;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> productsListInBasket;

    public Cart() {
        this.productsListInBasket = new ArrayList<>();
    }

    public ArrayList<Product> getProductsListInTheCart() {
        return productsListInBasket;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "itemsListInTheBasket=" + productsListInBasket +
                '}';
    }

    public void showProductsInCart() {
        System.out.println("Products: ");
        int index = 1;

        for (Product product : productsListInBasket
        ) {
            System.out.println(index++ +
                    ". Name: " + product.getName() +
                    ", Price: " + product.getPrice() +
                    ", Rating: " + product.getRating());
        }
        System.out.println();
    }

    public Product getProductInCartByName() throws WrongProductNameException {
        System.out.println("Provide product name what you wanna buy");
        String productName = Utilities.getConsoleString();

        for (Product product : productsListInBasket
        ) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }

        throw new WrongProductNameException("There is no product with name: '" + productName + "'");
    }
}
